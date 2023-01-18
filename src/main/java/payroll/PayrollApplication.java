package payroll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//Believe it or not, this(post interface  and object defining) is enough to launch an application! A Spring Boot application is,
//		at a minimum, a public static void main entry-point and the @SpringBootApplication annotation

//We need data to make this interesting so I will create a class for loading data automatically by Spring

//@SpringBootApplication fires up a servlet container and serves up our service

@SpringBootApplication
public class PayrollApplication {

	public static void main(String[] args) {

		SpringApplication.run(PayrollApplication.class, args);

	}

}
