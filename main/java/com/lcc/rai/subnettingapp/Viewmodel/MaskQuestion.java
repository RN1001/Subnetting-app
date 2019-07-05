package com.lcc.rai.subnettingapp.Viewmodel;

import com.lcc.rai.subnettingapp.Models.Masks;

import java.util.Random;

public class MaskQuestion {

    Masks masks;
    private String Question2;
    private String[] maskArray = {"255.0.0.0", "255.255.0.0", "255.255.255.0" };


    public void setQuestion2(String question2) {
        Question2 = question2;
    }

    public String getQuestion2() {
        return Question2;
    }

    public String randomisedMask() {
        Random rand = new Random();
        int index = rand.nextInt(this.maskArray.length);
        return this.maskArray[index];
    }

    public int maskBits() {
        masks = new Masks();
        return masks.getBitsBorrowed();
    }

    public String CalcMask(int bits, boolean value1, boolean value2, boolean value3, boolean value4, boolean value5, boolean value6, boolean value7) {
        String answer = masks.CalculateMask(bits, value1, value2, value3, value4, value5, value6, value7);
        return answer;
    }

}
