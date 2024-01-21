package kwgh0st.project.librarysystemmanagement.model.dto;

import kwgh0st.project.librarysystemmanagement.model.Book;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class AuthorDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private Set<Book> books;

}
