package com.xuesran.ddd.context;

import com.xuesran.ddd.model.Content;
import com.xuesran.ddd.model.User;

/**
 * The interface Subscription context.
 */
public interface SubscriptionContext {
    /**
     * The interface Reader.
     */
    interface Reader{
        /**
         * Can view boolean.
         *
         * @param content the content
         * @return the boolean
         */
        boolean canView(Content content);
    }

    /**
     * As reader reader.
     *
     * @param user the user
     * @return the reader
     */
    Reader asReader(User user);
}
