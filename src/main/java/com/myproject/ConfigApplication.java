package com.myproject;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath*:applicationContext.xml")
public class ConfigApplication {

}
