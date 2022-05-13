package com.example.spring_borisov.screen_saver.config;

import com.example.spring_borisov.screen_saver.ColorFrame;
import org.springframework.context.annotation.*;

import java.awt.*;
import java.util.Random;

@Configuration
@ComponentScan(basePackages = "com.example.spring_borisov.screen_saver")
public class JavaConfig {

    @Bean
    @Scope("prototype")
    public Color color() {
        Random random = new Random();
        return new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
    }

    @Bean
    public ColorFrame colorFrame() {
        return new ColorFrame() {
            @Override
            protected Color getColor() {
                return color();
            }
        };
    }

    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        int count = 0;
        while (count != 100) {
            context.getBean(ColorFrame.class).showOnRandomPlace();
            Thread.sleep(100);
            count++;
        }
    }

}