package com.yuzf.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.yuzf.dao.TxDao;

@Component
@Transactional
public class TxService {

	@Autowired
	private TxDao txDao;

	// 转账业务
	public void changeAccount() {

		txDao.giveMoney();

		int i = 1 / 0;

		txDao.getMoney();

	}

}
