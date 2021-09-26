package com.xuesran.ddd.domain.repository.impl;

import com.xuesran.ddd.models.User;
import com.xuesran.ddd.domain.repository.UserRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * The type User repository.
 *
 * @author xueshun
 */
@Repository
public class UserRepositoryImpl implements UserRepository {
    @Override
    public User findById(long id) {
        return null;
    }

    @Override
    public List<User> findBy(User user) {
        return null;
    }


    private User setMySubscription(User user){
        user.setMySubscriptions(new MySubscriptionsImpl(user));
        return user;
    }
}
