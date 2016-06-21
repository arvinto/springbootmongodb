package app.repository;

import app.model.Book;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by arvinaboque on 6/21/16.
 */

public interface BookRepository extends MongoRepository<Book, String> {

}
