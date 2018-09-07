package com.company;

import java.util.Random;

public class website_class {

    final static String CLUB_18 = "club 18";
    final static String CENTRE_PARKS = "centre parks";
    final static String CLUB_SILVER = "club silver";

    private String website_name;
    private int hits;
    private int salesTotal;
    private holiday_class available_holidays;

    website_class(String website_name) {
        this.website_name = website_name;
    }

    int random_id(){

        Random id_num = new Random();
        return id_num.nextInt(9999);
    }

    private int getPrice(int holidaytype) {

        int[] holiday_price = new int[]{};

        switch (getWebsite_name()){

            case website_class.CLUB_18:
                holiday_price = new int[]{200,800,500};
                break;
            case website_class.CENTRE_PARKS:
                holiday_price = new int[]{800,1500,1000};
                break;
            case website_class.CLUB_SILVER:
                holiday_price = new int[]{700,1000,1200};
                break;


        }

        return  holiday_price[holidaytype];
    }

    void memberlogin(member_class member){
        member.setLoginstatus(member_class.LOGGED_IN);
        member.setWebsite(this);
        member.setMember_id(random_id());
        System.out.println(getWebsite_name() + " Welcomes Member " + member.getMember_id() + " You are now logged in.");
    }

    void memberlogout(member_class member){
        member.setLoginstatus(member_class.LOGGED_OUT);
        System.out.println("Member " + member.getMember_id() + " You are now logged out of " + website_name);
    }

    public void setAvailable_holidays(holiday_class available_holidays) {
        this.available_holidays = available_holidays;
    }

    private String getWebsite_name() {
        return website_name;
    }

    public void setWebsite_name(String website_name) {
        this.website_name = website_name;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    public int getSalesTotal() {

        return salesTotal;
    }

    public void setSalesTotal(int salesTotal) {
        this.salesTotal = salesTotal;
    }

    holiday_class getAvailable_holidays(int holidaytype) {

        String ref;

        int selection = holidaytype-1;

        switch (selection){

            case holiday_class.BEACH_TYPE:
                ref = holiday_class.BEACH_CODE + String.valueOf( random_id());
                available_holidays = new holiday_class(ref,holiday_class.BEACH_HOLIDAY,getPrice(selection));
                break;
            case holiday_class.TOUR_TYPE:
                ref = holiday_class.TOUR_CODE + String.valueOf( random_id());
                available_holidays = new holiday_class(ref,holiday_class.TOUR_HOLIDAY,getPrice(selection));
                break;
            case holiday_class.CONCERT_TYPE:
                ref = holiday_class.CONCERT_CODE + String.valueOf( random_id());
                available_holidays = new holiday_class(ref,holiday_class.CONCERT_HOLIDAY,getPrice(selection));
                break;

        }

        return available_holidays;
    }

    void checkout(member_class member, holiday_class holiday){
        String paymentmade = "Member " + member.getMember_id() +
                " has made payment for "+ holiday.getType() + " holiday with ref number " + holiday.getRefNo();
        System.out.println(paymentmade);
    }
}
