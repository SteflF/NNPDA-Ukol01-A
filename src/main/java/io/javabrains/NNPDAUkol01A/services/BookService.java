package io.javabrains.NNPDAUkol01A.services;

import io.javabrains.NNPDAUkol01A.model.Book;

import java.util.List;

public interface BookService {
    List<Book> findByUserId(int userId);
}
