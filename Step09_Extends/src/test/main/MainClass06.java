package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;
import test.mypac.SmartPhone;

public class MainClass06 {
	//실행순서가 시작되는 특별한 main 메소드
	public static void main(String[] args) {
		//usePhone() 메소드를 호출하는 코드를 아래에 작성해 보세요.
		MainClass06.usePhone(new Phone());
		MainClass06.usePhone(new HandPhone());
		usePhone(new SmartPhone()); //동일한 클래스안에 있으면 클래스명 생략가능
	}
	//Phone type 을 인자로 전달 받는 static 메소드 
	public static void usePhone(Phone p) {
		//인자로 전달되는 참조값을 이용해서 메소드 호출하기 
		p.call();
	}
}




