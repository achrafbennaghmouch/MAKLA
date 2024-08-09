package org.example.backend.Payload.Request;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginRequest {
    @NotBlank
    private String username;

    @NotBlank
    private String password;



    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}