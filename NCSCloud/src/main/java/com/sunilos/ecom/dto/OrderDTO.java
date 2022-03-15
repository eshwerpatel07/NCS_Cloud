package com.sunilos.ecom.dto;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.sunilos.common.BaseDTO;

/**
 * OrderManagement POJO class. It is persistent object.
 * 
 * @author SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 */

@Entity
@Table(name = "NCS_ORDERMANAGEMENT")
public class OrderDTO extends BaseDTO {
	
		
//	@ManyToOne
//	@Column(name = "ORDER_NO")
//	protected OrderNoDTO orderNo;
	
	
//	public OrderNoDTO getOrderNo() {
//		return orderNo;
//	}
//
//	public void setOrderNo(OrderNoDTO orderNo) {
//		this.orderNo = orderNo;
//	}
	

	
	@Column(name = "ORDER_ID", length = 50)
	protected long orderId;
	@Column(name = "TOTAL_PRICE", length = 50)
	public Long total_price;
	@Column(name = "QUANTITY", length = 50)
	public long quantity;
	@Column(name = "DISCOUNT", length = 50)
	public String discount;
	@Column(name = "DESCRIPTION", length = 50)
	public String description;
	
	
		

	
	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public Long getTotal_price() {
		return total_price;
	}

	public void setTotal_price(Long total_price) {
		this.total_price = total_price;
	}

	

	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("orderId", "desc");
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("orderId", orderId);
		return map;
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return orderId+"";
	}

}
