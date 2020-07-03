package com.whatevervalue.parsingcsv;

 public class Car {

    //obiect de tip CarSample cu 7 atribute (cele din cars_info.csv)
    //CAR_ID,MARK,MODEL,CAR_YEAR,ENGINE_POWER,AUTOMATIC,FUEL_TYPE
    private String carID;
    private String marca;
    private String model;
    private int an;
    private String motorizare;
    private String automatic;
    private String fuel;
    private int km;

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

    public String getCarID() {
        return carID;
    }

    public void setCarID(String carID) {
        this.carID = carID;
    }

    public String getAutomatic() {
        return automatic;
    }

    public void setAutomatic(String automatic) {
        this.automatic = automatic;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

     public int getKm() {
         return km;
     }

     public void setKm(int km) {
         this.km = km;
     }

    @Override
    public String toString() {
        return "Car{" +
                "carID='" + carID + '\'' +
                ", marca='" + marca + '\'' +
                ", model='" + model + '\'' +
                ", an=" + an +
                ", motorizare='" + motorizare + '\'' +
                ", automatic='" + automatic + '\'' +
                ", fuel='" + fuel + '\'' +
                ", km='" + km + '\'' +
                '}';
    }
}
