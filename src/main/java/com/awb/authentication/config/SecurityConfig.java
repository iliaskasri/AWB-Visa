package com.awb.authentication.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc

public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Bean
	@Override
	public AuthenticationManager authenticationManagerBean() throws Exception {
		return super.authenticationManagerBean();
	}

	@Override
	protected AuthenticationManager authenticationManager() throws Exception {
		return super.authenticationManager();
	}

	@Bean
	@Override
	public UserDetailsService userDetailsServiceBean() throws Exception {
		return super.userDetailsServiceBean();
	}


//	@Autowired
//	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
////		auth.inMemoryAuthentication().withUser("admin").password("admin").roles("USER");
//		auth.ldapAuthentication().userSearchFilter("(uid={0})").groupSearchBase("ou=groups")
//		.userSearchBase("ou=users").groupSearchFilter("(uniqueMember={0})").groupRoleAttribute("cn")
//		.contextSource().url("ldap://localhost:10389/o=mojo").managerDn("uid=admin,ou=system")
//		.managerPassword("secret");
//	}

	@Override
	protected void configure(AuthenticationManagerBuilder authManagerBuilder) throws Exception {
		authManagerBuilder.ldapAuthentication().userSearchFilter("(uid={0})").groupSearchBase("ou=groups")
				.userSearchBase("ou=users").groupSearchFilter("(uniqueMember={0})").groupRoleAttribute("cn")
				.contextSource().url("ldap://localhost:10389/o=mojo").managerDn("uid=admin,ou=system")
				.managerPassword("secret");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable();
//		 http.authorizeRequests()
//		 .antMatchers("rest/authGet/").permitAll()
		 http.authorizeRequests().antMatchers("/**").permitAll()
	     .antMatchers("/rest/auth").permitAll()
	     .antMatchers("/rest/auth").authenticated()
	     .antMatchers("/rest/listOperation").permitAll()

         .antMatchers("/","/home").permitAll().antMatchers("/authOK/**")
         .access("hasRole('ADMIN')").antMatchers("/db/**").access("hasRole('ADMIN')")
         .and()
             .formLogin()
             .defaultSuccessUrl("/authOK")
             .failureUrl("/login?logout")
             .usernameParameter("username")
             .passwordParameter("password") 
         .and()
             .logout().logoutSuccessUrl("/login?logout").invalidateHttpSession(true).deleteCookies(""); 
      
	}

}




