package org.example.ibramovie.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Konfiguriert CORS-Einstellungen für die Anwendung, um bestimmte Anfragen
 * vom Frontend zuzulassen.
 */
@Configuration
public class CorsConfig {

    /**
     * Erstellt eine WebMvcConfigurer Bean für die CORS-Konfiguration.
     *
     * @return WebMvcConfigurer mit definierten CORS-Einstellungen.
     */
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedOrigins("http://localhost:3000")
                        .allowedMethods("GET", "POST", "PUT", "DELETE")
                        .allowedHeaders("*")
                        .allowCredentials(true);
            }
        };
    }
}
