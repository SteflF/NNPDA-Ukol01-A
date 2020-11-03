package io.javabrains.NNPDAUkol01A.repository;

import io.javabrains.NNPDAUkol01A.model.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Integer> {
}
