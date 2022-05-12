package com.example.spring_borisov.quoters;

import com.example.spring_borisov.config.JavaConfig;
import com.example.spring_borisov.quoters.intefrace.Quoter;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        Quoter bean = context.getBean(Quoter.class);
        int count = 0;
        while (count != 4) {
            Thread.sleep(1000);
            bean.sayQuote();
            count++;
        }
    }

}