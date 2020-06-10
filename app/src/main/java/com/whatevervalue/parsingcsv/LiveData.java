package com.whatevervalue.parsingcsv;

public class LiveData {
    private int barometric_pressure;
    private int engine_coolant_temp;
    private String fuel_level;
    private String engine_load;
    private String ambient_air_temp;
    private int engine_rpm;
    private int intake_manifold_pressure;
    private String maf;
    private int air_intake_temp;
    private String fuel_pressure;
    private int speed;
    private String engine_runtime;
    private String throttle_pos;
    private String dtc_number;
    private String trouble_codes;
    private String timing_advance;
    private String equiv_ratio;
    private int minute;
    private int hour;
    private int day;
    private int month;
    private int year;

    public int getBarometric_pressure() {
        return barometric_pressure;
    }

    public void setBarometric_pressure(int barometric_pressure) {
        this.barometric_pressure = barometric_pressure;
    }

    public int getEngine_coolant_temp() {
        return engine_coolant_temp;
    }

    public void setEngine_coolant_temp(int engine_coolant_temp) {
        this.engine_coolant_temp = engine_coolant_temp;
    }

    public String getFuel_level() {
        return fuel_level;
    }

    public void setFuel_level(String fuel_level) {
        this.fuel_level = fuel_level;
    }

    public String getEngine_load() {
        return engine_load;
    }

    public void setEngine_load(String engine_load) {
        this.engine_load = engine_load;
    }

    public String getAmbient_air_temp() {
        return ambient_air_temp;
    }

    public void setAmbient_air_temp(String ambient_air_temp) {
        this.ambient_air_temp = ambient_air_temp;
    }

    public int getEngine_rpm() {
        return engine_rpm;
    }

    public void setEngine_rpm(int engine_rpm) {
        this.engine_rpm = engine_rpm;
    }

    public int getIntake_manifold_pressure() {
        return intake_manifold_pressure;
    }

    public void setIntake_manifold_pressure(int intake_manifold_pressure) {
        this.intake_manifold_pressure = intake_manifold_pressure;
    }

    public String getMaf() {
        return maf;
    }

    public void setMaf(String maf) {
        this.maf = maf;
    }

    public int getAir_intake_temp() {
        return air_intake_temp;
    }

    public void setAir_intake_temp(int air_intake_temp) {
        this.air_intake_temp = air_intake_temp;
    }

    public String getFuel_pressure() {
        return fuel_pressure;
    }

    public void setFuel_pressure(String fuel_pressure) {
        this.fuel_pressure = fuel_pressure;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getEngine_runtime() {
        return engine_runtime;
    }

    public void setEngine_runtime(String engine_runtime) {
        this.engine_runtime = engine_runtime;
    }

    public String getThrottle_pos() {
        return throttle_pos;
    }

    public void setThrottle_pos(String throttle_pos) {
        this.throttle_pos = throttle_pos;
    }

    public String getDtc_number() {
        return dtc_number;
    }

    public void setDtc_number(String dtc_number) {
        this.dtc_number = dtc_number;
    }

    public String getTrouble_codes() {
        return trouble_codes;
    }

    public void setTrouble_codes(String trouble_codes) {
        this.trouble_codes = trouble_codes;
    }

    public String getTiming_advance() {
        return timing_advance;
    }

    public void setTiming_advance(String timing_advance) {
        this.timing_advance = timing_advance;
    }

    public String getEquiv_ratio() {
        return equiv_ratio;
    }

    public void setEquiv_ratio(String equiv_ratio) {
        this.equiv_ratio = equiv_ratio;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "LiveData{" +
                "barometric_pressure=" + barometric_pressure +
                ", engine_coolant_temp=" + engine_coolant_temp +
                ", fuel_level='" + fuel_level + '\'' +
                ", engine_load='" + engine_load + '\'' +
                ", ambient_air_temp='" + ambient_air_temp + '\'' +
                ", engine_rpm=" + engine_rpm +
                ", intake_manifold_pressure=" + intake_manifold_pressure +
                ", maf='" + maf + '\'' +
                ", air_intake_temp=" + air_intake_temp +
                ", fuel_pressure='" + fuel_pressure + '\'' +
                ", speed=" + speed +
                ", engine_runtime='" + engine_runtime + '\'' +
                ", throttle_pos='" + throttle_pos + '\'' +
                ", dtc_number='" + dtc_number + '\'' +
                ", trouble_codes='" + trouble_codes + '\'' +
                ", timing_advance='" + timing_advance + '\'' +
                ", equiv_ratio='" + equiv_ratio + '\'' +
                ", minute=" + minute +
                ", hour=" + hour +
                ", day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}
