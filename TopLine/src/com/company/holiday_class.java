package com.company;

public class holiday_class {

    final static String BEACH_HOLIDAY = "Beach";
    final static String TOUR_HOLIDAY = "Touring";
    final static String CONCERT_HOLIDAY = "Concert";

    final static String BEACH_CODE = "B";
    final static String TOUR_CODE = "T";
    final static String CONCERT_CODE = "C";

    final static int BEACH_TYPE = 0;
    final static int TOUR_TYPE = 1;
    final static int CONCERT_TYPE = 2;

    private String refNo;
    private String type;
    private int price;

    holiday_class(String refNo, String type, int price) {
        this.refNo = refNo;
        this.type = type;
        this.price = price;
    }

    String getRefNo() {
        return refNo;
    }

    public void setRefNo(String refNo) {
        this.refNo = refNo;
    }

    String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
