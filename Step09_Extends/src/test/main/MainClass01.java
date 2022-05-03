package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;

public class MainClass01 {
	// run 했을때 application 의 시작점 도입점이 되는 main 메소드 
	public static void main(String[] args) {
		Phone p1=new Phone(); 
		//Phone() 생성자 호출됨
		HandPhone p2=new HandPhone();
		//Phone() 생성자 호출됨
		//HandPhone() 생성자 호출됨

		//부모클래스(Phone)에 정의된 메소드 호출가능
		p2.call(); //전화를 걸어요!
		//자식클래스(HandPhone)에 추가된 메소드는 당연히 호출가능
		p2.mobileCall(); //이동중에 전화를 걸어요
		p2.takePicture(); //30만 화소의 사진을 찍어요
	}
}





