package com.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="api")
public class HelloContoller {
	
	@RequestMapping("/hello")
	@ResponseBody
	public String hello() {
		System.out.println("WEL COME TO SPRING WEB ");
		return "WEL COME TO SPRING WEB ";
	}

}
