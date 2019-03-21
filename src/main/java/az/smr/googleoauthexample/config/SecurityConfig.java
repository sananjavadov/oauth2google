package az.smr.googleoauthexample.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.boot.autoconfigure.security.oauth2.resource.PrincipalExtractor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import az.smr.googleoauthexample.entity.User;
import az.smr.googleoauthexample.service.UserService;

@Configuration
@EnableWebSecurity
@EnableOAuth2Sso
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	UserService userService;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
	    http   
	    .authorizeRequests()
	    .mvcMatchers("/").permitAll()
	    .anyRequest().authenticated()
	    .and()
	    .logout()
	    .logoutUrl("/logout")
	    .logoutSuccessUrl("/")
	    .and()
	    .csrf().disable();
	}
	
	
    @Bean
    public PrincipalExtractor principalExtractor() {
        return map -> {
            String mail = (String) map.get("email");

            User user = userService.getByMail(mail);
            
            if (user==null) {
				user=new User(
						(String) map.get("email"), 
						(String) map.get("given_name"), 
						(String) map.get("family_name"),
						(String) map.get("picture"));
				return userService.save(user);
			}
            
        	return user;
           
        };
    } 
    
	

	
	


}
