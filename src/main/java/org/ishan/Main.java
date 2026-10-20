package org.ishan;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

//        OrderService order = context.getBean(OrderService.class);
//        OrderService order2 = context.getBean(OrderService.class);
//
//        System.out.println(order == order2);

        OrderService a = context.getBean("order1", OrderService.class);
        OrderService b = context.getBean("order1", OrderService.class);
//        OrderService order2 = context.getBean("order2", OrderService.class);
//
        System.out.println(a == b);


    }
}