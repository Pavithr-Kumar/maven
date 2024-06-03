package com.zettamine;


public class MainClass {
public static void main(String[] args) {
		
		EncodeAndDecode obj =	new EncodeAndDecode();
		System.out.println("Encoded data "+obj.encodeData("Hello world"));
		System.out.println("Decoded data "+obj.decodeData(obj.encodeData("Hello world")));

	}

}
