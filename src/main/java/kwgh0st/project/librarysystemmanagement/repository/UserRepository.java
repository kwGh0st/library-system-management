package kwgh0st.project.librarysystemmanagement.repository;

import kwgh0st.project.librarysystemmanagement.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
