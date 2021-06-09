package com.tim.Evo;


import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	 @Override
	    protected void configure(HttpSecurity http) throws Exception
	    {

	        http
	         .csrf().disable()
	         .authorizeRequests().antMatchers("/console/**").permitAll()
	         .and()
			 .headers().frameOptions().disable()
	         .and()
	         .csrf().ignoringAntMatchers("/console/**")
	         .and()
	         .authorizeRequests().anyRequest().authenticated()
	         .and()
	         .httpBasic();
	        
	    }
	  
	    @Override
	    public void configure(AuthenticationManagerBuilder auth)
	            throws Exception
	    {
	        auth.inMemoryAuthentication()
	            .withUser("evo")
	            .password("{noop}pwd")
	            .roles("USER");
	    }
	


}
