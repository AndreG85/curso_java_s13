package secao13_exemplo1;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		
		Order order = new Order(1080, new Date(), OrderStatus.pending_payment);
		
		System.out.println(order);
		
		OrderStatus os1 = OrderStatus.delivered;
		OrderStatus os2 = OrderStatus.valueOf("delivered");
		
		System.out.println(os1);
		System.out.println(os2);

	}

}
