package test.main;

import test.mypac.SmartPhone;

public class MainClass04 {
	public static void main(String[] args) {
		SmartPhone p1=new SmartPhone();
		p1.call(); //Phone
		p1.mobileCall(); //HandPhone
		p1.takePicture(); //HandPhone
		p1.doInternet(); //SmartPhone
	}
}
