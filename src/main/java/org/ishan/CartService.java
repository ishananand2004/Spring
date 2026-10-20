package org.ishan;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class CartService /*implements InitializingBean */{
    Map<Integer,String> mp;

    public CartService(){
        mp=new HashMap<>();
        System.out.println("cartService constructor are called");
    }

    @PostConstruct
    public void start2(){
        System.out.println("ishan1");
    }
//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("bean are ready");
//        mp.put(1,"ishan");
//        mp.put(2,"ishita");
//    }

//    public void start(){
//        System.out.println("ishan");
//    }
    public void addtocart(){
        System.out.println("Added to the cart");
    }
}
