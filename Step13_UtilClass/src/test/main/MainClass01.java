package test.main;

import java.util.Scanner;

public class MainClass01 {
	public static void main(String[] args) {
		/*
		 *  키보드로 부터 문자열을 입력 받기 위한 Scanner 객체를 생성한다.
		 *  생성자의 인자로는 키보드로 부터 입력 받을수 있는 InputStream type 
		 *  객체를 전달해 주어야 한다. 
		 *  해당객체는 System 클래스에 static final 상수 in 이라는 필드에
		 *  참조값이 미리 준비 되어 있으므로 그값을 생성자에 전달하면 된다. 
		 */
		Scanner scan=new Scanner(System.in);
//		new Scanner 생성자 총 10개 - 2번째
//		inputStream source= System.in
//		scan. 원하는 메소드 선택해서 사용
		
		//콘솔창을 여는 용도로 문자열을 한줄 출력해 준다.
		System.out.println("문자열 입력:");
		//콘솔로 부터 문자열 한줄 입력 받기
		String line=scan.nextLine();
		System.out.println("입력한 내용:"+line);
//		System.out.println("main 메소드가 종료 됩니다.");
	}
}
