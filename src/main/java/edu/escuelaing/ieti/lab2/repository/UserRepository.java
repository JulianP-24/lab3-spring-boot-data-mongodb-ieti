package edu.escuelaing.ieti.lab2.repository;

import edu.escuelaing.ieti.lab2.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

}
