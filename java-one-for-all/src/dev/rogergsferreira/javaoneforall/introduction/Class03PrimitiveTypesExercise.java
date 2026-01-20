package dev.rogergsferreira.javaoneforall.introduction;
/*
Create variables for the fields described below between <> and print the following message:
<name>, living in <address>, confirm that I received the salary of <salary> on <date>.
 */

public class Class03PrimitiveTypesExercise {
    static void main(String[] args) {
        String name = "Steve Rogers";
        String address = "Tiger Street, 55";
        double salary = 2500.0;
        String receivedSalaryDate = "08/01/2026";
        String report = name + " living in " + address +
                ", confirms that I received the salary of " + salary + " on " + receivedSalaryDate;

        System.out.println(report);
    }
}
