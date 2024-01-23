package kwgh0st.project.librarysystemmanagement.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import kwgh0st.project.librarysystemmanagement.security.valid.PasswordMatches;
import kwgh0st.project.librarysystemmanagement.security.valid.ValidEmail;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@PasswordMatches
public class LibraryUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true, length = 45)
    @NotEmpty
    private String username;
    @Column(nullable = false, length = 33)
    @NotEmpty
    private String password;
    @Column(nullable = false, length = 33)
    @NotEmpty
    private String matchingPassword;
    @Column(nullable = false, length = 40, unique = true)
    @NotEmpty
    @ValidEmail
    private String email;
    @Column(nullable = false)
    private List<String> roles;
}
