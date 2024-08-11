package com.dgn.jpa_part_3_jpql.service;

import com.dgn.jpa_part_3_jpql.dto.UserCountDto;
import com.dgn.jpa_part_3_jpql.model.User;
import com.dgn.jpa_part_3_jpql.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User addUser(User user){
        return userRepository.save(user);
    }

    public List<UserCountDto> getUserNameCount(){
        return userRepository.getUserNameCount();
    }
}
