package com.xuesran.ddd.repository;

import com.xuesran.ddd.context.OrderContext;
import com.xuesran.ddd.context.SocialContext;
import com.xuesran.ddd.context.SubscriptionContext;
import com.xuesran.ddd.model.User;

/**
 * The interface User repository.
 */
public interface UserRepository {

    /**
     * Find user by id user.
     *
     * @param id the id
     * @return the user
     */
    User findUserById(long id);

    /**
     * In subscription context subscription context.
     *
     * @return the subscription context
     */
    SubscriptionContext inSubscriptionContext();

    /**
     * In social context social context.
     *
     * @return the social context
     */
    SocialContext inSocialContext();

    /**
     * In order context order context.
     *
     * @return the order context
     */
    OrderContext inOrderContext();
}
