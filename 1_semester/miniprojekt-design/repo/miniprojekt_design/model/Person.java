package model;

public class Person {
    private int id;
    private String name;
    private String address;
    private String postalCode;
    private String city;
    private String phone;
    
    public Person (int id, String name, String address, String postalCode, String city, String phone){
        this.id = id;
        this.name = name;
        this.address = address;
        this.postalCode = postalCode;
        this.city = city;
        this.phone = phone;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId(){
      return id;  
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public void setAddress (String address){
        this.address = address;
    }
    
    public String getAddress (){
        return address;
    }
    
    public void setPostalCode(String postalCode){
        this.postalCode = postalCode;
    }
    
    public String getPostalCode (){
        return postalCode;
    }
    
    public void setCity (String city){
        this.city = city;
    }
    
    public String getCity(){
        return city;
    }
    
    public void setPhone(String phone){
        this.phone = phone;
    }
    
    public String getPhone(){
        return phone;
    }
    
    public String toString() {
        String res = "Person:\n";
        res += "ID: " + this.getId() + "\n";
        res += "Name: " + this.getName() + "\n";
        res += "Address: " + this.getAddress() + "\n";
        res += "Postal code: " + this.getPostalCode() + "\n";
        res += "City: " + this.getCity() + "\n";
        res += "Phone: " + this.getPhone() + "\n";
        return res;
    }
}
