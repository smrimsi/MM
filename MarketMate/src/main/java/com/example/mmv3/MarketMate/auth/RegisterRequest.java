package com.example.mmv3.MarketMate.auth;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {
    @Valid

    @NotNull(message = "First name reqqqq")
    private String firstname;
    @NotNull(message = "First name reqqqq")
    private String lastname;
    @NotNull(message = "Email reqqqq")
    @Email(message = "Not an Email")
    private String email;
    private String password;
}
