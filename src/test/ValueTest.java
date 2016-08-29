package test;

import junit.framework.TestCase;

public class ValueTest extends TestCase {

	public ValueTest() {
		// TODO Auto-generated constructor stub
	}

	public ValueTest(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void testDefaultVal() {
		System.out.println("testDefaultVal");
		try {
			System.out.println("int:" + int.class.cast("0"));
			System.out.println("Integer:" + Integer.class.cast(0));

			// System.out.println("long:" + (long) (0));
			System.out.println("Long:" + Long.class.cast("0"));

			System.out.println("byte:" + (byte) (0));
			// System.out.println("Byte:" + (Byte) (0));

			System.out.println("short:" + (short) (0));
			// System.out.println("Short:" + Short.class.cast(0));

			System.out.println("float:" + (float) (0));
			// System.out.println("Float:" + Float.class.cast(0));

			System.out.println("double:" + (double) (0));
			// System.out.println("Double:" + Double.class.cast(0));

			System.out.println("char:" + (char) (0));
			// System.out.println("Char:" + Charset.class.cast(0));

			System.out.println("boolean:" + (boolean) (false));
			// System.out.println("Boolean:" + Boolean.class.cast(0));
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
