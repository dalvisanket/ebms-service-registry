package com.ebms.srvs_rgstry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class EbmsServiceRegistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(EbmsServiceRegistryApplication.class, args);
    }

}
