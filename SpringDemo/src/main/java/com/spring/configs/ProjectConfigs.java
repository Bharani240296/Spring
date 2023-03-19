package com.spring.configs;

import com.spring.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfigs {

    @Bean
    Vehicle vehicle1()
    {
        Vehicle veh=new Vehicle();
        veh.setName("Honda");
        return veh;
    }
}
