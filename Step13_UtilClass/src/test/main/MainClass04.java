package test.main;

import java.util.ArrayList;
import java.util.List;

public class MainClass04 {
	public static void main(String[] args) {
		//정수를 저장할 ArrayList 객체를 생성해서 참조값을 nums 라는 지역변수에 담아 보셈
		List<Integer> nums = new ArrayList<>(); //int(x) 포장해서 담아야함
		                        //객체 생성할 때는 생략 가능
		nums.add(10);
		int n1 = nums.get(0);
		int n2 = nums.size();
		Integer n3 = nums.set(0,100);
		nums.remove(0);
//		nums.add(10);
//		nums.add(20);
//		nums.add(30);
		
		//실수를 저장할 ArrayList 객체를 생성해서 참조값을 nums2 라는 지역변수에 담아 보셈
		List<Boolean> nums2 = new ArrayList<>();
		
		nums2.add(null);
		
	}
}






