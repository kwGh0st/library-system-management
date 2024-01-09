package kwgh0st.project.librarysystemmanagement.repository;

import kwgh0st.project.librarysystemmanagement.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
