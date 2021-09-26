package com.xuesran.ddd.models;

import com.xuesran.ddd.repository.MySubscriptions;
import lombok.*;

/**
 * 用户
 *
 * @author xueshun
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class User {

    private MySubscriptions mySubscriptions;

    private Long id;

    private String name;

    public MySubscriptions getMySubscriptions(){
        return mySubscriptions;
    }
}
