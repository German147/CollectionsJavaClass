package com.collections.SortingAsUserWants;

public class Worker{
    int rolNumber;
    String name;
    String surname;
    int age;
    int salary;
//Let's generate the constructors
    public Worker() {
    }

    public Worker(int rolNumber, String name, String surname, int age, int salary) {
        this.rolNumber = rolNumber;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
    }
    public int getRolNumber() {
        return rolNumber;
    }

    public void setRolNumber(int rolNumber) {
        this.rolNumber = rolNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
