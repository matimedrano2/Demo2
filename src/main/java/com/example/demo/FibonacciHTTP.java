package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class FibonacciHTTP {

	@RequestMapping("/fibonacci")
	public @ResponseBody String fibonaccihttp (@RequestParam(value="numero", defaultValue="10") int numero) {
		
		return "HOLA"+numero;
		
	}
}
