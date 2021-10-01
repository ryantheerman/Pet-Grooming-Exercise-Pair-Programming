package com.techelevator.crm;

import java.util.ArrayList;
import java.util.List;

public class Pet {
    private String name;
    private String species;
    private List<String> vaccination = new ArrayList<>();

    public Pet(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public String listVaccinations(){
        vaccination.add("Rabies");
        vaccination.add("Distemper");
        vaccination.add("Parvo");
        return vaccination;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public List<String> getVaccination() {
        return vaccination;
    }

    public void setVaccination(List<String> vaccination) {
        this.vaccination = vaccination;
    }
}
