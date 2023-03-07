package com.simplecalculator.app;

import org.springframework.web.bind.annotation.GetMapping;


import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/calculator/add")
	public String calculate_add(@RequestParam(value="y1",required=true,defaultValue="1")int y1,
			@RequestParam(value="y2",required=true,defaultValue="2")int y2)//take parameter from method calculate_add
	{
		
		return "<h1> The sum is "+CalculatorLogic.addNo(y1, y2)+"</h1>";//call addNo() method
	}
	@GetMapping("/calculator/sub")
	public String calculate_sub(@RequestParam(value="y1",required=true,defaultValue="1")int y1,
			@RequestParam(value="y2",required=true,defaultValue="2")int y2)//take parameter from method calculate_sub
	{
		
		return "<h1> The substraction is "+CalculatorLogic.subNo(y1, y2)+"</h1>";//call subNo() method
	}
	@GetMapping("/calculator/mul")
	public String calculate_mul(@RequestParam(value="y1",required=true,defaultValue="1")int y1,
			@RequestParam(value="y2",required=true,defaultValue="2")int y2)//take parameter from method calculate_mul
	{
		
		return "<h1> The multiplication is "+CalculatorLogic.mulNo(y1, y2)+"</h1>";//call mulNo() method
	}
	@GetMapping("/calculator/div")
	public String calculate_div(@RequestParam(value="y1",required=true,defaultValue="1")int y1,
			@RequestParam(value="y2",required=true,defaultValue="2")int y2)//take parameter from method calculate_div
	{
		
		return "<h1> The Division is "+CalculatorLogic.divNo(y1, y2)+"</h1>";//call divNo() method
	}

}
