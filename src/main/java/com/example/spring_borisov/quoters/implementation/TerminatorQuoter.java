package com.example.spring_borisov.quoters.implementation;

import com.example.spring_borisov.quoters.annotation.DeprecatedClass;
import com.example.spring_borisov.quoters.annotation.InjectRandomInt;
import com.example.spring_borisov.quoters.annotation.PostProxy;
import com.example.spring_borisov.quoters.annotation.Profiling;
import com.example.spring_borisov.quoters.intefrace.Quoter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@DeprecatedClass(newImpl = T1000.class)
@Profiling
@Component("terminatorQuoter")
public class TerminatorQuoter implements Quoter {

    @InjectRandomInt(min = 2, max = 7)
    private int repeat;

    @Value("I'll be back")
    private String message;

    public TerminatorQuoter() {
        System.out.println("Phase 1");
    }

    @PostConstruct
    public void init() {
        System.out.println("Phase 2");
        System.out.println(repeat);
    }

    @Override
    @PostProxy
    public void sayQuote() {
        System.out.println("Phase 3");
        for (int i = 0; i < repeat; i++) {
            System.out.println("message = " + message);
        }
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public int getRepeat() {
        return repeat;
    }

    public void setRepeat(int repeat) {
        this.repeat = repeat;
    }

}