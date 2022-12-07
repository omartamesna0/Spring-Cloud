package org.sid.customerservice;

import org.sid.customerservice.entities.Customer;
import org.sid.customerservice.respository.CustomerRepostory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class CustomerServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(CustomerServiceApplication.class, args);
	}
	@Bean
	CommandLineRunner start(CustomerRepostory CustomerRepostory){
		return args -> {

			CustomerRepostory.save(new Customer(null,"Mohamed","med@gmail.com" ));
			CustomerRepostory.save(new Customer(null,"salim","salim@gmail.com" ));
			CustomerRepostory.save(new Customer(null,"omar","omar@gmail.com" ));
			CustomerRepostory.findAll().forEach(c->{
				System.out.println(c.getEmail());
			});
		};
	}
}
