package test.emp;

public class EmpDto {
      
	//사원번호를 담을 필드
	private int empno;
	//사원이름
	private String ename;
	//직책
	private String job;
	//봉급
	private int sal;
	
	//기본 생성자
	public EmpDto() {}
	
	//인자로 모든 필드의 값을 전달 받는 생성자
	public EmpDto(int empno, String ename, String job, int sal) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.sal = sal;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}
	
	
	
		
}
