package com.convert_xml_to_json.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.convert_xml_to_json.service.ConversionService;

@RestController
public class ConversionController {
	
	@Autowired
	private ConversionService conversionService;

	@PostMapping("convert-to-json")
	public String convertToJson(@RequestBody String xml) {
		
		return conversionService.convertToJson(xml);
	}
}
