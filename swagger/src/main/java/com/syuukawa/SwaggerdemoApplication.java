package com.syuukawa;

import com.syuukawa.config.ApiOriginFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import javax.servlet.DispatcherType;

@SpringBootApplication
public class SwaggerdemoApplication {

    @Bean
    public FilterRegistrationBean simpleCORSFilter() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setDispatcherTypes(DispatcherType.REQUEST);
        registration.setFilter(new ApiOriginFilter());
        registration.setEnabled(true);
        registration.addUrlPatterns("/*");
        return registration;
    }

    public static void main(String[] args) {
        SpringApplication.run(SwaggerdemoApplication.class, args);
    }
}
