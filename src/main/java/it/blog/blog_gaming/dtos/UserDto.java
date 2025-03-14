// IL DTO E' L'OGGETTO CHE VERRA' MANIPOLATO PER IMPLEMENTARE LE LOGICHE DELLO USER, PER IL LOGIN E IL REGISTER
// @NotEmpty: SPECIFICA CHE IL CAMPO NON PUO' ESSERE VUOTO
// @Email: SPECIFICA CHE IL CAMPO DEVE ESSERE UN INDIRIZZO EMAIL VALIDO

package it.blog.blog_gaming.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private Long id;
    @NotEmpty
    private String FirstName;
    @NotEmpty
    private String LastName;
    @NotEmpty(message = "Email is required")
    @Email
    private String email;
    @NotEmpty(message = "Password is required")
    private String password;

}
