package org.ishan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);

//        OrderService order=context.getBean(OrderService.class);
//        order.placeOrder();

        CartService cartservice=context.getBean(CartService.class);
        cartservice.addtocart();

//        for destroying bean this close method is called and this close method is presnet in the child interface of ApplicationContext
//         the child interface named is ConfigurableApplicationContext
        context.close();
    }
}
