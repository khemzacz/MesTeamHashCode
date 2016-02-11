import jdk.nashorn.internal.objects.Global;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by Ciemek on 11/02/16.
 */
public class OrderQueue {

    private static GlobalData globalData;
    private int               orderCount;
    private ArrayList<Order> orderList;

    public OrderQueue() {
        if (globalData == null)
            System.out.println("ERROR, GLOBALDATA NOT INITIALIZED.");
        System.out.println("jakubik to straszny pedal ;/");

        orderCount = globalData.getOrdersCount();
        initializeOrderList();

    }


    private void initializeOrderList() {
        orderList = new ArrayList<>();
        orderList = globalData.orderList;
    }


    public void getFirstPendingOrder(){
        for (int o=0; o < orderCount; ++o) {
            
        }
    }



}
