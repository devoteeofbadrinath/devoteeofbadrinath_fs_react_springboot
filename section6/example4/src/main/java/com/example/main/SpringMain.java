package com.example.main;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.example.config.ProjectConfig;

public class SpringMain {

    public static void main(String[] args) {


        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println("Primary Vehicle name from Spring Context is: " + vehicle.getName());

    }

}
