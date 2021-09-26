package domain.context;

import com.xuesran.ddd.domain.model.Column;
import com.xuesran.ddd.domain.model.Order;
import com.xuesran.ddd.domain.model.Payment;
import com.xuesran.ddd.domain.model.User;

import java.util.List;

/**
 * The type Buyer.
 *
 * @author xueshun
 */
public class Buyer {

    private User user;

    /**
     * Instantiates a new Buyer.
     *
     * @param user the user
     */
    public Buyer(User user) {
        this.user = user;
    }

    private List<Order> orders;

    private List<Payment> payments;

    /**
     * 订单上下文
     *
     * @param column the column
     */
    public void placeOrder(Column column){

    }
}
