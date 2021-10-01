package com.techelevator.crm;

import java.util.ArrayList;
import java.util.List;

public class PetMethod {

    public static void main(String[] args) {

        List<String> vaccination = new ArrayList<>();

            vaccination.add("Rabies");
            vaccination.add("Distemper");
            vaccination.add("Parvo");

            String output = "";
            for (int i = 0; i < vaccination.size(); i++) {
                if (i < vaccination.size() - 1) {
                    output = output + vaccination.get(i) + ", ";
                } else {
                    output = output + vaccination.get(i);
                }

            }
        System.out.println(output);

        }
    }

