package kwgh0st.project.librarysystemmanagement.service;

import jakarta.transaction.Transactional;
import kwgh0st.project.librarysystemmanagement.exception.EmailAlreadyExistsException;
import kwgh0st.project.librarysystemmanagement.exception.UsernameAlreadyExistsException;
import kwgh0st.project.librarysystemmanagement.model.LibraryUser;
import kwgh0st.project.librarysystemmanagement.model.dto.UserDTO;
import kwgh0st.project.librarysystemmanagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<LibraryUser> findAllUsers() {
        return userRepository.findAll();
    }

    public LibraryUser findUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public LibraryUser registerNewUserAccount(UserDTO user) throws UsernameAlreadyExistsException, EmailAlreadyExistsException {

        if (userRepository.existsByEmail(user.getEmail()))
            throw new EmailAlreadyExistsException("There is an account with that email address: " + user.getEmail());

        if (userRepository.existsByUsername(user.getUsername()))
            throw new UsernameAlreadyExistsException("There is an account with that username: " + user.getUsername());

        LibraryUser newUser = new LibraryUser();
        newUser.setUsername(user.getUsername());
        newUser.setEmail(user.getEmail());
        newUser.setPassword(user.getPassword());
        newUser.setMatchingPassword(user.getMatchingPassword());
        newUser.setRoles(List.of("ROLE_USER"));

        return userRepository.save(newUser);
    }


    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }


}
