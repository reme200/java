
package com.main;

import java.io.PrintStream;


public class admin {
private int ID;
private String name;
private String address;
private int age;
private String description;
private String department;
     

    public admin() {
        //ecapsulation use setter
        setID(ID);
         this.ID = ID;
        this.name = name;
        this.address = address;
        this.age = age;
        this.description = description;
        this.department = department;
    }

    public admin(int ID, String name, String address, int age, String description, String department) {
        
        this.ID = ID;
        this.name = name;
        this.address = address;
        this.age = age;
        this.description = description;
        this.department = department;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

   public admin getCopy(){
       return(new admin(ID,name,address,age,description,department));
   }
    public static void printTableHeader(){
        System.out.printf("%-15s%-20s%-15s%-10s%-15s%-20s%n","ID","name","address","age","description","department");      

    }
    public void printAdminAsFormattedRow(){
        System.out.printf("%-15s",this.ID);
        System.out.printf("%-20s",this.name);
        System.out.printf("%-15s",this.address);
        System.out.printf("%-10s",this.age);
        System.out.printf("%-15s",this.description);
        System.out.printf("%-20s",this.department);

    }
}
