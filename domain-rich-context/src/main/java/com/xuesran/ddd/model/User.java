package com.xuesran.ddd.model;

import com.xuesran.ddd.context.Buyer;
import com.xuesran.ddd.context.Contact;
import com.xuesran.ddd.context.Reader;

import java.util.List;

/**
 * The type User.
 *
 * @author xueshun
 */
public class User implements Reader, Buyer, Contact {
    @Override
    public List<Order> orders() {
        return null;
    }

    @Override
    public List<Payment> getPayments() {
        return null;
    }

    @Override
    public void placeOrder(Column column) {

    }

    @Override
    public List<FriendShip> friends() {
        return null;
    }

    @Override
    public List<Moments> moments() {
        return null;
    }

    @Override
    public void make(FriendShip friend) {

    }

    @Override
    public List<Subscription> getSubscription() {
        return null;
    }

    @Override
    public boolean canView(Content content) {
        return false;
    }
}
