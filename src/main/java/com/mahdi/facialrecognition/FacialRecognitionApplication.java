package com.mahdi.facialrecognition;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FacialRecognitionApplication {

	public static void main(String[] args) {
		OpenCV.loadLocally();
		SpringApplication.run(FacialRecognitionApplication.class, args);
	}

}
