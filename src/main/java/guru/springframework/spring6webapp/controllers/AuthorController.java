package guru.springframework.spring6webapp.controllers;

import guru.springframework.spring6webapp.services.IAuthorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {
    private final IAuthorService iAuthorService;

    public AuthorController(IAuthorService iAuthorService) {
        this.iAuthorService = iAuthorService;
    }

    @RequestMapping("/authors")
    public String getAuthors(Model model) {
        model.addAttribute("authors", iAuthorService.findAllAuthors());
        return "authors";
    }
}
