package com.bjsxt.cucumberTest.steps;

public class Autor {
    private String firstNa;
    private String secNa;
    private  String birth;


    public Autor(String firstNa, String secNa, String birth) {
        this.firstNa = firstNa;
        this.secNa = secNa;
        this.birth = birth;
    }

    public Autor() {
        firstNa = firstNa;
        secNa = secNa;
        birth = birth;
    }

    public String getFirstNa() {
        return firstNa;
    }

    public void setFirstNa(String firstNa) {
        this.firstNa = firstNa;
    }

    public String getSecNa() {
        return secNa;
    }

    public void setSecNa(String secNa) {
        this.secNa = secNa;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "firstNa='" + firstNa + '\'' +
                ", secNa='" + secNa + '\'' +
                ", birth='" + birth + '\'' +
                '}';
    }
}
