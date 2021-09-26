package com.xuesran.ddd.repository.imp;

import com.xuesran.ddd.context.OrderContext;
import com.xuesran.ddd.context.SocialContext;
import com.xuesran.ddd.context.SubscriptionContext;
import com.xuesran.ddd.model.User;
import com.xuesran.ddd.repository.UserRepository;
import lombok.RequiredArgsConstructor;

/**
 * The type User repository.
 *
 * @author xueshun
 */
@RequiredArgsConstructor
public class UserRepositoryImpl implements UserRepository {

    private final SubscriptionContext subscriptionContext;
    private final SocialContext socialContext;
    private final OrderContext orderContext;


    @Override
    public User findUserById(long id) {
        return null;
    }

    @Override
    public SubscriptionContext inSubscriptionContext() {
        return subscriptionContext;
    }

    @Override
    public SocialContext inSocialContext() {
        return null;
    }

    @Override
    public OrderContext inOrderContext() {
        return null;
    }
}
