package com.yuzf.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yuzf.config.SpringConfig;
import com.yuzf.service.TxService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=SpringConfig.class)
public class TxTest {

	@Autowired
	private TxService txService;
	
	@Test
	public void test() {
		txService.changeAccount();
	}
}
