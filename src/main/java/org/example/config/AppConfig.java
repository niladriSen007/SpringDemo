package org.example.config;

import org.example.Cpu;
import org.example.MotherBoard;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("org.example")
public class AppConfig {

//    @Bean(name = "cpuName")
//    @Scope("prototype")
//    public Cpu cpu() {
//        return new Cpu();
//    }
//
//    @Bean(name = "motherBoardName")
//    @Scope("singleton")
//    public MotherBoard motherBoard() {
//        return new MotherBoard();
//    }
}
