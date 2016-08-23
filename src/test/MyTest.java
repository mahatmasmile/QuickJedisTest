package test;

import junit.framework.TestCase;

public class MyTest extends TestCase {
	public static final String key = "mahatma.test";
	public static UserInfo userInfo;

	public MyTest(String name) {
		super(name);

		System.out.println("MyTest(name)");

		userInfo = new UserInfo();
		userInfo.setName("mahatma");
		userInfo.setAge(18);
		userInfo.setIsMale(true);
	}

	public MyTest() {
	}

}
