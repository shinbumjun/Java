package test.dept.dto;

//부서 하나의 정보를 담을 dto 클래스 설계
public class DeptDto {
	
	//필드
	private int num;
	private String name;
	private String addr;
	
	//디폴트 생성자
	public DeptDto() {}

	//자동생성
	public DeptDto(int num, String name, String addr) {
		super();
		this.num = num;
		this.name = name;
		this.addr = addr;
	}

	//자동생성
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	
	
	

	
		
	
	
}
