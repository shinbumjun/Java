package test.main;

import test.mypac.Calculator;

public class MainClass06 {
	public static void main(String[] args) {
		
//		원래 모양
		Calculator c=new Calculator() {
		  @Override
		  public double exec(double a, double b) {
			  return a+b;
		  }
		};
		
//		원래 모양을 줄인 표현
		Calculator add=(double a, double b)->{ 
			return a+b; 
		};
		
//		더 간략하게
//		Calculator add=(a, b)->a+b;
		
//		자바스크립트는 add(10,20); 자바스크립트를 따라 만들었다
		add.exec(10, 20); 
		
		//위를 간략히 표현하면 아래와 같이 표현된다. 
		Calculator add2=(a, b)->a+b;
		Calculator sub=(a, b)->a-b;
		Calculator multi=(a, b)->a*b;
		Calculator divide=(a, b)->a/b;
		
		useCalculator(add);
		useCalculator(add2);
		useCalculator(sub);
		useCalculator(multi);
		useCalculator(divide);
		useCalculator((a, b)->a/b);
		
	}
	public static void useCalculator(Calculator cal) {
		double result=cal.exec(10, 20);
		System.out.println("result:"+result);
	}
}






