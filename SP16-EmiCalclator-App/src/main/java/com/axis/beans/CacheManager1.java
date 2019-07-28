package com.axis.beans;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;



public class CacheManager1 {
	private Cache cache=null;
	
	public CacheManager1(Cache cache)   {
		this.cache=cache;
		try {
			//reading properties file
			FileInputStream fis=new FileInputStream("Axis_ri.properties");
			
			Properties p=new Properties();
			
			//loading properties file
				try {
					p.load(fis);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println(p);
				
				//storing values into cache map
				Set<Object> keys=p.keySet();
				
				for(Object key:keys) {
					Double value=Double.parseDouble((String) p.get( key));
					cache.put((String)key, value);
					
				}
				System.out.println(cache);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}//contructor
	
	

}
