package com.lcc.rai.subnettingapp.Models;

import android.widget.RadioButton;

import java.util.Random;

public class Octets {

    private int octet1;
    private int octet2;
    private int octet3;
    private int octet4;

    public Octets() {
        Random rand = new Random();
        this.octet1 = rand.nextInt(223);
        this.octet2 = rand.nextInt(255);
        this.octet3 = rand.nextInt(255);
        this.octet4 = rand.nextInt(254);
    }

    public int getOctet1() {
        return octet1;
    }

    public int getOctet2() {
        return octet2;
    }

    public int getOctet3() {
        return octet3;
    }

    public int getOctet4() {
        return octet4;
    }



}







