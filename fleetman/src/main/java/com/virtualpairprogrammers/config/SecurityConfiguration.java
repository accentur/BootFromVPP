package com.virtualpairprogrammers.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

@Configuration
@EnableWebSecurity

public class SecurityConfiguration extends WebSecurityConfigurerAdapter  {
	

	 // Authentication
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
            .withUser("rac").password("secret").roles("USER", "ADMIN");
    }
    
    // Authorization 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
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
                .antMatchers("/public/**").permitAll()   // allow /public
                .anyRequest().authenticated()           // everything else needs login
            .and()
            .formLogin()
            .and()
            .httpBasic();
    }

}
