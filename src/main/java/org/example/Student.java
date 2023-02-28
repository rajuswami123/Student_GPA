package org.example;

class Student{
    private String name;
    private int age;
    private double gpa;
    public Student(String name, int age, double gpa) {
        super();
        this.name = name;
        this.age = age;
        this.gpa = gpa;
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
    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "StudentTest [toString()=" + super.toString() + "]";
    }

}



