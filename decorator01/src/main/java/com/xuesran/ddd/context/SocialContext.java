package com.xuesran.ddd.context;

import com.xuesran.ddd.model.FriendShip;
import com.xuesran.ddd.model.User;

/**
 * The interface Social context.
 */
public interface SocialContext {

    /**
     * The interface Contact.
     */
    interface Contact {
        /**
         * Make.
         *
         * @param friend the friend
         */
        void make(FriendShip friend);

        /**
         * Break f.
         *
         * @param friend the friend
         */
        void breakF(FriendShip friend);
    }

    /**
     * As contact contact.
     *
     * @param user the user
     * @return the contact
     */
    Contact asContact(User user);
}
