# Basics of Spring Core

1. Spring-core -> All the bean factory is defined.
2. spring-context -> Application Context is defined.

If we want an application without Spring boot, we need to remove the below 

        <parent>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-parent</artifactId>
            <version>1.5.9.RELEASE</version>
            <relativePath/> <!-- lookup parent from repository -->
        </parent>
        
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-rest</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>

and add the below dependencies

        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-core</artifactId>
            <version>4.3.9.RELEASE</version>
        </dependency>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-context</artifactId>
            <version>4.3.9.RELEASE</version>
        </dependency>
        <dependency>
            <groupId>org.slf4j</groupId>
            <artifactId>slf4j-api</artifactId>
            <version>1.7.25</version>
        </dependency>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.12</version>
        </dependency>
        
        
and the below in the main class

    import org.springframework.context.ApplicationContext;
    import org.springframework.context.annotation.AnnotationConfigApplicationContext;
    import org.springframework.context.annotation.ComponentScan;
    import org.springframework.context.annotation.Configuration;
    
    @Configuration
    @ComponentScan
    public class SpringIn5EasyStepsApplication {
    
    	public static void main(String[] args) {
    		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(DemoApplication.class);
    		SearchAlgorithm sa = context.getBean(BinarySearch.class);
            SearchAlgorithm sa1 = context.getBean(BinarySearch.class);
            System.out.println(sa == sa1);
    
            int index = sa.search(ArrayBuilder.getArrayBuilder(),10);
            System.out.println("Arun did you miss me ..."+index);
    	}
    }
    
and remove the below

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
