package com.example.main;

import com.example.beans.Engine;
import com.example.beans.Vehicle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.example.config.ProjectConfig;

public class SpringMain {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle vehicle = context.getBean(Vehicle.class);
        Engine engine = context.getBean(Engine.class);
    }

}
