package test.mypac;

import test.auto.Car;
import test.auto.Engine;

public class SuperCar extends Car{

	//Engine type 을 전달받는 생성자 
	public SuperCar(Engine engine) {
		//부모 생성자에 필요한 값을 전달해 주는 문법 super( )
		super(engine);
	}
	//빨리 달리는 메소드 
	public void driveFast() {
		
		if(this.engine==null) {
			System.out.println("Engine 객체가 없어서 달릴수가 없어요");
			return;//메소드 끝내기
		}
		System.out.println("엄청 빨리 달려요!");
	}
	
//	public SuperCar(Engine engine) { //자식 생성자에서 받아서 
//	//호출하기 전에 다른 자바 코드가 있으면 안됨
//	super(engine); //부모 생성자로
//	//new SuperCar(new Engine())
//}
	
}




