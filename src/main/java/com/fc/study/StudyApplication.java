package com.fc.study;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudyApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(StudyApplication.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.run(args);
    }


}
