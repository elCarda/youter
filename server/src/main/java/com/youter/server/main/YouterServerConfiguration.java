package com.youter.server.main;

import com.youter.server.mvc.HelloController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:WEB-INF/mvc-dispatcher-servlet.xml")
@EnableAutoConfiguration
public class YouterServerConfiguration {
    public static void main(String[] args) throws Exception{
        SpringApplication.run(HelloController.class, args);
    }
}
