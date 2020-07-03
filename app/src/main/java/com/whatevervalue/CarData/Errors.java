package com.whatevervalue.CarData;

public class Errors {
    private String carID;
    private String Error1;
    private String Error2;
    private String Error3;
    private String Error4;
    private String Error5;

    public String getCarID() {
        return carID;
    }

    public void setCarID(String carID) {
        this.carID = carID;
    }

    public String getError1() {
        return Error1;
    }

    public void setError1(String error1) {
        Error1 = error1;
    }

    public String getError2() {
        return Error2;
    }

    public void setError2(String error2) {
        Error2 = error2;
    }

    public String getError3() {
        return Error3;
    }

    public void setError3(String error3) {
        Error3 = error3;
    }

    public String getError4() {
        return Error4;
    }

    public void setError4(String error4) {
        Error4 = error4;
    }

    public String getError5() {
        return Error5;
    }

    public void setError5(String error5) {
        Error5 = error5;
    }

    @Override
    public String toString() {
        return "Errors{" +
                "carID='" + carID + '\'' +
                ", Error1='" + Error1 + '\'' +
                ", Error2='" + Error2 + '\'' +
                ", Error3='" + Error3 + '\'' +
                ", Error4='" + Error4 + '\'' +
                ", Error5='" + Error5 + '\'' +
                '}';
    }
}
