package org.meuprojeto.authenticationandemail.config.email;

import org.meuprojeto.authenticationandemail.services.EmailService;
import org.meuprojeto.authenticationandemail.services.MockEmailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfig {

    @Bean
    public EmailService emailService() {
        return new MockEmailService();
    }
}
