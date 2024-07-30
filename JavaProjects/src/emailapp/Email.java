package emailapp;

import java.util.Scanner;

public class Email {
private String firstname;
    private String lastname;
    private String password;
    private String department;
    private int mailboxCapacity;
    private String alternateEmail;

    //Constructor to receive the first and last name
    public Email(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        System.out.println("EMAIL CREATED: " + this.firstname + " " + this.lastname);

        //Call a method asking for the department - return it
        this.department = setDepartment();
        System.out.println("Department: " + this.department);
    }

    //Ask for department
    private String setDepartment() {
        System.out.println(" Department CODES\n1 for sales\n2 for development\n3 for accounting\n0 for none\nEnter code: ");
        Scanner in = new Scanner(System.in);
        int deptChoice = in.nextInt();
        if (deptChoice == 1) {return "sales";}
        else if (deptChoice == 2) {return "development";}
        else if (deptChoice == 3) {return "accounting";}
        else {return ""; }



    }
    //Generate a random password
    private String randomPassword (int length){
        String passwordSet = "QWERTY12345-+";
        char[] password = new char[length];
        return passwordSet;

    }
}
