package test.main;

import test.war.Marine;
import test.war.Pentagon;

public class test {
    public static void main(String[] args) {
    	   Pentagon.startWar();
    	   
    	   Marine m = new Marine();
    	   m.move();
    	   m.attack();
    	   
    	   Pentagon.endWar();
		
	}
} 
