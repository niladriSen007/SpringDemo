package org.example;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan
public class Cpu {
    public Cpu() {
        System.out.println("CPU constructor");
    }
    public void execute() {
        System.out.println("I am executing");
    }
}
