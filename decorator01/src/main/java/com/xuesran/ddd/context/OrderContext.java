package com.xuesran.ddd.context;

import com.xuesran.ddd.model.Column;
import com.xuesran.ddd.model.User;

/**
 * The interface Order context.
 */
public interface OrderContext {

    /**
     * The interface Buyer.
     */
    interface Buyer{
        /**
         * Place order.
         *
         * @param column the column
         */
        void placeOrder(Column column);
    }

    /**
     * As buyer buyer.
     *
     * @param user the user
     * @return the buyer
     */
    Buyer asBuyer(User user);
}


