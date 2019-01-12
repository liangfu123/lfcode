package com.tsjg.core.web;

import java.util.UUID;

public class GetUuid {
	public static String getuuid(){
		String uuid = UUID.randomUUID().toString();
		return uuid.replaceAll("-", "");
	}
}
