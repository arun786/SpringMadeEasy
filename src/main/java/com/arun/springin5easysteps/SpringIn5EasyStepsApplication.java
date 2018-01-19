package com.arun.springin5easysteps;


import com.arun.springin5easysteps.service.search.BinarySearch;
import com.arun.springin5easysteps.service.search.SearchAlgorithm;
import com.arun.springin5easysteps.util.ArrayBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5EasyStepsApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringIn5EasyStepsApplication.class, args);
		SearchAlgorithm sa = context.getBean(BinarySearch.class);
		SearchAlgorithm sa1 = context.getBean(BinarySearch.class);
		System.out.println(sa == sa1);

		int index = sa.search(ArrayBuilder.getArrayBuilder(),10);
		System.out.println("Arun did you miss me ..."+index);


	}
}
