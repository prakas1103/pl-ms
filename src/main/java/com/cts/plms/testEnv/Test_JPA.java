package com.cts.plms.testEnv;

import com.cts.plms.user.User;
import com.cts.plms.user.UserRepository;
import com.cts.plms.user.UserRepositoryWithJdbc;
import org.springframework.beans.factory.annotation.Autowired;


public class Test_JPA {

    public static void main(String[] args) {
        System.out.println("Hi");
        User user = new User();
        UserRepositoryWithJdbc repo = new UserRepositoryWithJdbc();
        repo.findAll();

    }
}
