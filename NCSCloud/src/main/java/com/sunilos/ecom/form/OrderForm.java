package com.sunilos.ecom.form;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javax.validation.constraints.NotEmpty;

import com.sunilos.common.BaseDTO;
import com.sunilos.common.BaseForm;
import com.sunilos.ecom.dto.OrderDTO;

/**
 * Contains Role form elements and their declarative input validations.
 * 
 * @author SunilOS
// * @version 1.0
 * @Copyright (c) SunilOS
 * 
 */

public class OrderForm extends BaseForm {

	
	
	
	
	

//	public OrderNoDTO getOrderNo() {
//		return orderNo;
//	}
//
//	public void setOrderNo(OrderNoDTO orderNo) {
//		this.orderNo = orderNo;
//	}
	
	

protected long orderId;
	
	public Long total_price;
	
	public long quantity;
	
	public String discount;
	
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
	public BaseDTO getDto() {
		OrderDTO dto = initDTO(new OrderDTO());
		dto.setOrderId(orderId);
		dto.setTotal_price(total_price);
		dto.setQuantity(quantity);
		dto.setDiscount(discount);
		dto.setDescription(description);

		
		
		return dto;
	}

	@Override
	public void populate(BaseDTO bDto) {
		super.populate(bDto);
		OrderDTO dto = (OrderDTO) bDto;

	}
}
