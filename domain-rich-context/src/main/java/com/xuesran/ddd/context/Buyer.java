package com.xuesran.ddd.context;

import com.xuesran.ddd.model.Column;
import com.xuesran.ddd.model.Order;
import com.xuesran.ddd.model.Payment;

import java.util.List;

/**
 * The interface Buyer.
 *
 * @author xueshun
 */
public interface Buyer {
    /**
     * Orders list.
     *
     * @return the list
     */
    List<Order> orders();

    /**
     * Gets payments.
     *
     * @return the payments
     */
    List<Payment> getPayments();

    /**
     * Place order.
     *
     * @param column the column
     */
    void placeOrder(Column column);
}
