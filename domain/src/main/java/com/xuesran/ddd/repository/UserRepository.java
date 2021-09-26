package com.xuesran.ddd.repository;

import com.xuesran.ddd.models.User;

import java.util.List;

/**
 * The interface User repository.
 *
 * @author xueshun
 */
public interface UserRepository {

    /**
     * Find by id user.
     *
     * @param id the id
     * @return the user
     */
    public User findById(long id);

    /**
     * Find by list.
     *
     * @param user the user
     * @return the list
     */
    public List<User> findBy(User user);
}
