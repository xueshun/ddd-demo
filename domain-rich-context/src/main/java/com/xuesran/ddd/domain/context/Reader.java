package com.xuesran.ddd.domain.context;

import com.xuesran.ddd.domain.model.Content;
import com.xuesran.ddd.domain.model.Subscription;

import java.util.List;

/**
 * 阅读上下文
 *
 * @author xueshun
 */
public interface Reader {

    /**
     * Gets subscription.
     *
     * @return the subscription
     */
    List<Subscription> getSubscription();


    /**
     * Can view boolean.
     *
     * @param content the content
     * @return the boolean
     */
    boolean canView(Content content);
}
