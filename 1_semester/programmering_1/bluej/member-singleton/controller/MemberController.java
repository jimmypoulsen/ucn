package controller;

import java.util.*;
import model.*;

public class MemberController {
    public ArrayList<Member> findAllMembers() {
        ArrayList<Member> res = MemberContainer.getInstance().findAll();
        return res;
    }
    
    public Member createMember(String name, String phone, String email) {
        Member m = new Member(name, phone, email);
        
        if(!MemberContainer.getInstance().addMember(m))
            m = null;
            
        return m;
    }
}