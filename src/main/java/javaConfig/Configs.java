package javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration

public class Configs {
    @Bean("emp")
    public Employee getEmployee(){
        return new Employee();
    }
    @Bean
    public Employee Employee(){
        return  new Employee();
    }
    @Bean("add1")
    public Address address(){
        return new Address("NGP","sdf");
    }
}
