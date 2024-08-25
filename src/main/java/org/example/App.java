package org.example;

import org.example.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        //Creating the container
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Programmer programmer = (Programmer) context.getBean("programmer");
//        Laptop laptop = (Laptop) context.getBean("laptopNew");
//
//        programmer.code();
////        laptop.compile();
//        System.out.println(laptop.getBrand());

//    }

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Cpu cpu = context.getBean("cpu",Cpu.class);
        cpu.execute();

        MotherBoard motherBoard = context.getBean("motherBoard",MotherBoard.class);
        motherBoard.boot();
    }
}
