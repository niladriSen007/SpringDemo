package org.example;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan
public class MotherBoard {
    public MotherBoard() {
        System.out.println("MotherBoard constructor");
    }
    public void boot() {
        System.out.println("MotherBoard booting");
    }
}
