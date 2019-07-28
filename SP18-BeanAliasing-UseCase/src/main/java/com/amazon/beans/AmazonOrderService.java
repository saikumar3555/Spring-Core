package com.amazon.beans;
import com.amazon.beans.Address;
import com.amazon.beans.BlueCartServiceImpl;
import com.amazon.beans.DtDcServiceImpl;
import com.amazon.beans.Order;

public class AmazonOrderService {
	
	private IDeliveryService blueCartService;
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
	}




	public void placeOrder(Order order,Address address) {
		//logic
		System.out.println("Order confirmed...!");
		
		int zip=address.getZip();
		if(zip>=500080) {
			blueCartService.deliver();
		}else {
			dtdcService.deliver();
		}
	}
}
