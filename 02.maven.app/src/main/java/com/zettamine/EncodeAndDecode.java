package com.zettamine;

import java.util.Base64;

public class EncodeAndDecode {
	public String encodeData(String data) {
		Base64.Encoder encode = Base64.getEncoder();
		byte[] b= data.getBytes();
		String encodedData =encode.encodeToString(b);
		return encodedData;
		
	}
	
	public String decodeData(String encData) {
		Base64.Decoder decode= Base64.getDecoder();
		byte[] b =decode.decode(encData);
		return new String(b);
	}
	

}
