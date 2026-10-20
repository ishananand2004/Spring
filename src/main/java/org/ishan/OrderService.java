package org.ishan;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
//by default singleton rhta h phele se

@Scope("singleton")
//@Scope("prototype")
public class OrderService {
    public OrderService(){
        System.out.println("order service created");
    }
    public void placeOrder(){
        System.out.println("order placed");
    }
}
