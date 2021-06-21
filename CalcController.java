package io.springboot.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController {
	@RequestMapping("/add/{a}/{b}")
	public int add(@PathVariable int a,@PathVariable int b) {
		int sum=a+b;
		return sum;
	}

	@RequestMapping("/sub")
	public int sub(@RequestParam int a,@RequestParam int b) {
		int result=a-b;
		return result;
	}
	
	@RequestMapping("/mul/{a}/{b}")
	public int mul(@PathVariable int a,@PathVariable int b) {
		int result=a*b;
		return result;
	}
	
	@RequestMapping("/div")
	public int div(@RequestParam int a,@RequestParam int b) {
		int result=a/b;
		return result;
	}
}
