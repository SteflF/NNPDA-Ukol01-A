package io.javabrains.NNPDAUkol01A.repository;

import io.javabrains.NNPDAUkol01A.model.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer> {
    List<Book> findByUserId(Integer id);
}
