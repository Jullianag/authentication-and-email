package org.meuprojeto.authenticationandemail.services;

import org.meuprojeto.authenticationandemail.dtos.EmailDTO;

public interface EmailService {

    void sendEmail(EmailDTO emailDTO);

}
