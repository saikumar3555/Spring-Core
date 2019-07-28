package com.adobe.beans;

public class XmlFormattedMsg implements IMsgFormatter {

	public String format(String msg) {
		String formattedMsg ="XML:: "+msg+" ::XML";
		return formattedMsg;
	}

}
