package test.main;

import test.mypac.MyUtil;
import test.mypac.MyUtil.User;

public class MainClass02 {
     public static void main(String[] args) {
		User u = new MyUtil().new User(); //높은 객체가 먼저 생성이 되어야함
		u.doSomething();
	}
}
