package com.assingmenet10;

public class Elseifladder {
	public static void main(String[] args) {
		int n=15,p=0;
		if(n==0||n==1) {
			System.out.println(n+" is not prime number");
		}
		else {
			
		for(int i=1;i<n;i++){
			if(n%i==0){
		
		
			System.out.println(n+" is not prime number");
			}
			p=1;
			break;
			}
		}
		 if(n==2||p==0) {
			System.out.println(n+" is the prime number");
		}
	}

}
