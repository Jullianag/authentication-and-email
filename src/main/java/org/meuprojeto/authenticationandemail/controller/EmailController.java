package org.meuprojeto.authenticationandemail.controller;

import jakarta.validation.Valid;
import org.meuprojeto.authenticationandemail.dtos.EmailDTO;
import org.meuprojeto.authenticationandemail.services.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/emails")
public class EmailController {

    @Autowired
    private EmailService emailService;

    @PostMapping
    public ResponseEntity<Void> sendEmail(@Valid @RequestBody EmailDTO emailDTO) {
        emailService.sendEmail(emailDTO);
        return ResponseEntity.noContent().build();
    }
}
