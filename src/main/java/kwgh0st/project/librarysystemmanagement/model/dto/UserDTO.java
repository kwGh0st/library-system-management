package kwgh0st.project.librarysystemmanagement.model.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import kwgh0st.project.librarysystemmanagement.security.PasswordMatches;
import kwgh0st.project.librarysystemmanagement.security.ValidEmail;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@PasswordMatches
public class UserDTO {

    private String username;

    private String password;

    private String matchingPassword;
    @ValidEmail
    @NotNull
    @NotEmpty
    private String email;
}
