package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PaymentService {
//    field injection
//    @Autowired
//    public OrderService orderService;

//  constructor injection
//    @Autowired
//    public PaymentService(OrderService orderService){
//        this.orderService=orderService;
//    }

    public void pay(){
        System.out.println("pay for successfully order");
//        orderService.getOrderDetails();
    }
}
