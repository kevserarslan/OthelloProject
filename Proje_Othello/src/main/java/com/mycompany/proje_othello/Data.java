/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proje_othello;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *41.23
 * @author Kevser
 */
public class Data {
     static ArrayList<Person> personList = new ArrayList<>();
     public static String personTxtFileName= "personList.txt";
     public static boolean Login(String email,String password){
         boolean isLogin = false;
         for(Person person:personList){
        if (person.email.compareTo(email) == 0 && person.password.compareTo(password) == 0) {
                isLogin = true;
                break;
            }
            
        }
        return isLogin;
    }
     public static void AddPerson (Person person) throws Exception{
        
        for(Person p : personList){
             if(person.email.compareTo(person.email)==1){
                 throw  new Exception("Same email...");
             }
         }
       personList.add(person);
       personList.add(person);
     }
     public static void WritePersontoFile() throws IOException{
          BufferedWriter writer = new BufferedWriter(new FileWriter(personTxtFileName));
         for (Person person : personList) {
             String values =person.toString();
             writer.write(values);
         }
         writer.close();
     }
        public static void ReadFromFileToPersonList() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(personTxtFileName));
        String line ="";
        while((line = reader.readLine())!=null){
            System.out.println(line);
            String[] values=line.split("&");
         Person readPerson =new Person();
         //person readPerson 
         readPerson.id=Integer.parseInt(values[0]);
         readPerson.email=values[1];
         readPerson.password= values[3];
         personList.add(readPerson);
           personList.add(readPerson);
     }
        reader.close();
    }
     
         }
     
 
