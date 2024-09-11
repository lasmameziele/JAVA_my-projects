package com.datorium.Datorium.API.Services;

import com.datorium.Datorium.API.DTOs.User;
import com.datorium.Datorium.API.Repo.UserRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // Annotate as a Spring service
public class UserService {
    private final UserRepo userRepo;

    public UserService() {
        userRepo = new UserRepo();
    }

    public void add(User user) {
        userRepo.add(user);
    }

    public List<User> get() {
        return userRepo.get();
    }

    public User update(User user) {
        return userRepo.update(user);
    }
}
