package guru.springframework.spring6webapp.services;

import guru.springframework.spring6webapp.domain.Author;
import guru.springframework.spring6webapp.repositories.IAuthorRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImp implements IAuthorService{

    private final IAuthorRepository iAuthorRepository;

    public AuthorServiceImp(IAuthorRepository iAuthorRepository) {
        this.iAuthorRepository = iAuthorRepository;
    }

    @Override
    public Iterable<Author> findAllAuthors() {
        return iAuthorRepository.findAll();
    }
}
