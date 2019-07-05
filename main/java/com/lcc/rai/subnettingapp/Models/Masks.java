package com.lcc.rai.subnettingapp.Models;

import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class Masks {

    private int bitsBorrowed;
    private int customBits;
    private String customMask;

    public Masks() {
        Random rand = new Random();
        this.bitsBorrowed = rand.nextInt(6);
    }

    public int getBitsBorrowed() {
        return bitsBorrowed;
    }

    public void setCustomBits(int customBits) {
        this.customBits = customBits;
    }

    public int getCustomBits() {
        return customBits;
    }

    public void setCustomMask(String customMask) {
        this.customMask = customMask;
    }

    public String getCustomMask() {
        return customMask;
    }

    public String CalculateMask(int bits, boolean value, boolean value1, boolean value2, boolean value3, boolean value4, boolean value5, boolean value6) {

        // no bits borrowed
        if (bits == 0) {
            if (value == true) {
                return "Well done that is correct!";
            } else {
                return "Incorrect answer, please try again";
            }
        }
        if (bits == 1) {
            if (value1 == true) {
                return "Well done that is correct!";
            } else {
                return "Incorrect answer, please try again";
            }
        }
        if (bits == 2) {
            if (value2 == true) {
                return "Well done that is correct!";
            } else {
                return "Incorrect answer, please try again";
            }
        }
        if (bits == 3) {
            if (value3 == true) {
                return "Well done that is correct!";
            } else {
                return "Incorrect answer, please try again";
            }
        }
        if (bits == 4) {
            if (value4 == true) {
                return "Well done that is correct!";
            } else {
                return "Incorrect answer, please try again";
            }

        }
        if (bits == 5) {
            if (value5 == true) {
                return "Well done that is correct!";
            } else {
                return "Incorrect answer, please try again";
            }
        }
        if (bits == 6) {
            if (value6 == true) {
                return "Well done that is correct!";
            } else {
                return "Incorrect answer, please try again";
            }
        }

        return null;
    }

    public String calcDefMask(int octet, String answer) {
        if (octet > 0 && octet <= 127) {
            if (answer.equals("255.0.0.0")) {
                return "Well done that is correct!";
            } else {
                return "Wrong, please try again";
            }
        } else if (octet >= 128 && octet <= 191) {
            if (answer.equals("255.255.0.0")) {
                return "Well done that is correct!";
            } else {
                return "Wrong, please try again";
            }
        } else if (octet >= 192 && octet <= 223) {
            if (answer.equals("255.255.255.0")) {
                return "Well done that is correct!";
            } else {
                return "Wrong, please try again";
            }
        }
        return null;

    }

    public String calcCusMask(String answer) {
        if (this.getCustomBits() == 0) {
            if (answer.equals("255.255.255.0")) {
                return "Well done that is correct!";
            } else {
                return "Wrong, please try again";
            }
        } else if (this.getCustomBits() == 1) {
            if (answer.equals("255.255.255.128")) {
                return "Well done that is correct!";
            } else {
                return "Wrong, please try again";
            }
        } else if (this.getCustomBits() == 2) {
            if (answer.equals("255.255.255.192")) {
                return "Well done that is correct!";
            } else {
                return "Wrong, please try again";
            }
        } else if (this.getCustomBits() == 3) {
            if (answer.equals("255.255.255.224")) {
                return "Well done that is correct!";
            } else {
                return "Wrong, please try again";
            }
        } else if (this.getCustomBits() == 4) {
            if (answer.equals("255.255.255.240")) {
                return "Well done that is correct!";
            } else {
                return "Wrong, please try again";
            }
        } else if (this.getCustomBits() == 5) {
            if (answer.equals("255.255.255.248")) {
                return "Well done that is correct!";
            } else {
                return "Wrong, please try again";
            }
        } else if (this.getCustomBits() == 6) {
            if (answer.equals("255.255.255.252")) {
                return "Well done that is correct!";
            } else {
                return "Wrong, please try again";
            }
        }
        return null;
    }

    public void setCustomBitsBorrowed() {
        Address address = new Address();
        if (address.getSubnets() == 1) {
            this.setCustomBits(0);
        } else if (address.getSubnets() == 2) {
            this.setCustomBits(1);
        } else if (address.getSubnets() == 4) {
            this.setCustomBits(2);
        } else if (address.getSubnets() == 8) {
            this.setCustomBits(3);
        } else if (address.getSubnets() == 16) {
            this.setCustomBits(4);
        } else if (address.getSubnets() == 32) {
            this.setCustomBits(5);
        } else if (address.getSubnets() == 64) {
            this.setCustomBits(6);
        }
    }

    public String calcCustomBitsBorrowed(int answer) {

        if (answer == this.getCustomBits()) {
            return "Well done, that is correct.";
        } else {
            return "Sorry that is incorrect, try again.";
        }

    }


}
