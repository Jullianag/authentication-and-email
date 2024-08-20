package org.meuprojeto.authenticationandemail.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.meuprojeto.authenticationandemail.entities.User;
import org.meuprojeto.authenticationandemail.services.validation.UserInsertValid;

@UserInsertValid
public class UserInsertDTO extends UserDTO {

    @NotBlank(message = "Campo obrigatório")
    @Size(min = 8, message = "A senha deve ter no mínimo 8 caracteres")
    private String password;
    
    public UserInsertDTO() {
    }

    public UserInsertDTO(User entity, String password) {
        super(entity);
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
