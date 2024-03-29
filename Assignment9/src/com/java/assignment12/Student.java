package com.java.assignment12;

public class Student {
    int id;
    String name;
    int age;
    String gender;
    String engDepartment;
    int yearOfEnrollment;
    double perTillDate;

    public Student(int id,String name,int age,String gender,String engDepartment,int yearOfEnrollment,double perTillDate){
        this.id=id;
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.engDepartment=engDepartment;
        this.yearOfEnrollment=yearOfEnrollment;
        this.perTillDate=perTillDate;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public String getGender()
    {
        return gender;
    }

    public String getEngDepartment()
    {
        return engDepartment;
    }

    public int getYearOfEnrollment()
    {
        return yearOfEnrollment;
    }

    public double getPerTillDate()
    {
        return perTillDate;
    }
    @Override
    public String toString()
    {
        return "Id : "+id
                +", Name : "+name
                +", age : "+age
                +", Gender : "+gender
                +", Department : "+engDepartment
                +", Year Of Joining : "+yearOfEnrollment
                +", Percentage till date : "+perTillDate;

    }
}
