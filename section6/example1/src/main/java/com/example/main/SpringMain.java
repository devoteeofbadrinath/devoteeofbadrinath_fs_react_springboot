package com.example.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.example.config.ProjectConfig;

public class SpringMain {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

    }
}
