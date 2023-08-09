package com.vinu.springsecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

	@Bean
	SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests()
		    .requestMatchers("/myaccount", "/myBalance", "/myloans", "/mycards")
		      .hasAnyRole("USER", "ADMIN")
		    .requestMatchers("/contact", "/notices").permitAll()
		    .and().formLogin()
		    .and().httpBasic();
		return http.build();
	}

	@Bean
	public InMemoryUserDetailsManager userDetailsService() {
		UserDetails admin = User.withDefaultPasswordEncoder()
				 .username("vinu")
				 .password("12345")
				 .roles("ADMIN")
				 .build();
		UserDetails user = User.withDefaultPasswordEncoder()
				 .username("unni")
				 .password("12345")
				 .roles("USER")
				 .build();
		
		return new InMemoryUserDetailsManager(admin, user);
	}
	
	@Bean
    public PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }
}
