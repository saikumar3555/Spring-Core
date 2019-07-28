package com.amazon.beans;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.amazon.beans.Address;
import com.amazon.beans.BlueCartServiceImpl;
import com.amazon.beans.DtDcServiceImpl;
import com.amazon.beans.Order;

public class AmazonOrderService implements ApplicationContextAware {
	
	private IDeliveryService deliveryService =null;
	private ApplicationContext applicationContext=null;
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext=applicationContext;
		
	}




	public void placeOrder(Order order,Address address) {
		//logic
		System.out.println("Order confirmed...!");
		
		int zip=address.getZip();
		if(zip>=500080) {
			deliveryService	=applicationContext.getBean("blueCart",BlueCartServiceImpl.class);
			//deliveryService.deliver();
		}else {
			deliveryService	=applicationContext.getBean("dtdc",DtDcServiceImpl.class);
			//dtdcService.deliver();
		}//else
		deliveryService.deliver();	
	}

	
	
	
	 
	
	//if we use aware interfaces ,concept there is no need of writeing these below lines
	/*private IDeliveryService blueCartService;
	private IDeliveryService dtdcService;
	public IDeliveryService getBlueCartService() {
		return blueCartService;
	}
	public void setBlueCartService(IDeliveryService blueCartService) {
		this.blueCartService = blueCartService;
	}
	public IDeliveryService getDtdcService() {
		return dtdcService;
	}
	public void setDtdcService(IDeliveryService dtdcService) {
		this.dtdcService = dtdcService;
	}*/

}//class
