package com.yuzf.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class TxDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	// 出账
	public void giveMoney() {
		String sql = "update account set salary = salary+? where username = ?";
		jdbcTemplate.update(sql, -1000, "james");
	}

	// 进账
	public void getMoney() {
		String sql = "update account set salary = salary+? where username = ?";
		jdbcTemplate.update(sql, 1000, "harden");

	}

}
