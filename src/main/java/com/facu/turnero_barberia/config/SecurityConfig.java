package com.facu.turnero_barberia.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

/**
 * CONFIGURACIÓN TEMPORAL: deja todos los endpoints abiertos para poder probar
 * los controllers con Postman mientras se desarrolla la lógica de negocio.
 *
 * TODO: reemplazar por la configuración real con JWT
 * (filtro JWT, PasswordEncoder, roles ADMIN / CLIENTE / BARBERO).
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable())
            .authorizeHttpRequests(auth -> auth.anyRequest().permitAll());
        return http.build();
    }
}
