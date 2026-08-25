package com.study.ecommerce.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity)
	{
		httpSecurity
		.csrf(csrf->csrf.disable())
		.cors(Customizer.withDefaults())          //CorsconfiguarationSource
		.authorizeHttpRequests(request->
		     
		request
		     .requestMatchers(HttpMethod.GET,"/products/**","/categories/**").permitAll()
		     .requestMatchers(HttpMethod.POST,"/users").permitAll()
		     .requestMatchers(HttpMethod.POST,"/products","/categories").hasRole("ADMIN") 
		     .requestMatchers(HttpMethod.PUT,"/products/**","/categories/**").hasRole("ADMIN") 
		     .requestMatchers(HttpMethod.DELETE,"/products/**","/categories/**").hasRole("ADMIN") 
		     .anyRequest().authenticated()
		     
		);
		
		httpSecurity.httpBasic(Customizer.withDefaults());
		
		return httpSecurity.build();
	}
	
	@Bean
	public PasswordEncoder passwordEncoder()
	{
		return new BCryptPasswordEncoder();
	}
       

}
