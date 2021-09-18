package com.xuesran.ddd.repository.impl;

import com.xuesran.ddd.models.Subscription;
import com.xuesran.ddd.models.User;
import com.xuesran.ddd.repository.MySubscriptions;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.Iterator;
import java.util.List;

/**
 * The type My subscriptions.
 *
 * @author xueshun
 */
@Slf4j
@Repository
@RequiredArgsConstructor
public class MySubscriptionsImpl implements MySubscriptions {
    private final User user;

    @Override
    public Iterator<Subscription> iterator() {
        return null;
    }

    @Override
    public List<Subscription> subList(int form, int size) {
        // 数据库分页查询
        return null;
    }
}
