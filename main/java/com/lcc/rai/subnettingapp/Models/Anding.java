package com.lcc.rai.subnettingapp.Models;

import android.widget.EditText;

import java.util.Random;

public class Anding {

    Random random = new Random();

    private int octet;
    private int maskValue;
    private int maskGroup[] = {128, 192, 224, 240, 248, 252, 254, 255};

    public void RandomiseOctet() {
        this.octet = random.nextInt(254);
    }


    public int getOctet() {
        return octet;
    }

    public String getBinaryOctet() {
        String value = Integer.toBinaryString(this.octet);
        return String.format("%8s", value).replace(" ", "0");
    }

    public int RandomiseMaskGroup() {
        this.maskValue = random.nextInt(maskGroup.length);
        return maskGroup[maskValue];
    }

    public int CompareBits(int octet, int mask) {

        int answer = octet & mask;

        return answer;
    }

    public String CompareAnswer(String answer, String input) {

        if (input.equals(answer)) {
            return "Well done, answer is correct";
        } else {
            return "Incorrect answer, please try again";
        }

    }


}
