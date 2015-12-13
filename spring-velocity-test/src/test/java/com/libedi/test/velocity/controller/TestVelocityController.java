package com.libedi.test.velocity.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.libedi.test.velocity.SpringVelocityTestApplication;
import com.libedi.test.velocity.model.UserModel;
import com.libedi.test.velocity.service.VelocityService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringVelocityTestApplication.class)
public class TestVelocityController {
	
	@Autowired
	private VelocityService velocityService;
	
	@Test
	public void testGetHtmlTemplateStringByVelocity(){
		UserModel user = new UserModel();
		user.setName("박상준");
		user.setEmail("libedi@gmail.com");
		String htmlText = this.velocityService.getHtmlTemplateStringByVelocity(user);
		System.out.println(htmlText);
	}
}
