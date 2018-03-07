package com.example.java;

public class Website {
    private int Hits;
    private int SalesTotal;

    public void setHits(int Hits) {
        Hits = Hits;
    }

    public void setSalesTotal(int SalesTotal) {
        SalesTotal = SalesTotal;
    }

    public int getHits() {
        return Hits;
    }

    public int getSalesTotal() {
        return SalesTotal;
    }

    public class Club18{
        private String Club;

        public Club18(String Club18){
            this.Club = Club;
        }
    }

    public void MemberLogin(){
            System.out.println("Club 18 welcomes member 6732, you are now logged in");
    }
    public void MemberLogout(){
            System.out.println("You're now logged out of Club 18, Goodbye");
    }
}
