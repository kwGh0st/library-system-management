package kwgh0st.project.librarysystemmanagement.controller;

import kwgh0st.project.librarysystemmanagement.model.Author;
import kwgh0st.project.librarysystemmanagement.model.dto.AuthorDTO;
import kwgh0st.project.librarysystemmanagement.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/authors")
public class AuthorController {
    private final AuthorService authorService;

    @Autowired
    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }
    @GetMapping
    public List<AuthorDTO> getAllAuthors() {
        return authorService.findAllAuthors()
                .stream()
                .map(authorService::convertToDTO)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public Author getAuthorById(@PathVariable Long id) {
        return authorService.findAuthorById(id);
    }

    @PostMapping
    public Author addAuthor(@RequestBody Author author) {
        return authorService.saveAuthor(author);
    }

    @DeleteMapping("/{id}")
    public void deleteAuthor(@PathVariable Long id) {
        authorService.deleteAuthor(id);
    }
}
