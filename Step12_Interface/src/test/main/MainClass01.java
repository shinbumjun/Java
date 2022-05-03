package test.main;

import test.mypac.MyRemocon;
import test.mypac.Remocon;

public class MainClass01 {
	
	static final String name = "신범준";
	
	public static void main(String[] args) {
		
		//class에다가 작성하면 더 이상 상속 불가능 
		//필드 지역변수에다가 작성하면 더 이상 수정할 수 없도록 상수화 시킨다
		//name="사당";
		final int num=10; //(수정 불가)
		
		//단독 객체 생성 불가, *대부분 Remocon 타입으로 사용
		Remocon r1=new MyRemocon();
		
		// Remocon 인터페이스에 정의된 메소드 호출하기 
		r1.up();
		r1.down();
		// *Remocon 인터페이스에 정의된 static final 상수 참조하기 
		System.out.println(Remocon.COMPANY);
		//Remocon.COMPANY="삼성"; // final 필드임으로 수정불가 
	}
}






