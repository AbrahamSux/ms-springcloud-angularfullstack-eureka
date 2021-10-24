package com.sux.eureka.ms.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MsSpringcloudAngularfullstackEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsSpringcloudAngularfullstackEurekaApplication.class, args);
	}

}
