package test.main;

import java.util.ArrayList;
import java.util.List;

import test.mypac.Car;

public class MainClass071 {
     public static void main(String[] args) {
    	 /*
 		 *  1. Car type 의 참조값을 담을수 있는 ArrayList 객체를 생성해서
 		 *     ArrayList 객체의 참조값을 cars 라는 이름의 지역 변수에 담아 보세요.
 		 *  
 		 *  2. new Car("차의이름") 과 같은 형식으로 Car 객체를 3 개 생성해서
 		 *     cars 에 들어있는 참조값을 이용해서 배열에 참조값을 담아 보세요.
 		 *     
 		 *  3. 반복문 돌면서 cars 안에 들어 있는 Car 객체의 참조값을 하나씩 순서대로 
 		 *     참조해서 .drive() 메소드를 호출해 보세요.
 		 *     
 		 *  ( 저는 콘솔창에 무언가를 출력하라고 하지 않았습니다. .drive() 메소드를 
 		 *    호출하라고 했습니다! )
 		 */
    	 
    	 List<Car> cars = new ArrayList<Car>();
    	 
    	 cars.add(new Car("내차"));
    	 cars.add(new Car("니차"));
    	 cars.add(new Car("우리차"));
 
//    	 Car c1=new Car("아반떼");
//    	 Car c2=new Car("그렌져");
//    	 Car c3=new Car("슈퍼카");
//    	 cars.add(c1);
//    	 cars.add(c2);
//    	 cars.add(c3);

    	 //첫번째
    	 for(int i = 0; i<cars.size(); i++) {
    		 Car tmp=cars.get(i);
    		 tmp.drive();
    	 }
    	 System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
    	 //두번째
    	 for(Car tmp : cars)
    		 tmp.drive();    	 
	}  
}












