package com.tramos.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tramos.workshopmongo.domain.User;
import com.tramos.workshopmongo.repository.UserRepository;
import com.tramos.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;
    
    public List<User> findAll() {        
        return repo.findAll();
    }

    public User findById(String id) {
        return repo.findById(id)
            .orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }
}
