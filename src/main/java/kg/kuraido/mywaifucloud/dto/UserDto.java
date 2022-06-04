package kg.kuraido.mywaifucloud.dto;


import kg.kuraido.mywaifucloud.validation.PasswordMatches;
import kg.kuraido.mywaifucloud.validation.ValidEmail;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@PasswordMatches
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    @NotNull
    @NotEmpty
    private String name;

    @NotNull
    @NotEmpty
    private String password;

    @NotNull
    @NotEmpty
    private String passwordTsu;

    @ValidEmail
    @NotNull
    @NotEmpty
    private String email;

}
