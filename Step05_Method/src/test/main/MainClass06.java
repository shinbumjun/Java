package test.main;

import java.util.Random;

public class MainClass06 {
    public static void main(String[]args){
    	Random ran=new Random();
    	  for(int i=0; i<100; i++) {
    	  // 1 ~ 45 사이의 랜덤한 정수를 하나 얻어내서 콘솔창에 출력하는 프로그래밍을 해 보세요.
    	  int ranNum=ran.nextInt(41)-20; //
    	  System.out.println(ranNum); //
    	  }
    }

}
