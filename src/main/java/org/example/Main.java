package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String []args) {
//        IOC container ko up karo basically using annotation based configuration and rules are given in the AppConfig
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);

        OrderService orderService=context.getBean(OrderService.class);
        orderService.order();


        User user=context.getBean(User.class);
        System.out.println(user.getName()+" "+user.getAge());
    }
}
