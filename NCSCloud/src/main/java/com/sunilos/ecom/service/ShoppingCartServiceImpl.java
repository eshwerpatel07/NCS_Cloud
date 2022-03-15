package com.sunilos.ecom.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sunilos.common.*;
//import com.sunilos.exception.DuplicateRecordException;
import com.sunilos.common.UserContext;
import com.sunilos.ecom.dao.ShoppingCartDAOInt;
import com.sunilos.ecom.dto.ProductPriceDTO;
import com.sunilos.ecom.dto.ShoppingCartDTO;

/**
 * Session facade of Role Service. It is transactional, apply declarative
 * transactions with help of Spring AOP.
 * 
 * If unchecked exception is propagated from a method then transaction is rolled
 * back.
 * 
 * Default propagation value is Propagation.REQUIRED and readOnly = false
 * 
 * @author SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 */
@Service
@Transactional
public class ShoppingCartServiceImpl extends BaseServiceImpl<ShoppingCartDTO, ShoppingCartDAOInt>
		implements ShoppingCartServiceInt {

	private static Logger log = LoggerFactory.getLogger(ShoppingCartServiceImpl.class);

	@Transactional(readOnly = true)
	public ShoppingCartDTO findByName(String name, UserContext userContext) {
		return baseDao.findByUniqueKey("name", name, userContext);
	}


}