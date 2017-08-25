package com.kyle;

import java.net.URL;

import org.eclipse.jgit.transport.SshSessionFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigServerApplication {

    public static void main(String[] args) {
        
    	SpringApplication.run(ConfigServerApplication.class, args);
    
    }

}