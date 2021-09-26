package com.xuesran.ddd.domain.repository;

import com.xuesran.ddd.models.Subscription;

import java.util.List;

/**
 * 我的订阅
 *
 * @author xueshun
 */
public interface MySubscriptions extends Iterable<Subscription> {

    /**
     * Sub list list.
     *
     * @param form the form
     * @param size the size
     * @return the list
     */
    public List<Subscription> subList(int form, int size);


}
