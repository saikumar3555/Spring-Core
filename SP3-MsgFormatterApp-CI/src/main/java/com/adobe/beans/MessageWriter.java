package com.adobe.beans;

public class MessageWriter {
	private IMsgFormatter formater=null;
	public MessageWriter(IMsgFormatter formater) {
		this.formater=formater;
		
	}
	
	public String writeMsg(String msg) {
		String result=formater.format(msg);
		return result;
		
	}

}
