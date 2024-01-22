package kwgh0st.project.librarysystemmanagement.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class LibraryUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true, length = 45)
    private String username;
    @Column(nullable = false, length = 33)
    private String password;
    @Column(nullable = false, length = 40)
    private String email;
    @Column(nullable = false)
    private List<String> roles;
}
