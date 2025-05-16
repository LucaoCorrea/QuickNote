package com.quickNote.quickNote;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QuickNoteApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuickNoteApplication.class, args);
		System.out.println("Hello, Welcome Quick Notes!");
	}

}
