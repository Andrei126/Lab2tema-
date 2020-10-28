package com.company;

public class Stando {
    private String user;
    private String standName;
    private String standPower;
    private Integer age;
    private float height;

    public Stando(String user, String standName, String standPower, Integer age, float height) {
        this.user = user;
        this.standName = standName;
        this.standPower = standPower;
        this.age = age;
        this.height = height;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getStandName() {
        return standName;
    }

    public void setStandName(String standName) {
        this.standName = standName;
    }

    public String getStandPower() {
        return standPower;
    }

    public void setStandPower(String standPower) {
        this.standPower = standPower;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Stando{" +
                "user='" + user + '\'' +
                ", standName='" + standName + '\'' +
                ", standPower='" + standPower + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}
