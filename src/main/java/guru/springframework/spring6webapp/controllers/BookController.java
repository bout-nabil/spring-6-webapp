package guru.springframework.spring6webapp.controllers;

import guru.springframework.spring6webapp.services.IBookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

    private final IBookService iBookService;

    public BookController(IBookService iBookService){
        this.iBookService = iBookService;
    }

    // Method to handle requests for displaying all books
    @RequestMapping("/books") // This annotation maps the method to the "/books" URL
    public String getBooks(Model model){
        // Add the list of books to the model
        model.addAttribute("books", iBookService.findAllBooks());
        return "books";
    }
}
