package model;

import java.util.ArrayList;

public class MemberContainer {
    private static MemberContainer instance = null;
    private ArrayList<Member> members;
    
    private MemberContainer() {
        members = new ArrayList<>();
    }
    
    public static MemberContainer getInstance() {
        if(instance == null)
            instance = new MemberContainer();
        return instance;
    }
    
    public boolean addMember(Member m) {
        return members.add(m);
    }
    
    public ArrayList<Member> findAll() {
        ArrayList<Member> res = new ArrayList<>(members);
        return res;
    }
}