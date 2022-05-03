package test.string;

public class MainClass {
	public static void main(String[] args) {
		
		//name1, name2 같은 id=16
		String name1="김구라";
		String name2="김구라";
		
		//String 참조 데이터 타입
		//name3, name4는 다른 id 값을 가짐
		String name3=new String("김구라");
		String name4=new String("김구라");
		
		System.out.println(name1);
		System.out.println(name3);
		
		//문자열이 같은지 비교하려면 == 은 안됨
		//String type의 참조값 비교
		boolean result1 = name1 == name2; //true
		boolean result2 = name1 == name3; //false
		
		//*String type의 문자열 내용 비교
		boolean result3 = name1.equals(name2); //true
		boolean result4 = name1.equals(name3); //true
		boolean result5 = name3.equals(name4); //true
		
		boolean result6 = "김구라".equals(name1);
		boolean result7 = name1.equals("김구라");
		
	}
	
}
