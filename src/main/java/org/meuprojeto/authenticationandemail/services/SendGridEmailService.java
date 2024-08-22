package org.meuprojeto.authenticationandemail.services;

import com.sendgrid.Method;
import com.sendgrid.Request;
import com.sendgrid.Response;
import com.sendgrid.SendGrid;
import com.sendgrid.helpers.mail.Mail;
import com.sendgrid.helpers.mail.objects.Content;
import com.sendgrid.helpers.mail.objects.Email;
import org.meuprojeto.authenticationandemail.dtos.EmailDTO;
import org.meuprojeto.authenticationandemail.services.exceptions.EmailException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class SendGridEmailService implements EmailService {

    private Logger LOG = LoggerFactory.getLogger(SendGridEmailService.class);

    @Autowired
    private SendGrid sendGrid;

    @Override
    public void sendEmail(EmailDTO emailDTO) {
        Email from = new Email(emailDTO.getFromEmail(), emailDTO.getFromName());
        Email to = new Email(emailDTO.getTo());
        Content content = new Content(emailDTO.getContentType(), emailDTO.getBody());
        Mail mail = new Mail(from, emailDTO.getSubject(), to, content);
        mail.setReplyTo(new Email(emailDTO.getReplyTo()));

        Request request = new Request();

        try {
            request.setMethod(Method.POST);
            request.setEndpoint("mail/send");
            request.setBody(mail.build());
            LOG.info("Sending email to: " + to.getEmail());
            Response response = sendGrid.api(request);

            if (response.getStatusCode() >= 400 && response.getStatusCode() <= 500) {
                LOG.error("Error sending email: " + response.getBody());
                throw new EmailException(response.getBody());
            }
            LOG.info("Email sent! Status = " + response.getStatusCode());
        }
        catch (IOException e) {
            throw new EmailException(e.getMessage());
        }
    }
}
