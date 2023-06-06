package gr.aueb.cf.ch11;

import java.util.Scanner;

/**
 * Definition of a simple Student class
 * POJO (Plain Old Java Object)
 * Student Java Bean
 * private fields, setters, getters define a java bean
 */
public class Student {

    private static int studentsCount = 0;  // private final static int studentsCount; if the variable is final, the constructor can not initialize the
                                            // variable and it must be initialized in the static block or the declaration
    static Scanner in = new Scanner(System.in);


/*
example of static block where we can initialize a static variable and also include code (not just expressions)
    static {
        int num = in.nextInt();
        studentsCount = (num == 1) ? 1 : 0;
    }
*/

    private int id;
    private String firstname;
    private String lastname;

    public Student() {
        //studentsCount = 0;
        studentsCount++;
    }

    public Student(int id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        studentsCount++;
    }

    public static int getStudentsCount() {
        return studentsCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
