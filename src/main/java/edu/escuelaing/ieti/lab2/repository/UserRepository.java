package edu.escuelaing.ieti.lab2.repository;

import edu.escuelaing.ieti.lab2.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Date;
import java.util.List;

public interface UserRepository extends MongoRepository<User, String> {
    @Query("SELECT * from User WHERE name.queryText LIKE ?1 or lastName.queryText LIKE ?1")
    List<User> findUsersWithNameOrLastNameLike(String queryText);

    @Query("SELECT * FROM User WHERE createdAt.startDate AFTER ?1")
    List<User> findUsersCreatedAfter(Date startDate);
}
