package com.axis.beans;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;



public class CacheManager {
	private Cache cache=null;
	
	public CacheManager(Cache cache) throws IOException  {
		this.cache=cache;
		try {
			//reading properties file
			FileInputStream fis=new FileInputStream("Axis_ri.properties");
			
			Properties p=new Properties();
			
			//loading properties file
				p.load(fis);
				
				System.out.println(p);
				
				//storing values into cache map
				Set<Object> keys=p.keySet();
				
				for(Object key:keys) {
					Double value=cache.get((String) key);
					cache.put((String)key, value);
					
				}
				System.out.println(cache);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}//contructor
	
	

}
