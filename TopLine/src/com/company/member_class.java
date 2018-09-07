package com.company;

public class member_class {

    final static boolean LOGGED_IN = true;
    final static boolean LOGGED_OUT = false;

    private String email;
    private int member_id;
    private holiday_class holiday;
    private boolean loginstatus;
    private website_class website;

    member_class(String email, int member_id, boolean loginstatus) {
        this.email = email;
        this.member_id = member_id;
        this.loginstatus = loginstatus;
    }

    void select_holiday(holiday_class memberHoliday){
        this.holiday = memberHoliday;
        System.out.println("Member " + getMember_id() + " has selected holiday ref number "
                + memberHoliday.getRefNo() + ", a " + memberHoliday.getType() + " holiday at £" + memberHoliday.getPrice() + " per person.");
    }

    void pay_for_holiday(){
        getWebsite().checkout(this,getHoliday());
    }

    public holiday_class getHoliday() {
        return holiday;
    }

    public void setHoliday(holiday_class holiday) {
        this.holiday = holiday;
    }

    public website_class getWebsite() {
        return website;
    }

    public void setWebsite(website_class website) {
        this.website = website;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMember_id() {
        return member_id;
    }

    public void setMember_id(int member_id) {
        this.member_id = member_id;
    }

    public boolean isLoginstatus() {
        return loginstatus;
    }

    public void setLoginstatus(boolean loginstatus) {
        this.loginstatus = loginstatus;
    }
}
