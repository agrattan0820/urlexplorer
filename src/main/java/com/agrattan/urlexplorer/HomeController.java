package com.agrattan.urlexplorer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
  @GetMapping("/")
	 String home() {
		 return "This is still a string";
	 }
}
