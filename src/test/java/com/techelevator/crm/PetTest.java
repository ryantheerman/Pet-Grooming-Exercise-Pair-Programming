package com.techelevator.crm;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PetTest {

    @Test
    public void list_of_vaccination_with_strings(){
        Pet p = new Pet();
        Assert.assertEquals("Rabies, Distemper, Parvo", p.listVaccinations());


    }
}
