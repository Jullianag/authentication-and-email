package org.meuprojeto.authenticationandemail.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.meuprojeto.authenticationandemail.dtos.EmailDTO;

public class MockEmailService implements EmailService {

    private Logger LOG = LoggerFactory.getLogger(MockEmailService.class);

    public void sendEmail(EmailDTO emailDTO) {
        LOG.info("Email sent to: " + emailDTO.getTo());
    }
}
