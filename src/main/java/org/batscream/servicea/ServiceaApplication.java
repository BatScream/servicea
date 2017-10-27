package org.batscream.servicea;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@RestController
public class ServiceaApplication {
	
	@Value("${test.property:default}")
	private String name ;

	@RequestMapping("/")
	public String test() {
		return "Hello " + name;
	}

	public static void main(String[] args) {
		SpringApplication.run(ServiceaApplication.class, args);
	}
}
