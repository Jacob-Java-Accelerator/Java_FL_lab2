package com.roczyno.fl_lab2_springproject1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FlLab2SpringProject1Application {

	public static void main(String[] args) {
		var context = SpringApplication.run(FlLab2SpringProject1Application.class, args);
		MessagePrinter messagePrinter = context.getBean(MessagePrinter.class);
		messagePrinter.printMessage();
	}

}
