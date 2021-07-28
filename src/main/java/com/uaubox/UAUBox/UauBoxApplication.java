package com.uaubox.UAUBox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource({
		"classpath:application-local.properties"
})
public class UauBoxApplication {

	public static void main(String[] args) {
		SpringApplication.run(UauBoxApplication.class, args);
	}

}
