package test.main;

import test.mypac.Car;

/*
 *   프로그래밍의 목적이 "달리기" 라면? 
 *   목적을 달성해 보세요.
 */

public class MainClass02 {
	public static void main(String[] args) {
		//Car 객체를 생성해서 참조값을 car1 이라는 지역 변수에 담기
		Car car1=new Car(); //참조값을 변수에 담아두고 
		//car1 안에 들어있는 참조값을 이용해서 drive() 메소드 호출하기
		car1.drive(); //필요할때 마다 .찍어서 쓴다
		//car1 안에 들어있는 참조값을 이용해서 name 이라는 필드에 String type 참조값 넣어주기
		car1.name="프라이드";
		//car1 안에 들어있는 참조값을 이용해서 cc 라는 필드에 int type value 넣어주기
		car1.cc=1000;
		
		Car car2=new Car();
		car2.drive();
		car2.name="소나타";
		car2.cc=2000;
		
	}
}






