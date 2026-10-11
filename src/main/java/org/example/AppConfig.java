package org.example;

import org.example.payment.CardPayment;
import org.example.payment.PaymentService;
import org.example.payment.UpiPayment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("org.example")
public class AppConfig {
    @Bean
    public User createUser(){
        return new User("Ishan",21);
    }

    @Bean
//    @Primary
    @Qualifier
    public PaymentService cardPayment(){
        return  new CardPayment();
    }

    @Bean
//    @Primary
    @Qualifier
    public PaymentService upiPayment(){
        return new UpiPayment();
    }

    @Bean
    public OrderService orderService(@Qualifier("upiPayment") PaymentService paymentService){
        return new OrderService(paymentService);
    }
}
