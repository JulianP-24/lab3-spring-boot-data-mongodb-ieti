package edu.escuelaing.ieti.lab2.service.impl;

import edu.escuelaing.ieti.lab2.dto.UserDto;
import edu.escuelaing.ieti.lab2.entities.User;
import edu.escuelaing.ieti.lab2.repository.UserRepository;
import edu.escuelaing.ieti.lab2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceMongoDB implements UserService {

    private final UserRepository userRepository;

    public UserServiceMongoDB(@Autowired UserRepository userRepository )
    {
        this.userRepository = userRepository;
    }

    @Override
    public User create(User user) {
        return userRepository.save(user);
    }

    @Override
    public User findById(String id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public void deleteById(String id) {
        userRepository.deleteById(id);
    }

    @Override
    public User update(User user, String userId) {
        User updateUser = userRepository.findById(userId).orElse(null);
        updateUser.setName(user.getName());
        updateUser.setEmail(user.getEmail());
        updateUser.setLastName(user.getLastName());
        updateUser.setCreatedAt(user.getCreatedAt());
        return userRepository.save(updateUser);
    }

    @Override
    public UserDto mapToDto(User user) {
        return null;
    }

    @Override
    public User mapToEntity(UserDto userDto) {
        return null;
    }
}
