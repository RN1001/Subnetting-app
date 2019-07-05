package com.lcc.rai.subnettingapp.Models;

import java.util.Random;

public class Address {

    private String IPaddress;
    private int firstOctet;
    private Octets octets;
    private int hosts;
    private int subnets;
    private int totalHosts;


    public Address() {

    }

    public void setIPaddress(String address) {
        this.IPaddress = address;
    }

    public String getIPaddress() {
        return IPaddress;
    }

    public void setFirstOctet(int firstOctet) {
        this.firstOctet = firstOctet;
    }

    public int getFirstOctet() {
        return firstOctet;
    }

    public void setHosts(int hosts) {
        this.hosts = hosts;
    }

    public int getHosts() {
        return hosts;
    }

    public void setSubnets(int subnets) {
        this.subnets = subnets;
    }

    public int getSubnets() {
        return subnets;
    }

    public void setTotalHosts(int totalHosts) {
        this.totalHosts = totalHosts;
    }

    public int getTotalHosts() {
        return totalHosts;
    }

    /**
     *  Randomises subnets for the custom subnet question.
     */
    public void randomiseSubnets() {
        Random random = new Random();
        this.subnets = random.nextInt(64 + 1);
    }

    /**
     *  Randomises hosts for the custom subnet question.
     */
    public void randomiseHosts() {
        Random random = new Random();
        this.hosts = random.nextInt(254 + 1);
    }

    /**
     * uses the octet instance to randomise 4 octets in an IP address, then sets the address for display purposes in the class exercise, sets the first octet for working out the class range in the class question.
     */
    public void exerciseAddress() {
        octets = new Octets();
        String address = Integer.toString(octets.getOctet1()) + "." + Integer.toString( octets.getOctet2()) + "." +  Integer.toString(octets.getOctet3()) + "." + Integer.toString(octets.getOctet4());
        setIPaddress(address);
        setFirstOctet(octets.getOctet1());
    }

    /**
     *  similar to exerciseAddress() however is used in the custom subnet question for working out the class of an IP address.
     */
    public void customExerciseAddress() {
        octets = new Octets();
        String address = Integer.toString(octets.getOctet1()) + "." + Integer.toString( octets.getOctet2()) + "." +  Integer.toString(octets.getOctet3()) + ".0";
        setIPaddress(address);
        setFirstOctet(octets.getOctet1());
    }

    /**
     * sets the number of subnets depending on the hosts, used for the custom subnet question, also used to calculate the number of subnets in another function: calculateTotNoOfSubnets().
     */
    public void setTotalNumOfSubnets() {
        if (this.getHosts() >= 127 && this.getHosts() <= 254) {
            this.setSubnets(1);
        } else if (this.getHosts() >= 63 && this.getHosts() <= 126) {
            this.setSubnets(2);
        } else if (this.getHosts() >= 31 && this.getHosts() <= 62) {
            this.setSubnets(4);
        } else if (this.getHosts() >= 15 && this.getHosts() <= 30) {
            this.setSubnets(8);
        } else if (this.getHosts() >= 7 && this.getHosts() <= 14) {
            this.setSubnets(16);
        } else if (this.getHosts() >= 3 && this.getHosts() <= 6) {
            this.setSubnets(32);
        } else if (this.getHosts() <= 2) {
            this.setSubnets(64);
        }
    }

    /**
     *  sets the total number of hosts, using the property hosts as a randomised value, used in the function to calculate the total number of addresses and the usable number of addresses.
     */
    public void setTotalNumOfHosts() {
        if (this.getHosts() >= 127 && this.getHosts() <= 254) {
            this.setTotalHosts(256);
        } else if (this.getHosts() >= 63 && this.getHosts() <= 126) {
            this.setTotalHosts(128);
        } else if (this.getHosts() >= 31 && this.getHosts() <= 62) {
            this.setTotalHosts(64);
        } else if (this.getHosts() >= 15 && this.getHosts() <= 30) {
            this.setTotalHosts(32);
        } else if (this.getHosts() >= 7 && this.getHosts() <= 14) {
            this.setTotalHosts(8);
        } else if (this.getHosts() >= 3 && this.getHosts() <= 6) {
            this.setTotalHosts(4);
        } else if (this.getHosts() <= 2) {
            this.setSubnets(2);
        }
    }

    /**
     *  compares the total num of subnets by input answer from the custom subnet view.
     * @param answer
     * @return
     */
    public String calculateTotNoOfSubnets(int answer) {

        if (answer == (this.getSubnets())) {
            return "Well done, that is correct.";
        } else {
            return "Incorrect, please try again";
        }

    }

    /**
     * Compares the total num of hosts by the input from the custom subnet view.
     * @param answer
     * @return
     */
    public String calculateTotNoOfAddresses(int answer){
        if (answer == this.getTotalHosts()) {
            return "Well done, that is correct.";
        } else {
            return "Incorrect, please try again";
        }
    }

    /**
     * Compares the usable hosts to the input from the custom subnet view.
     * @param answer
     * @return
     */
    public String calculateUsableAddresses(int answer) {
        int res = this.getTotalHosts() - 2;
        if (answer == res) {
            System.out.println("/////////////" + res);
            return "Well done, that is correct.";
        } else {
            return "Incorrect, please try again";
        }
    }

    /**
     * used in the classes question, compares firstOctet to address ranges then makes sure that the view (radio button) pass down true / false values to return feedback.
     * @param firstOctet
     * @param classA
     * @param classB
     * @param classC
     * @return
     */
    public String CheckAnswer(int firstOctet, boolean classA, boolean classB, boolean classC) {

        if (firstOctet > 0 && firstOctet <= 127) {
            if (classA == true) {
                return "Well done that is correct!";
            } else {
                return "Wrong, please try again";
            }
        } else if (firstOctet>= 128 && firstOctet <= 191) {
            if (classB == true) {
                return "Well done that is correct!";
            } else {
                return "Wrong, please try again";
            }
        } else if (firstOctet >= 192 && firstOctet <= 223) {
            if (classC == true) {
                return "Well done that is correct!";
            } else {
                return "Wrong, please try again";
            }
        }
        return null;
    }

    /**
     * Used for the custom subnet question, compares the property firstOctet to address ranges, then compares input to chars in string form
     * @param answer
     * @return
     */
    public String checkCustomAnswer(String answer) {

        if (this.getFirstOctet() > 0 && this.getFirstOctet() <= 127) {
            if (answer.equals("A") || answer.equals("a")) {
                return "Well done that is correct!";
            } else {
                return "Wrong, please try again";
            }
        } else if (this.getFirstOctet() >= 128 && this.getFirstOctet() <= 191) {
            if (answer.equals("B") || answer.equals("b")) {
                return "Well done that is correct!";
            } else {
                return "Wrong, please try again";
            }
        } else if (this.getFirstOctet() >= 192 && this.getFirstOctet() <= 223) {
            if (answer.equals("C") || answer.equals("c")) {
                return "Well done that is correct!";
            } else {
                return "Wrong, please try again";
            }
        }
        return null;
    }



}
