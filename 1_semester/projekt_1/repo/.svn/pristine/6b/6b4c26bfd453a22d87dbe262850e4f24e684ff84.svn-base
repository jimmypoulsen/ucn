package Controllers;

import Models.*;
import java.util.HashMap;

public class OrderController {
    public Order newOrder(Customer c) {
        SessionsController sCtrl = new SessionsController();
        int id = OrderContainer.getInstance().getLastOrderId() + 1;
        Order o = new Order(id, OrderState.PENDING, c, sCtrl.getCurrentLoggedInEmployee());
        return o;
    }
    
    public Order createOrder(Order o, PaymentType pt) {
        double total = 0;
        for(OrderLine oL : o.getOrderLines())
            total += oL.getSubtotal();
        
        o.setTotal(total);
        o.setPaymentType(pt);
        o.setDelivery(true);
        o.setState(OrderState.COMPLETED);
        OrderContainer.getInstance().addOrder(o);
        return o;
    }
    
    public Order createOrderLine(Order o, Item i, int quantity) {
        OrderLine oL = new OrderLine(i, quantity);
        return OrderContainer.getInstance().addOrderLine(o, oL);
    }
    
    public HashMap<Integer, Order> getOrders() {
        return OrderContainer.getInstance().findAllOrders();
    }
}

