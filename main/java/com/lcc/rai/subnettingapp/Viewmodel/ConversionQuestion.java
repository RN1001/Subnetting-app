package com.lcc.rai.subnettingapp.Viewmodel;

import com.lcc.rai.subnettingapp.Models.Conversions;

public class ConversionQuestion {

    private String Question3;
    private String Question4;
    Conversions conversions;

    public String getQuestion3() {
        return Question3;
    }

    public void setQuestion3(String question3) {
        Question3 = question3;
    }

    public void setQuestion4(String question4) {
        Question4 = question4;
    }

    public String getQuestion4() {
        return Question4;
    }

    public int getDecimalNum() {
        conversions = new Conversions();
        return conversions.getDecimalNum();
    }

    public String getBinarySequence() {
        conversions = new Conversions();
        return conversions.BinaryNum();
    }

    public String CompareBinary(String answer) {
        return conversions.CompareBinarySequences(answer);
    }

    public String CompareDecimal(String answer) {
        return conversions.CompareDecimalValues(answer);
    }

}
