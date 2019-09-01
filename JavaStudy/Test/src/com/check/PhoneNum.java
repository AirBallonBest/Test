package com.check;

public class PhoneNum {

	public static void main(String[] args) {
		
		isPhone("17701879243");

	}
	
	public static void isPhone(String phone){
		String regex = "^13\\d{9}|15\\d{9}|18\\d{9}|147\\d{8}|17\\d{9}";
		if(phone.matches(regex)){
			System.out.println("电话号码格式正确");
		}else{
			System.out.println(phone + "号码不合法");
		}
		
		
		
	}

}
