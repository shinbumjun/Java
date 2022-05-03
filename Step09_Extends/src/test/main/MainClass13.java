package test.main;

import test.mypac.HandPhone;
import test.mypac.SmartPhone;
import test.mypac.Phone;

public class MainClass13 {
	public static void main(String[] args) {
		
		HandPhone p1 = new HandPhone() {
			@Override
			public void takePicture() {
				System.out.println("1000만 화소의 사진을 찍어요");
			}
			public void test() {}
		};
			
		
		
//		new Phone() {
//			public void mobileCall() {
//				System.out.println("이동중에 전화를 걸어요");
//			}
//		}.mobileCall();
		
		//다형성 확인
		//SmartPhone p1=new SmartPhone();
		//Phone() 생성자 호출됨
		//HandPhone() 생성자 호출됨
		//SmartPhone() 생성자 호출됨
		
		//HandPhone p2=new SmartPhone();
		//Phone p3=new SmartPhone();
		
		//Object p4=new SmartPhone();
		//type casting(형변환) 캐스팅(확실할 때 만)
		//SmartPhone p5=(SmartPhone)p4;
		
		
		//new HandPhone();
		//Phone() 생성자 호출됨
		//HandPhone() 생성자 호출됨
	}

}
