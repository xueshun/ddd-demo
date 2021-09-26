package com.xuesran.ddd.domain.repository;

import com.xuesran.ddd.domain.context.Buyer;
import com.xuesran.ddd.domain.context.Contact;
import com.xuesran.ddd.domain.context.Reader;
import com.xuesran.ddd.domain.model.User;

/**
 * The interface User repository.
 *
 * @author xueshun
 */
public interface UserRepository {

    /**
     * Find user user.
     *
     * @param id the id
     * @return the user
     */
    User findUser(long id);

    /**
     * As buyer buyer.
     *
     * @param user the user
     * @return the buyer
     */
    Buyer asBuyer(User user);

    /**
     * As reader reader.
     *
     * @param user the user
     * @return the reader
     */
    Reader asReader(User user);

    /**
     * As contact contact.
     *
     * @param user the user
     * @return the contact
     */
    Contact asContact(User user);
}
