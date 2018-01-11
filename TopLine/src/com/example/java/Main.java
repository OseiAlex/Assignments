package com.example.java;

public class Main {

    public static void main(String[] args) {
        Website MemberLogin = new Website();
        Website MemberLogout = new Website();

        MemberLogin.setLoginStatus(true);
        MemberLogin.setLoginStatus(false);
        MemberLogin.MemberLogin();
        MemberLogin.MemberLogout();


    }
}
