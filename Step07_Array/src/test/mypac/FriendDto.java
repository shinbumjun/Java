package test.mypac;

public class FriendDto {
	
	//필드
    private int num;
    private String name;
    private String phone;
    private String gender;
    
    //디폴트 생성자
    public FriendDto() {}

    //생성자 (Source -> Generate Constructor using Fields)
	public FriendDto(int num, String name, String phone, String gender) {
		super();
		this.num = num; //0
		this.name = name; //null
		this.phone = phone; // null
		this.gender = gender; // null
	}

	//(Source -> Generate Getters and Setters)
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
    
    
}
