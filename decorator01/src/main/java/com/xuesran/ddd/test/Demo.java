package com.xuesran.ddd.test;

import com.xuesran.ddd.repository.UserRepository;
import com.xuesran.ddd.repository.imp.UserRepositoryImpl;

/**
 * The type Demo.
 *
 * @author xueshun
 */
public class Demo {

    public static void main(String[] args) {
        UserRepository userRepository = new UserRepositoryImpl(null, null, null);
        userRepository.inSocialContext().asContact(null);
    }
}
