package emailapp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity = 500;
    private String alternateEmail;
    private int defaultPasswordLength = 100;

    private String email;
    private String companySuffex = ".aeycompany.com";

    // Cosntructor
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email: " + this.firstName + " " + this.lastName);

        this.department = setDepartment();
        System.out.println("Department:  " + this.department);

        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is this:" + this.password);
        email = firstName.toLowerCase() + lastName.toLowerCase() +"@"+ this.department + companySuffex;
        System.out.println("This is email: " + email );
    }


    // Ask for department

    private String setDepartment() {
        System.out.println("Enter the department\n1 for Sale \n2 For Development\n3 for Accounting\n0 for none");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) { return "Sales";}
        else if (depChoice == 2) {return "Development";}
        else if (depChoice == 3) {return "Accounting";}
        else {return " ";}
    }

    // Generate random password
    private String randomPassword(int lenght) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVW1234567890!@#$%^";
        char[] password = new char[lenght];
        for (int i =0; i < lenght; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }

        return new String(password);
    }
    //
    public void setMailBoxCapacity(int capacity) {
        this.mailboxCapacity = capacity;

    }

    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;

    }

    public void changePassword(String password) {
        this.password = password;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public String getPassword() {
        return password;
    }
    public String showInfo() {
        return "DISPLAY NAME: " + firstName + " " + lastName +
                " COMPANY EMAIL: " + email +
                " MAILBOX CAPACITY: " + mailboxCapacity + "mb";

    }
}
