package io.javabrains.NNPDAUkol01A.services;

import io.javabrains.NNPDAUkol01A.model.Author;

import java.util.List;

public interface AuthorService {
    List<Author> findByBookId(int bookId);
}
