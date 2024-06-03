package com.zettamine.services;

import com.zettamine.EncodeAndDecode;

public class EncodeAndDecodeUsingDependency {

	public static void main(String[] args) {
		
		EncodeAndDecode obj =	new EncodeAndDecode();
		System.out.println("Encoded data "+obj.encodeData("Hello world"));
		System.out.println("Decoded data "+obj.decodeData(obj.encodeData("Hello world")));

	}

}
