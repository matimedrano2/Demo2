package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class FibonacciHTTP {

	@RequestMapping("/fibonacci")
	public @ResponseBody Fibonacci fibonaccihttp (@RequestParam(value="numero", defaultValue="7") int numero) {
		
		int n1 = numero -1;
		Fibonacci f = new Fibonacci();
		f.mostrarSerie(numero,n1);
		
		return f;
		
	}
}
