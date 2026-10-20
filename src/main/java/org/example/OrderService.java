package org.example;

import org.example.payment.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class OrderService {
//    @Autowired
    private final PaymentService paymentService;

//    Types of DI:
//   1> constructor method of DI
    @Autowired
//    public OrderService(@Qualifier("cp") PaymentService paymentService){
    public OrderService(PaymentService paymentService){
        this.paymentService=paymentService;
    }

//    2>Setter Injection:
//    @Autowired
//    public void setPaymentService(PaymentService paymentService){
//        this.paymentService=paymentService;
//    }

//    3> Field injection: which is done by annotation @Autowired in the header of instance variable of object
    public void order(){
        paymentService.pay();
        System.out.println("order placed");
    }
}
