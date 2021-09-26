package com.xuesran.ddd.repository.imp;

import com.xuesran.ddd.context.SocialContext;
import com.xuesran.ddd.context.SubscriptionContext;
import com.xuesran.ddd.model.User;
import lombok.RequiredArgsConstructor;

/**
 * The type Subscription context.
 *
 * @author xueshun
 */
@RequiredArgsConstructor
public class SubscriptionContextImpl implements SubscriptionContext {
    private final SocialContext socialContext;

    @Override
    public Reader asReader(User user) {
        return null;
    }
}
