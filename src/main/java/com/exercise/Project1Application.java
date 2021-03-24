package com.exercise;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.exercise.mapper")
@SpringBootApplication
public class Project1Application {

    public static void main(String[] args) {

        SpringApplication.run(Project1Application.class, args);
//        String config = Project1Application.class.getClassLoader()
//                .getResource("generatorConfig.xml").getFile();
//        String[] arg = { "-configfile", config, "-overwrite" };
//        ShellRunner.main(arg);
    }

}
