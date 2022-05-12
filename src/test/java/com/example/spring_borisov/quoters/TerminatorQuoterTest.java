package com.example.spring_borisov.quoters;

import com.example.spring_borisov.config.JavaConfig;
import com.example.spring_borisov.quoters.intefrace.Quoter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class TerminatorQuoterTest {

    Quoter quoter;

    @BeforeEach
    void setUp() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        quoter = context.getBean(Quoter.class);
    }

    @Test
    void sayQuote() {
        quoter.sayQuote();

    }

}