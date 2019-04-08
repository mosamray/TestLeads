package com.company;

import java.util.Date;
import java.util.Scanner;

public class SalesLead {

        //Data Members
        private int SalesLeadId;
        private String SalesLeadFirstName;
        private String SalesLeadLastName;
        //address
        private Date SalesLeadDate;
        //private SalesPerson SalesLeadAssignedTo;
        private Boolean SalesLeadActive;

        // Constructor method
        public SalesLead(int _SalesLeadId, String _SalesLeadFirstName, String _SalesLeadLastName) {
            this.SalesLeadId = _SalesLeadId;
            this.SalesLeadFirstName = _SalesLeadFirstName;
            this.SalesLeadLastName = _SalesLeadLastName;
        }

        public void printAllInformation() {
            System.out.println(SalesLeadId);
            System.out.println(SalesLeadFirstName);
            System.out.println(SalesLeadLastName);
        }


        // Add customers
        public Customer addCustomer(){
            int cCount = 1;
            Customer cust = new Customer(cCount++);
            Scanner scnr = new Scanner(System.in);
            System.out.println("Please Enter your Name: ");
            cust.setCustomerName(scnr.nextLine());
            System.out.println("Please Enter your Phone: ");
            cust.setCustomerPhoneNumber(scnr.nextLine());
            return cust;
        }

        //Setters and Getters
        public int getSalesLeadId() {
            return SalesLeadId; }
        public void setSalesLeadId(int _SalesLeadId) {
            this.SalesLeadId = _SalesLeadId;}

        public String getSalesLeadFistName() {
            return SalesLeadFirstName; }
        public void setSalesLeadFirstName(String _SalesLeadFirstName) {
            this.SalesLeadFirstName = _SalesLeadFirstName;}

        public String getSalesLeadLastName() {
            return SalesLeadLastName; }
        public void setSalesLeadLastName(String _SalesLeadLastName) {
            this.SalesLeadLastName = _SalesLeadLastName;}
    }

