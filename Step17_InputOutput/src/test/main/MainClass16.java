package test.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainClass16 {
	
	public static void main(String[] args) {
		/*  FileInputStream 객체를 이용해서
		 *  c:/myFolder/1.jpg 에서 byte 데이터를 읽어들인 다음
		 *  
		 *  FileOutputStream 객체를 이용해서 
		 *  c:/myFolder/copied.jpg 파일에 출력하기 
		 */
		//*FileInputStream type 의 참조값을 담을 지역변수 미리 만들기 
		FileInputStream fis=null;
		//*FileOutputStream type 의 참조값을 담을 지역변수 미리 만들기 
		FileOutputStream fos=null;	
		try {
			//파일로 부터 byte 알갱이를 읽어들일수 있는 객체 생성, *참조값
			fis=new FileInputStream(new File("c:/myFolder/1.jpg"));
			//파일에 byte 알갱이를 출력할수 있는 객체 생성, *참조값
			fos=new FileOutputStream(new File("c:/myFolder/copied.jpg"));
			
			//한번에 byte 알갱이 1024 개를 저장할수 있는 배열 객체 생성
			//  1024 byte 는 1 kilo byte 라고도 한다. 
			byte[] buffer=new byte[1024];
			
			while(true) {
				// byte 배열의 참조값을 read() 메소드에 전달해서 byte 데이터를 
				// 배열에 담아오고, 읽은 갯수를 리턴 받는다.
				int readedCount=fis.read(buffer);
				if(readedCount==-1) {//더이상 읽을게 없으면
					break;//반복문 탈출
				}
				//FileOutputStream  객체를 이용해서 
				//***중요 : byte 배열에 담긴 데이터를 *0번 인덱스로 부터 읽은 갯수만큼 출력한다.
				fos.write(buffer, 0, readedCount); //***0번방에서 읽은 (1024)만큼 -> 52번 출력
				System.out.println("readedCount:"+readedCount);
			}
			
			System.out.println("파일을 성공적으로 복사 했습니다.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally { // 예외가 발생하던 안하던 실행이 보장되는 블럭 
			//마무리 작업 (새로 open 한 스트림은 닫아 주어야 한다.)
			try {
				fis.close();
				fos.close();
			}catch(Exception e) {}
		}
		
	}
}




