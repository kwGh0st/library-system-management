package kwgh0st.project.librarysystemmanagement.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookDTO {
    private Long id;
    private String title;
    private String isbn;
    private String authorFirstName;
    private String authorLastName;
    private String description;
}

