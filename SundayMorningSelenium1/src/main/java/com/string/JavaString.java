package com.string;

public class JavaString {
	
public static void main(String[] args) {
	
	String MyName =new String("United States Of America");
	System.out.println(MyName.length());
	int a=1;
	for(int i =0; i<MyName.length();i++) {
		if (MyName.charAt(i)=='e') {
			System.out.println(MyName.charAt(i)+"="+a);
			
		}
		
	}
			
	
	
	
	
	
}
	

}
