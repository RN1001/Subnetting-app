package com.lcc.rai.subnettingapp.Viewmodel;

import android.widget.EditText;

import com.lcc.rai.subnettingapp.Models.Anding;

import java.util.Random;

public class AndingQuestion {

    private String Question5;
    Anding and = new Anding();

    public void setQuestion5(String question5) {
        Question5 = question5;
    }

    public String getQuestion5() {
        return Question5;
    }

    public int GetMask() {
        return and.RandomiseMaskGroup();
    }

    public int getOctet() {
        return and.getOctet();
    }

    public String getBinaryOctet(){
        return and.getBinaryOctet();
    }

    public int CompareBits(int octet, int mask) {
        return and.CompareBits(octet, mask);
    }

    public String CompareAnswer(String answer, String input) {
        return and.CompareAnswer(answer, input);
    }


    public void RandomiseOctet() {
        and.RandomiseOctet();
    }

}