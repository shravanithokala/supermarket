package com.supermarketdemo.lambton;

import com.google.common.collect.ImmutableList;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.net.ProxySelector;

@SpringBootApplication
public class LambtonApplication {


	public static void main(String[] args) {
		SpringApplication.run(LambtonApplication.class, args);
	}


}
