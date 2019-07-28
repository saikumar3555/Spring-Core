package com.axis.beans;

import java.util.HashMap;
import java.util.Map;

public class Cache {
	
	private Map<String,Double> cacheMap=new HashMap<String,Double>();
	
	
	//to put values into map
	public void put(String key,Double value) {
		cacheMap.put(key, value);
	}
	
	//to get values from map
	public Double get(String key) {
		
		return cacheMap.get(key);
	}

	@Override
	public String toString() {
		return "Cache [cacheMap=" + cacheMap + "]";
	}

}
