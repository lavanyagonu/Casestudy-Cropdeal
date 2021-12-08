package com.casestudy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CropController {
	@GetMapping("/Crop")
	public String Crop()
	{
		return "hello-world Crop";
		
	}
	}

