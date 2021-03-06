package io.javabrains.NNPDAUkol01A.services.impl;

import io.javabrains.NNPDAUkol01A.model.Book;
import io.javabrains.NNPDAUkol01A.repository.BookRepository;
import io.javabrains.NNPDAUkol01A.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("bookService")
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> findByUserId(int userId) {
        List<Book> books = new ArrayList<>();
        List<Book> result = new ArrayList<>();

        bookRepository.findByUserId(userId).iterator().forEachRemaining(books::add);

        for (var book:books
        ) {
            Book temp = new Book();
            temp.setId(book.getId());
            temp.setName(book.getName());

            result.add(temp);
        }

        return result;
    }
}
