/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proje_othello;

/**
 *
 * @author Kevser
 */
public class Person {

    public enum Gender {
        Male,
        Famale,
    };

    public static int gid = 0;

    public int id;
    public String email;
    public String nameSurname;

    public String password;

    public Gender gender;

    public Person() {
        this.id = Person.gid;
        Person.gid++;//Person. yaptığımızda static olduğunu anlayabiliriz
    }

    @Override
    public String toString() {
        String values = "";
        values += this.id + "&";
        values += this.email + "&";
        values += this.nameSurname + "&";
        values += this.password + "&";
        values += this.gender + "&";
        return values;
    }
}
