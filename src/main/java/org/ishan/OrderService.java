package org.ishan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
    private PaymentService paymentService;
    @Autowired
    public OrderService(PaymentService paymentService){
        this.paymentService=paymentService;
    }

    public void placeOrder(){
        System.out.println("placed order");
        paymentService.pay();
    }

}
