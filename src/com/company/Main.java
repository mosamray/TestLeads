package com.company;

public class Main {

    public static void main(String[] args) {
        SalesLead sl = new SalesLead(1, "Ravi", "Patel");
        sl.printAllInformation();

        SalesLead s2 = new SalesLead(2, "Mary", "Smith");
        s2.printAllInformation();

        SalesLead s3 = new SalesLead(3, "Johnny", "Jones");
        s3.printAllInformation();
    }
}
