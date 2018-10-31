package com.example;

import java.util.Calendar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimeController {

	@GetMapping("/time")
	public String time() {
		return Calendar.getInstance().getTime().toString();
	}
}
