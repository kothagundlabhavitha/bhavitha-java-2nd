package javaArrayStringTest;

public class RepeatString {

	public static void main(String[] args) {
		String inputStr="hello world";
		String outputStr ="";
		for(char c: inputStr.toCharArray()) {
			System.out.println(outputStr+=c+""+c);
		}
		System.out.println(outputStr);
	}
}
