package com.xuesran.ddd.domain.context;

import com.xuesran.ddd.domain.model.Content;
import com.xuesran.ddd.domain.model.Subscription;
import com.xuesran.ddd.domain.model.User;

import java.util.List;

/**
 * The type Reader.
 *
 * @author xueshun
 */
public class Reader {

    private User user;

    private List<Subscription> subscriptions;

    public Reader(User user) {
        this.user = user;
    }

    /**
     * 订阅上下文
     */
    public boolean canView(Content content) {
        return false;
    }
}
