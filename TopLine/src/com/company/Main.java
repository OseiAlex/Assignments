package com.company;

import java.util.Scanner;

public class Main {

    private void userinput(){// first create website object

        website_class website;
        Scanner userinput = new Scanner(System.in);
        System.out.println("Enter One of the following website names\n"
                + " 1) " + website_class.CENTRE_PARKS + "\n 2) "
                + website_class.CLUB_18 + "\n 3) "
                + website_class.CLUB_SILVER + "\n");

        String websitename = userinput.nextLine();

        switch (websitename){

            case website_class.CLUB_18:
                website = new website_class(websitename);
                new Main().create_member(website);
                break;

            case website_class.CENTRE_PARKS:
                website = new website_class(websitename);
                new Main().create_member(website);
                break;

            case website_class.CLUB_SILVER:
                website = new website_class(websitename);
                new Main().create_member(website);
                break;

            default:
                System.out.println("Enter Valid website name\n");
                new Main().userinput();
        }

    }

    private void create_member(website_class website){

        System.out.print("Enter member email: ");
        Scanner emailinput = new Scanner(System.in);
        String email = emailinput.nextLine();

        if ((!email.isEmpty() || !email.equals("")) && email.contains("@")){
            // if email is not empty or equal to blank and it contains the "@" then create new member object
            member_class member = new member_class(email,website.random_id(),member_class.LOGGED_OUT);
            website.memberlogin(member);
            System.out.println("Your member ID is " + member.getMember_id());

            select_holiday(website,member);

        }else {
            System.out.println("Invalid email");
        }

    }

    private void select_holiday(website_class website, member_class member){
        System.out.println("\nSelect Holiday type by number ");
        System.out.println(
                " 1) "+ holiday_class.BEACH_HOLIDAY + "\n" +
                        " 2) "+ holiday_class.TOUR_HOLIDAY + "\n" +
                        " 3) "+ holiday_class.CONCERT_HOLIDAY + "\n");


        Scanner holiday_input = new Scanner(System.in);
        int selected_holiday = holiday_input.nextInt();

        member.select_holiday(website.getAvailable_holidays(selected_holiday));

        System.out.println("Enter Y or N to pay for selected holiday");
        Scanner payment_input = new Scanner(System.in);

        if (payment_input.nextLine().toLowerCase().equals("y") ){
            member.pay_for_holiday();
            System.out.println("\nLogout Y or N?");
            logout(payment_input.nextLine(), website,member);
            new Main().userinput();
        }else {
            System.out.println("Payment Rejected");
            new Main().userinput();
        }

    }

    private void logout(String reaponse, website_class website, member_class member){

        if (reaponse.toLowerCase().equals("y")){
            website.memberlogout(member);
        }else{

            new Main().userinput();
        }

    }


    public static void main(String[] args) {
        new Main().userinput();
    }


}
