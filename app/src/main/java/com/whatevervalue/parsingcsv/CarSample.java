package com.whatevervalue.parsingcsv;

class CarSample {
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getAn() {
        return an;
    }

    public void setAn(int an) {
        this.an = an;
    }

    public String getMotorizare() {
        return motorizare;
    }

    public void setMotorizare(String motorizare) {
        this.motorizare = motorizare;
    }

    @Override
    public String toString() {
        return "CarSample{" +
                "marca='" + marca + '\'' +
                ", model='" + model + '\'' +
                ", an=" + an +
                ", motorizare='" + motorizare + '\'' +
                '}';
    }

    private String marca;
    private String model;
    private int an;
    private String motorizare;
}
