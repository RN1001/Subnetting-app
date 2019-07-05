package com.lcc.rai.subnettingapp.Utilties;

/**
 * converts octets to binary sequences
 */
public class BinaryConverter {

    /**
     *
     * @param binSeq
     * @return formatted binary sequence with 8 bits (String)
     */
    public String ConvertToBinaryLiteral(int binSeq) {
        String BinaryLiteral = Integer.toBinaryString(binSeq);
        return String.format("%8s", BinaryLiteral).replace(" ", "0");
    }

    /**
     *  used for binary to decimal, converts the answer into a formatted binary sequence
     * @param value
     * @return
     */
    public String FormatStringTo8Bits(String value) {
        return String.format("%8s", value).replace(" ", "0");
    }

    /**
     *  Converts a String(binary sequence) into a decimal value
     * @param binaryLiteral
     * @return
     */
    public String ConvertToDecimalValue(String binaryLiteral) {
        int decValue = Integer.parseInt(binaryLiteral, 2);
        return Integer.toString(decValue);
    }



}
