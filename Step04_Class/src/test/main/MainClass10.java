package test.main;

import test.emp.EmpDto;

public class MainClass10 {
    public static void main(String[] args) {
    	//1
		EmpDto dto=new EmpDto();
		dto.setEmpno(7839);
		dto.setEname("KING");
		dto.setJob("PRESIDENT");
		dto.setSal(5000);
		
		//2
		EmpDto dto2=new EmpDto(7839, "KING", "PRESIDENT", 5000);
	}
}
