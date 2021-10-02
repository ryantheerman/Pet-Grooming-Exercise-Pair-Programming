package com.techelevator.crm;

import com.techelevator.Billable;
import com.techelevator.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Customer extends Person implements Billable {

    private String phoneNumber;
    private List<String> pets = new ArrayList<>();

    public Customer(String firstName, String lastName, String phoneNumber) {
        super(firstName, lastName);
        this.phoneNumber = phoneNumber;
    }

    public Customer(String firstName, String lastName) {
        super(firstName, lastName);
        new Customer(firstName, lastName, "");
        this.phoneNumber = "";
    }

    public double getBalanceDue(Map<String, Double> servicesRendered) {
        double totalCost = 0.0;
        for (String service : servicesRendered.keySet()) {
            totalCost = totalCost + servicesRendered.get(service);
        }
        return totalCost;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<String> getPets() {
        return pets;
    }

    public void setPets(List<String> pets) {
        this.pets = pets;
    }


}
