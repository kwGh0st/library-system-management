package kwgh0st.project.librarysystemmanagement.repository;

import kwgh0st.project.librarysystemmanagement.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
}
