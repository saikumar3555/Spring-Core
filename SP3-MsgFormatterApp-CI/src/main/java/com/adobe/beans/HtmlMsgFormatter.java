package com.adobe.beans;

public class HtmlMsgFormatter implements IMsgFormatter {

	public String format(String msg) {
		String formattedMsg ="Html:: "+msg+" ::Html";
		return formattedMsg;
	}

}
