package com.lidp.challenge.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfiguration implements WebMvcConfigurer
{
   @Override public void addCorsMappings(CorsRegistry registry)
   {
      // Register Angular Dev server as allowed origin for testing.
      registry.addMapping("/**").allowedMethods("*").allowedOrigins("*");
   }
}
