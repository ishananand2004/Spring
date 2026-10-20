package org.ishan;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("org.ishan")
public class AppConfig {

//    yeek hi object per bean definition create or exist karta h

    @Bean
    public OrderService order1(){
        return new OrderService();
    }

    @Bean
    public OrderService order2(){
        return new OrderService();
    }
}
