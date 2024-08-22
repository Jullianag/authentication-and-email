package org.meuprojeto.authenticationandemail.services;

import org.meuprojeto.authenticationandemail.entities.User;
import org.meuprojeto.authenticationandemail.repositories.UserRepository;
import org.meuprojeto.authenticationandemail.util.CustomUserUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CustomUserUtil customUserUtil;


    protected User authenticated() {
        try {
            String username = customUserUtil.getLoggerUsername();
            return userRepository.findByEmail(username);
        }
        catch (Exception e) {
            throw new UsernameNotFoundException("Email não encontrado");
        }
    }

}
