package com.convert_xml_to_json.service;

import java.util.Base64;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;
import org.springframework.stereotype.Service;

import com.convert_xml_to_json.dto.User;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@Service
public class ConversionService {

	
	public String convertToJson(String xml) {
		String jsonString="";
		User user=null;
		try {
		String decodeString=decode(xml);
		System.out.println(decodeString);
		JSONObject json = XML.toJSONObject(decodeString); 
		Gson gson = new GsonBuilder().create();
		jsonString = json.toString();
		 user=gson.fromJson(jsonString, User.class);
		System.out.println(user);

		jsonString=gson.toJson(user);
		
		
		
	}catch (JSONException e) {  
		// TODO: handle exception  
		System.out.println(e.toString());  
		} 
		return jsonString;
	}
	
	
	
	 private  String decode(String input) {

	      byte[] decodedBytes = Base64.getDecoder().decode(input);
	      return new String(decodedBytes);

	  }
}
