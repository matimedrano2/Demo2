package com.example.demo;

public class Fibonacci {

	public int n;
	public int n1;
	
	public Fibonacci(){}
	
	public Fibonacci(int n, int n1){
 	    this.n = n;
 	    this.n1 = n1;
	}

	int fibonacci(int n){
	    if (n>1){
	       return fibonacci(n-1) + fibonacci(n-2);   
	    }
	    else if (n==1) {   
	        return 1;
	    }
	    else if (n==0){   
	        return 0;
	    }
	    else{ 
	        System.out.println("Debes ingresar un tamaño mayor o igual a 1");
	        return -1; 
	    }
	}
	
	public void mostrarSerie(int n, int n1){
 	    for (int i = 0; i < n; i++) {
 	    	this.n=(fibonacci(i));
 	    	this.n1=(fibonacci(i-1));
	    }
 	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public int getN1() {
		return n1;
	}

	public void setN1(int n1) {
		this.n1 = n1;
	}
	
}
