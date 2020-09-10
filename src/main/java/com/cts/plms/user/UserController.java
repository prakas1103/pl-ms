package com.cts.plms.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @GetMapping("/jpa/users")
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
    @GetMapping("/jpa/users/{id}")
    public List<User> getUserById(@PathVariable int id){
        Optional<User> user = userRepository.findById(id);
        if(!user.isPresent()){
            throw new UserNotFoundException("User "+id+ "Not Found");
        }
        return Arrays.asList(user.get());
    }
    @PostMapping("/jpa/users")
    public String saveUser(@RequestBody User user){
        userRepository.save(user);
        return "User "+user.getUsername()+"("+user.getId()+") saved!!!";
    }
    @GetMapping("/jpa/usern/{userName}")
    public User getUserByName(@PathVariable String userName){
        User user = userRepository.findByUsername(userName);

        return user;
    }
}
