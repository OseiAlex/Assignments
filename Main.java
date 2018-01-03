package com.example.java;

public class Main {

    public static void main(String[] args) {
        String eMail = "dextroalex@gmail.com";
        int membershipNumber = 6732;
        System.out.println("Members' email: " + eMail);
        System.out.println("Membership number: " + membershipNumber);
    }
}
    class LoginStatus{
    private final boolean loggedIn;

    private final String username;

        LoginStatus(boolean loggedIn, String username) {
            this.loggedIn = loggedIn;
            this.username = username;
        }
    }
