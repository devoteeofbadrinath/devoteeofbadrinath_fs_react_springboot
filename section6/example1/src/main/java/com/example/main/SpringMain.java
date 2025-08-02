package com.example.main;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.example.config.ProjectConfig;

public class SpringMain {

    public static void main(String[] args) {

        /*
        The var keyword was introduced in Java 10. Type inference is used in
        var keyword in which it detects automatically the datatype of a variable
        based on the surrounding context.
         */
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        context.getBean(Vehicle.class);

    }
}
