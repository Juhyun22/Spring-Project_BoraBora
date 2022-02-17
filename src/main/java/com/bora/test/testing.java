package com.bora.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class testing {

	@RequestMapping("tt")
	@ResponseBody
	public String tt() {
		return "Hellllloooooo~~";
	}
}
