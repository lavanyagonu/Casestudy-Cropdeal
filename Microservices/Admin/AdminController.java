package com.casestudy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class AdminController {
		@GetMapping("/Admin")
		public String Admin()
		{
			return "hello-world Admin";
			
		}
		}

