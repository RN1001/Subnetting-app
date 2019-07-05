package com.lcc.rai.subnettingapp.Viewmodel;

import com.lcc.rai.subnettingapp.Models.Address;

public class ClassQuestion {

    private String question1;
    private Address address;

    public void setQuestion1(String question1) {
        this.question1 = question1;
    }

    public String getQuestion1() {
        return question1;
    }

    public String getAddress() {
        address = new Address();
        address.exerciseAddress();
        return address.getIPaddress();
    }

    public String getAnswer(boolean classA, boolean classB, boolean classC) {
        int octet = address.getFirstOctet();
        String res =  address.CheckAnswer(octet, classA, classB, classC);
        return res;
    }

}
