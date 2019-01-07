package model;

public class Member {
    private String name;
    private String phone;
    private String email;
    
    public Member(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public String getPhone() {
        return this.phone;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public void print() {
        System.out.println("Member:\nName: " + this.name + "\nPhone: " + this.phone + "\nEmail: " + this.email);
    }
}