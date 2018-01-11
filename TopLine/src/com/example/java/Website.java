package com.example.java;

public class Website {
    private String Club;
    private int Hits;
    private int SalesTotal;
    private boolean LoginStatus;

    public void setClub(String Club) {
        Club = Club;
    }

    public void setHits(int Hits) {
        Hits = Hits;
    }

    public void setSalesTotal(int SalesTotal) {
        SalesTotal = SalesTotal;
    }

    public String getClub() {
        return Club;
    }

    public int getHits() {
        return Hits;
    }

    public int getSalesTotal() {
        return SalesTotal;
    }

    public void setLoginStatus(boolean loginStatus) {
        LoginStatus = loginStatus;
    }

    public boolean isLoginStatus() {
        return LoginStatus;
    }

    public void MemberLogin(){
            System.out.println("Club 18 welcomes member 6732, you are now logged in");
    }
    public void MemberLogout(){
            System.out.println("You're now logged out of Club 18, Goodbye");
    }
}
