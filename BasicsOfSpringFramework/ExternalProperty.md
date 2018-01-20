# To Configure external Property

1. Create a yaml file in resources folder, as below

    
        spring:
          profiles:
            active: dev
        
        ---
        spring:
          profiles: local
          data:
              name: tcrmd00
              username: root
              password: root
              url: jdbc:mysql://localhost:3306/tcrmd00
              driver: com.mysql.jdbc.Driver
        
        ---
        spring:
          profiles: dev
          data:
            name: dev001
        

2. create a config file which reads the below data.

    
        package com.arun.springin5easysteps.config;
        
        import org.springframework.beans.factory.annotation.Value;
        import org.springframework.stereotype.Component;
        
        @Component
        public class ReadYAML {
        
            @Value("${spring.data.name}")
            private String username;
        
            public String getUserName() {
                return username;
            }
        }


3. We can use the class to read the file properties.