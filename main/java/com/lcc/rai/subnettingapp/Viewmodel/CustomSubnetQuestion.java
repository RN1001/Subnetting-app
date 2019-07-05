package com.lcc.rai.subnettingapp.Viewmodel;

import com.lcc.rai.subnettingapp.Models.Address;
import com.lcc.rai.subnettingapp.Models.Masks;

public class CustomSubnetQuestion {

    private String Question6;
    private Address address = new Address();
    private Masks mask;

    public void setQuestion6(String question6) {
        Question6 = question6;
    }

    public String getQuestion6() {
        return Question6;
    }

    public int getSubnets() {
        return address.getSubnets();
    }

    public int getHosts() {
        return address.getHosts();
    }

    public void randomiseSubnet() {
        address.randomiseSubnets();
    }

    public void randomiseHosts() {
        address.randomiseHosts();
    }

    public void setCustomValues() {
        mask = new Masks();
        mask.setCustomBitsBorrowed();
        address.setTotalNumOfSubnets();
        address.setTotalNumOfHosts();

    }

    public String generateAddress() {
        address.customExerciseAddress();
        return address.getIPaddress();
    }

    public String classAnswer(String answer) {
        return address.checkCustomAnswer(answer);
    }

    public String defMaskAnswer(String answer) {
        mask = new Masks();
        return mask.calcDefMask(address.getFirstOctet(), answer);
    }

    public String cusMaskAnswer(String answer) {
        mask = new Masks();
        return mask.calcCusMask(answer);
    }

    public String calcTotalNumOfSubnets(int answer) {
        return address.calculateTotNoOfSubnets(answer);
    }

    public String calcTotalNumOfHosts(int answer) {
        return address.calculateTotNoOfAddresses(answer);
    }

    public String calcUsableHosts(int answer) {
        return address.calculateUsableAddresses(answer);
    }

    public String calcCustomBitsBorrowed(int answer) {
        return  mask.calcCustomBitsBorrowed(answer);
    }

}
