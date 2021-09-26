package com.xuesran.ddd.domain.context;

import com.xuesran.ddd.domain.model.FriendShip;
import com.xuesran.ddd.domain.model.Moments;

import java.util.List;

/**
 * 社交上下文
 *
 * @author xueshun
 */
public interface Contact {

    /**
     * Friends list.
     *
     * @return the list
     */
    public List<FriendShip> friends();

    /**
     * Moments list.
     *
     * @return the list
     */
    List<Moments> moments();

    /**
     * Make.
     *
     * @param friend the friend
     */
    void make(FriendShip friend);

}
