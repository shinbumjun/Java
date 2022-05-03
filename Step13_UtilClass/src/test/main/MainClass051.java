package test.main;

import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

public class MainClass051 {
	public static void main(String[] args) {
	/*  1. 문자열을 저장할수 있는 ArrayList 객체를 생성하고
	 *  2. Scanner 객체를 이용해서 친구 이름을 반복문 돌면서 5개 입력 받아서 
	 *     위에서 생성한 ArrayList 객체에 순서대로 저장을 하세요.
	 *  3. ArrayList 객체에 저장된 내용을 반복문 돌면서 순서대로 아래와 같은 형식으로 
	 *     콘솔창에 출력해 보세요.
	 *     
	 *  0 번째 친구 이름 : 김구라
	 *  1 번째 친구 이름 : 해골
	 *  2 번째 친구 이름 : 원숭이
	 *  3  .
	 *  4  .
	 */
      List<String> n1= new ArrayList<>();
      Scanner n2 = new Scanner(System.in);
      
      for(int i=0; i<5; i++) {
    	  System.out.println("친구 이름을 입력하세요!");
    	  String n3 =n2.nextLine(); //입력한것 한줄로 가져오기
    	  n1.add(n3);
      }
      for(int i=0; i<n1.size(); i++){
    	  System.out.println(i+1 +" 번째 친구 이름 : "+ n1.get(i));
      }

	}
}
