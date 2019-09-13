package com.saidodda.microservices;

import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)
//@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
		       .withUser("saidodda").password("{noop}saidodda").roles("USER")
		       .and()
		       .withUser("admin").password("{noop}admin").roles("ADMIN");
	}

	//Authorization based on http methods need to be checked.
	/*@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.httpBasic()
				.and().authorizeRequests()
					.antMatchers(HttpMethod.POST, "/customer/customers/**").hasRole("ADMIN")
					.antMatchers(HttpMethod.PUT, "/customer/customers/**").hasRole("ADMIN")
					.antMatchers(HttpMethod.PATCH, "/customer/customers/**").hasRole("ADMIN")
					.and().csrf().disable();
	}*/

}