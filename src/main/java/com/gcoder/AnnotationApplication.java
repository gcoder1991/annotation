package com.gcoder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class AnnotationApplication {

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(AnnotationApplication.class, args);

		Thread.sleep(5000);

	}
}
