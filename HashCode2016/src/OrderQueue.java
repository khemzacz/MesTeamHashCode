import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by Ciemek on 11/02/16.
 */
public class OrderQueue {

    private int               orderCount;
    private ArrayList<Order> orderList;

    public OrderQueue() {

        orderCount = GlobalData.getOrdersCount();
        initializeOrderList();
    }


    private void initializeOrderList() {
        orderList = new ArrayList<>();
        orderList = GlobalData.orderList;
    }


    public Order getFirstPendingOrder() {
        for (int o=0; o < orderCount; ++o) {
            if (orderList.get(o).getState() == OrderState.PENDING)
                return orderList.get(o);
        }
        return null;
    }


}
