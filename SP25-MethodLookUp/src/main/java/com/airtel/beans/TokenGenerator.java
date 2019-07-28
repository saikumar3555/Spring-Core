package com.airtel.beans;

public abstract class TokenGenerator {
	
	public abstract  Token getToken();
	
	//below code is uses with out lookup method concept
	
	
	/*public TokenGenerator() {
		System.out.println("TokenGenerator::constructor");
	}
	
	private Token token;

	public void setToken(Token token) {
		this.token = token;
	}
	
	public void getToken() {
		System.out.println("Token Generated");
	}*/

}//class
