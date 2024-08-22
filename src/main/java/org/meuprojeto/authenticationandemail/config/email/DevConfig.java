package org.meuprojeto.authenticationandemail.config.email;

import org.meuprojeto.authenticationandemail.services.EmailService;
import org.meuprojeto.authenticationandemail.services.SendGridEmailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class DevConfig {

    @Bean
    public EmailService emailService() {
        return new SendGridEmailService();
    }
}
