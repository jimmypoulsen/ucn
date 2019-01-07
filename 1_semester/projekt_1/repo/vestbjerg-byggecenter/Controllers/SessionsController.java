package Controllers;

import Models.*;

public class SessionsController {
    public boolean loginEmployee(int customerNo, String password) {
        if(EmployeeContainer.getInstance().performLogin(customerNo, password))
            return true;
        return false;
    }

    public Employee getCurrentLoggedInEmployee() {
        return EmployeeContainer.getInstance().findCurrentLoggedInEmployee();
    }
}
