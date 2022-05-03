package test.main;

import test.mypac.EmpDto;

public class test2 {
     public static void main(String[] args) {
		
    	 EmpDto i = new EmpDto();
    	 i.setEmpno (1);
    	 i.setEname("신범준");
    	 i.setJob("개발자");
    	 i.setSal(100000000);
    	 
    	 EmpDto i2 = new EmpDto(1, "신범준", "개발자",100000000);
	}
}
