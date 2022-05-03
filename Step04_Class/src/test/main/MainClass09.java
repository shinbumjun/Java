package test.main;

import test.mart.Computer;
import test.mart.Cpu;
import test.mart.HardDisk;
import test.mart.Memory;

public class MainClass09 {
	public static void main(String[] args) {
		/*
		 *  [ 프로그래밍의 목적 ]
		 *  
		 *  test.mart 페키지 안에 있는 클래스를 활용해서...
		 *  
		 *  1. 게임을 한다.
		 *  2. oli999@naver.com 으로 이메일을 보낸다.
		 */
		
		//첫번째
		Computer com1=new Computer(new Cpu(), new Memory(), new HardDisk());
//		com1.playGame(); 게임을 해요!
		com1.sendEmail("oli999@naver.com");
		
		Cpu c=new Cpu();
		Memory m=new Memory();
		HardDisk h=new HardDisk();
		
		
		//두번째
		Computer com2=new Computer(c, m, h);
//		com2.playGame(); 게임을 해요!
		com2.sendEmail("sbj-tv@daum.net");
	}
}












