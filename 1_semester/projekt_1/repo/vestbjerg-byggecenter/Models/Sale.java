package Models;
import java.util.*;

public class Sale {
    private PaymentType paymentType;
    private Date date;
    private OrderState state;
    private double total = 0;
    private HashSet<SalesLine> salesLines;
    private Employee employee;

    public Sale(PaymentType paymentType, Employee employee) {
        this.paymentType = paymentType;
        this.date = new Date();
        this.state = OrderState.PENDING;
        this.salesLines = new HashSet<SalesLine>();
        this.employee = employee;
        // use SessionsController to decide what employee is the current
    }

    public boolean addSalesLine(SalesLine salesLine) {
        return this.salesLines.add(salesLine);
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public OrderState getState() {
        return state;
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}