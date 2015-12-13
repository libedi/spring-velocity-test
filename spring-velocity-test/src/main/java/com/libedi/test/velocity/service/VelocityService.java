package com.libedi.test.velocity.service;

import java.util.HashMap;
import java.util.Map;

import org.apache.velocity.app.VelocityEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.velocity.VelocityEngineUtils;

import com.libedi.test.velocity.model.UserModel;

@Service
public class VelocityService {
	
	@Autowired
	private VelocityEngine velocityEngine;
	
	public String getHtmlTemplateStringByVelocity(UserModel user){
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("user", user);
		String text = VelocityEngineUtils.mergeTemplateIntoString(velocityEngine, "/index.vm", "UTF-8", model);
		return text;
	}
}
