package controller;
import model.*;
import tui.Helper;
import java.util.HashMap;

public class PersonController   {
    public Person createPerson(String name, String address, String postalCode, String city, String phone)   {
        int id = PersonContainer.getInstance().getLastPersonId() + 1;
        Person p = new Person(id, name, address, postalCode, city, phone);
        
        if (!PersonContainer.getInstance().addPerson(p)){
            p = null;
        }
        return p;
    }
    
    //getPerson
    public Person getPerson(int id){
        return PersonContainer.getInstance().findPerson(id);        
    }
    
    //updatePerson
    public Person updatePerson(Person p, String name, String address, String postalCode, String city, String phone) {
        if(!Helper.checkEmptyInput(name))
            p.setName(name);
        if(!Helper.checkEmptyInput(address))
            p.setAddress(address);
        if(!Helper.checkEmptyInput(postalCode))
            p.setPostalCode(postalCode);
        if(!Helper.checkEmptyInput(city))
            p.setCity(city);
        if(!Helper.checkEmptyInput(phone))
            p.setPhone(phone);
        return p;
    }
    
    //deletePerson
    public Person deletePerson(Person p) {
        return PersonContainer.getInstance().deletePerson(p.getId());
    }

    public HashMap<Integer, Loan> getLoans(Person p) {
        return PersonContainer.getInstance().findAllLoans(p);
    }
}
