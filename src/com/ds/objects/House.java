/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ds.objects;

/**
 *
 * @author Ezio
 */
public class House {
    
    private Long lotNumber;
    private String firstName;
    private String lastName;
    private Long price;
    private Long squareFeet;
    private Integer noOfBedroom;

    public Long getLotNumber() {
        return lotNumber;
    }

    public void setLotNumber(Long lotNumber) {
        this.lotNumber = lotNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getSquareFeet() {
        return squareFeet;
    }

    public void setSquareFeet(Long squareFeet) {
        this.squareFeet = squareFeet;
    }

    public Integer getNoOfBedroom() {
        return noOfBedroom;
    }

    public void setNoOfBedroom(Integer noOfBedroom) {
        this.noOfBedroom = noOfBedroom;
    }
    
    
    
}
