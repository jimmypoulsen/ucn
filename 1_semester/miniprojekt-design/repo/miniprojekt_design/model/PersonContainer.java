package model;
import java.util.*;

public class PersonContainer {
    private static PersonContainer instance = null;
    private HashMap<Integer, Person> persons;

    private PersonContainer(){
        persons = new HashMap<Integer, Person>();
    }
    
    public static PersonContainer getInstance(){
        if (instance == null){
            instance = new PersonContainer();
        }
        return instance;
    }
    
    public boolean addPerson(Person p) {
        if(persons.put(p.getId(), p) != null)
            return true;
        return false;
    }
    
    public Person findPerson(int id) {
        return persons.get(id);
    }

    public HashMap<Integer, Person> findAll() {
        HashMap<Integer, Person> res = new HashMap<Integer, Person>(persons);
        return res;
    }

    public Person deletePerson(int id){
        Person p = findPerson(id);
        persons.remove(p.getId());
        return p;
    }

    // used to determine which id to give a new person upon creation
    public int getLastPersonId() {
        int res = 0;
        Person p;
        if(!persons.isEmpty()) {
            p = persons.get(persons.size());
            res = p.getId();
        }
        return res;
    }

    public HashMap<Integer, Loan> findAllLoans(Person p) {
        HashMap<Integer, Loan> loans = new HashMap<Integer, Loan>(LoanContainer.getInstance().findAll());
        HashMap<Integer, Loan> res = new HashMap<Integer, Loan>();
       
        Loan current = null;
        int size = loans.size();
        for(int i = 1; i <= size; i++) {
            current = loans.get(i);
            if(current.getPerson().getId() == p.getId()) {
                res.put(current.getId(), current);
            }
        }
        return res;
    }
}

