package br.com.pasp;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Exer {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(Exer.class, args);
		Properties prop = new Properties();
		
		try {			
			prop.setProperty("way", "user.home.arquivo.csv");			
			prop.store(new FileOutputStream("config.properties"), null);	
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
