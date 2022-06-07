package com.designpatterns.demo;

import com.designpatterns.demo.singleton.SingletonExample;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		/*SingletonExample singletonObj1 = SingletonExample.getInstance();
		SingletonExample singletonObj2 = SingletonExample.getInstance();

		System.out.println("singletonObj1 ==> " + singletonObj1);
		System.out.println("singletonObj2 ==> " + singletonObj2);

		System.out.println(singletonObj1 == singletonObj2);*/
	}

}
