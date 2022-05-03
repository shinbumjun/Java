package test.auto;

public class Car {
	//protected 접근 지정자를 가진 필드, protected 안붙이면 같은 패키지에서만 
	protected Engine engine;
	
	//Engine type 을 인자로 전달 받는 생성자
	public Car(Engine engine) {
		this.engine=engine;
	}
	//메소드 
	public void drive() {
		if(this.engine==null) {
			System.out.println("Engine 이 없어서 달릴수가 없어요!");
			return; //메소드 끝내기 
		}
		System.out.println("달려요!");
	}
}






