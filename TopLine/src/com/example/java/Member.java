package com.example.java;

public class Member {
    private String Email;
    private int MembershipNumber;
    private boolean LoginStatus;

    public void setEmail(String Email) {
        this.Email = Email;
    }
    public void setMembershipNumber(int MembershipNumber){
        this.MembershipNumber = MembershipNumber;
    }

    public String getEmail() {
        return Email;
    }

    public int getMembershipNumber() {
        return MembershipNumber;
    }

}
