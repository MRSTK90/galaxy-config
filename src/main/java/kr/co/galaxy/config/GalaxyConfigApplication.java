package kr.co.galaxy.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class GalaxyConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(GalaxyConfigApplication.class, args);
	}

}
