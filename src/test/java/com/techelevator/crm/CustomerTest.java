package com.techelevator.crm;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class CustomerTest {

    @Test
    public void getBalanceDue_test() {
        Customer c = new Customer("Captain", "Amazing");
        Map<String, Double> servicesRendered = new HashMap<>();
        servicesRendered.put("Walking", 50.75);
        servicesRendered.put("Grooming", 100.0);
        servicesRendered.put("Sitting", 25.0);
        c.getBalanceDue(servicesRendered);
        Assert.assertEquals(175.75, c.getBalanceDue(servicesRendered), .0);
    }
}
