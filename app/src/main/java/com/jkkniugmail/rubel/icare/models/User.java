package com.jkkniugmail.rubel.icare.models;

/**
 * Created by islan on 2/19/2017.
 */

public class User {
    private int id;
    private String name;
    private int age;
    private float height;
    private  float weight;
    private int family_code;

    public User() {
        //default constructor
    }

    public User(String name, int age, float height, float weight, int family_code) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.family_code = family_code;
    }

    public User(float weight, int family_code, float height, String name, int age, int id) {
        this.weight = weight;
        this.family_code = family_code;
        this.height = height;
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getFamily_code() {
        return family_code;
    }

    public void setFamily_code(int family_code) {
        this.family_code = family_code;
    }
}
