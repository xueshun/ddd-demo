package com.xuesran.ddd.domain.context;

import com.xuesran.ddd.domain.model.FriendShip;
import com.xuesran.ddd.domain.model.Moments;
import com.xuesran.ddd.domain.model.User;

import java.util.List;

/**
 * The type Contact.
 *
 * @author xueshun
 */
public class Contact {

    private User user;

    private List<FriendShip> friends;

    private List<Moments> moments;

    /**
     * Instantiates a new Contact.
     *
     * @param user the user
     */
    public Contact(User user) {
        this.user = user;
    }

    /**
     * 社交 上下文
     *
     * @param friend the friend
     */
    public void make(FriendShip friend){

    }

    /**
     * Break ship.
     *
     * @param friend the friend
     */
    public void breakShip(FriendShip friend){

    }
}
