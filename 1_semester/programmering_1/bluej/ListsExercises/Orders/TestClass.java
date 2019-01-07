public class TestClass {
    private Customer c = new Customer(1, "Jimmy Poulsen", "Langagervej 4, st. 69", "31337135");
    private Order o = new Order(1, "1/10-2018", "3/10-2018");
    private Order o2 = new Order(2, "1/10-2018", "5/10-2018");
    private Product p1 = new Product(1, "iPhone X", 10000);
    private Product p2 = new Product(2, "iPhone XS", 12000);
    private Product p3 = new Product(3, "iMac Pro", 24000);
    private OrderLine oL1 = new OrderLine(2, o, p1);
    private OrderLine oL2 = new OrderLine(1, o, p2);
    private OrderLine oL3 = new OrderLine(1, o, p3);
    private OrderLine oL4 = new OrderLine(1, o2, p3);
    private OrderLine oL5 = new OrderLine(2, o2, p1);
    
    public void runTest() {
        c.setOrder(o);
        c.setOrder(o2);
        o.setOrderLine(oL1);
        o.setOrderLine(oL2);
        o.setOrderLine(oL3);
        o2.setOrderLine(oL4);
        o2.setOrderLine(oL5);
        c.printOrders();
    }
}