package com.example.demo;

import java.util.HashMap;

import org.springframework.web.bind.annotation.*;
@RestController
public class helloController {
	
	@RequestMapping("/hello")
	public String hello() {
		return "hello";
	}
	@RequestMapping("/userinfo")
	public HashMap<String, String> userinfo() {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("name", "한노아");
		map.put("age", "24");
		return map;
	}
}
