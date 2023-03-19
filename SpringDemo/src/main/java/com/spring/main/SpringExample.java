package com.spring.main;

import com.spring.beans.Vehicle;
import com.spring.configs.ProjectConfigs;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringExample {
    public static void main(String[] args) {
        Vehicle veh=new Vehicle();
        veh.setName("HERO");
        System.out.println("Vehicle name is not Spring-Context: "+veh.getName());

        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ProjectConfigs.class);
        Vehicle vehicle= context.getBean(Vehicle.class);
        System.out.println("vehicle name from Spring-Context: "+vehicle.getName());
    }
}
