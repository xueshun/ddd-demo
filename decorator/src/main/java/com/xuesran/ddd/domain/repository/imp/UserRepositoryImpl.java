package com.xuesran.ddd.domain.repository.imp;

import com.xuesran.ddd.domain.context.Buyer;
import com.xuesran.ddd.domain.context.Contact;
import com.xuesran.ddd.domain.context.Reader;
import com.xuesran.ddd.domain.model.User;
import com.xuesran.ddd.domain.repository.UserRepository;

/**
 * The type User repository.
 *
 * @author xueshun
 */
public class UserRepositoryImpl implements UserRepository {
    @Override
    public User findUser(long id) {
        return null;
    }

    @Override
    public Buyer asBuyer(User user) {
        return new Buyer(user);
    }

    @Override
    public Reader asReader(User user) {
        return null;
    }

    @Override
    public Contact asContact(User user) {
        return null;
    }
}
