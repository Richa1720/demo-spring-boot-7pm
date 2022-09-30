package com.example.demospringboot7pm.model;

public class Doctor {

    String name;
    double fees;
    String spec;

    public Doctor(String name, double fees, String spec) {
        this.name = name;
        this.fees = fees;
        this.spec = spec;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }
}
