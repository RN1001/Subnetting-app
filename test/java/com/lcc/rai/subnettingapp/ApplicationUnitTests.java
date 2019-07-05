package com.lcc.rai.subnettingapp;

import org.junit.Assert;
import org.junit.Test;

public class ApplicationUnitTests {

    @Test
    public void testClassChoice() {

        // random generated number on activity
        int generatedRandomFirstOctet = 160;
        // subnet class value when user selects
        char classChoice = 'b';

        if (generatedRandomFirstOctet <= 128) {
            Assert.assertEquals(classChoice, 'a');
        } else if (generatedRandomFirstOctet > 128 && generatedRandomFirstOctet <= 191) {
            Assert.assertEquals(classChoice, 'b');
        } else if (generatedRandomFirstOctet >= 192 && generatedRandomFirstOctet <= 230) {
            Assert.assertEquals(classChoice, 'c');
        }

    }

    @Test
    public void testSubnetMask() {
        
        int randomGeneratedBitsBorrowed = 2;
        int maskInput = 192;

        if (randomGeneratedBitsBorrowed == 1) {
            Assert.assertEquals(128, maskInput);
        } else if (randomGeneratedBitsBorrowed == 2) {
            Assert.assertEquals(192, maskInput);
        } else if (randomGeneratedBitsBorrowed == 3) {
            Assert.assertEquals(224, maskInput);
        } else if (randomGeneratedBitsBorrowed == 4) {
            Assert.assertEquals(240, maskInput);
        } else if (randomGeneratedBitsBorrowed == 5) {
            Assert.assertEquals(248, maskInput);
        } else if (randomGeneratedBitsBorrowed == 6) {
            Assert.assertEquals(252, maskInput);
        }

    }

    @Test
    public void testBinaryToDecimal() {

        int generatedDecimalValue = 192;
        String binaryInput = "11000000";

        Assert.assertEquals(Integer.toBinaryString(generatedDecimalValue), binaryInput);

    }

    @Test
    public void testDecimalToBinary() {
        String generatedBinaryValue = "10101001";
        int decimalinput = 169;

        Assert.assertEquals(generatedBinaryValue, Integer.toBinaryString(decimalinput));
    }

    @Test
    public void testBinaryAnding() {
        int genBinaryValue1, genBinaryValue2, result;

        genBinaryValue1 = 0b10011010;
        genBinaryValue2 = 0b11001101;

        result = genBinaryValue1 & genBinaryValue2;

        String res = Integer.toBinaryString(result);

        String binaryinput = "10001000";

        Assert.assertEquals(binaryinput, res);

    }

    @Test
    public void testCustomSubnetExercise() {
        //TODO:
    }

}
