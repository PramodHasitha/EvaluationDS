/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ds.file;

import com.ds.objects.House;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ezio
 */
public class HouseFile {

    public List<House> readFile() {
        List<House> houses = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("HouseData"));

            String line;
            while ((line = br.readLine()) != null) {
//                System.out.println("line " + line);
                String[] rows = line.split("\t");
//                System.out.println("rows " + Arrays.toString(rows));

                House house = new House();
                house.setLotNumber(Long.parseLong(rows[0]));
                house.setFirstName(rows[1]);
                house.setLastName(rows[2]);
                house.setPrice(Long.parseLong(rows[3]));
                house.setSquareFeet(Long.parseLong(rows[4]));
                house.setNoOfBedroom(Integer.parseInt(rows[5]));

                houses.add(house);
            }

        } catch (FileNotFoundException e) {
            if (e.getMessage().equals("HouseData (The system cannot find the file specified)")) {
                BufferedWriter output = null;
                try {
                    File file = new File("HouseData");
                    output = new BufferedWriter(new FileWriter(file));
                } catch (IOException ex) {
                    Logger.getLogger(HouseFile.class.getName()).log(Level.SEVERE, null, ex);
                } finally {
                    try {
                        if (output != null) {
                            output.close();
                        }
                    } catch (IOException ex) {
                        Logger.getLogger(HouseFile.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(HouseFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        return houses;
    }

    public void saveHouseFile(House house) {
        try {
            FileWriter fw = new FileWriter("HouseData", true);
            fw.write(house.getLotNumber() + "\t" + house.getFirstName() + "\t" + house.getLastName() + "\t" + house.getPrice() + "\t" + house.getSquareFeet() + "\t" + house.getNoOfBedroom() + "\n");
            fw.close();
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }
    private String text = "";

    public void saveHouseList(List<House> house) {
        for (House h : house) {
            text += h.getLotNumber() + "\t" + h.getFirstName() + "\t" + h.getLastName() + "\t" + h.getPrice() + "\t" + h.getSquareFeet() + "\t" + h.getNoOfBedroom() + "\n";
        }
//        System.out.println(text);
        try {
            BufferedWriter output = null;
            File file = new File("HouseData");
            output = new BufferedWriter(new FileWriter(file));
            output.write(text);
            output.close();
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }

}
