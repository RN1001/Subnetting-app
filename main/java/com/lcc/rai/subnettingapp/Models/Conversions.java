package com.lcc.rai.subnettingapp.Models;

import android.widget.EditText;
import android.widget.TextView;

import com.lcc.rai.subnettingapp.Utilties.BinaryConverter;
import com.lcc.rai.subnettingapp.Utilties.Scores;

import java.util.Random;

public class Conversions {

    private int decimalNum;
    BinaryConverter converter;
    Random rand;

    public Conversions() {
        rand = new Random();
        this.decimalNum = rand.nextInt(255);
    }

    public int getDecimalNum() {
        return decimalNum;
    }

    public String BinaryNum() {
        String answer = Integer.toBinaryString(this.decimalNum);
        return String.format("%8s", answer).replace(" ", "0");
    }

    public void setDecimalNum(int decimalNum) {
        this.decimalNum = decimalNum;
    }

    public String CompareBinarySequences(String answer) {

        converter = new BinaryConverter();

        if (converter.ConvertToBinaryLiteral(getDecimalNum()).equals(converter.FormatStringTo8Bits(answer))) {
            return "Well done, binary sequence matched!";
        } else {
            return "Incorrect answer, please try again.";
        }
    }

    public String CompareDecimalValues(String answer) {

        converter = new BinaryConverter();

        if (answer.equals(converter.ConvertToDecimalValue(BinaryNum()))) {
            return "Well done, decimal value matched!";
        } else {
            return "Incorrect answer, please try again.";
        }

    }


}
