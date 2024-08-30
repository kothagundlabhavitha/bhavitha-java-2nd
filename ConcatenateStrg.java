package javaArrayStringTest;

public class ConcatenateStrg {

	public static void main(String[] args) {
     String str1="Hello";
     String str2="World";
     int uppercasecount1 =0;
     int lowercasecount1 =0;
     int uppercasecount2 =0;
     int lowercasecount2 =0;
     String concatString=str1+" "+str2;
     System.out.println("concatenated String "+concatString);
     for(char c:str1.toCharArray()) {
    	 if(Character.isUpperCase(c)) {
    		 uppercasecount1++;
    	 }else if(Character.isLowerCase(c)) {
    		 lowercasecount1++;
    	 }
     }
     for(char c:str2.toCharArray()) {
    	 if(Character.isUpperCase(c)) {
    		 uppercasecount2++;
    	 }else if(Character.isLowerCase(c)) {
    		 lowercasecount2++;
	}
    	 
     }
     System.out.println(uppercasecount1);
     System.out.println(lowercasecount1);
     System.out.println(uppercasecount2);
     System.out.println(lowercasecount2);
	}
}
