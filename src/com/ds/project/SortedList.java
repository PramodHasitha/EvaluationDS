/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ds.project;

import com.ds.objects.House;
import java.util.List;

/**
 *
 * @author Ezio
 */
public class SortedList {

    private List<House> houses;

    public void setHouses(List<House> houses) {
        this.houses = houses;
    }

    public List<House> getShortHouses() {

        for (int i = houses.size()-1; i >=0; i--) {
            for (int j = 0; j < houses.size()-1; j++) {
                if (houses.get(j).getLotNumber() > houses.get(j+1).getLotNumber()) {
                    House t = houses.get(j);
                    houses.set(j, houses.get(j+1));
                    houses.set(j+1, t);
                }
            }
        }

        return houses;
    }
    
    

}
