package test.mypac;

// 그때 그때 다른 타입으로 <a>
public class FruitBox<a> {
	
	public a item; //필드의 타입
	
	public void setItem(a item) { //매개변수의 타입
		this.item=item;
	}
	
	public a getItem() { //메소드의 타입
		
		return this.item;
	}
}
