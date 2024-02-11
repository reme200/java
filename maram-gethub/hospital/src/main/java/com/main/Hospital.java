package com.main;
import java.util.ArrayList;
import java.util.Scanner;
import javax.print.attribute.standard.Finishings;
public class Hospital {
static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("new changes");
        System.out.println("enter username:");
        String enterusername=input.nextLine();
        System.out.println("enter password:");
        String enterpassword=input.nextLine();
        login l1=new login(enterusername, enterpassword);
        if(l1.checklogin(enterusername, enterpassword)) {
            System.out.println("login sucsesful");
            continueLogin();
        }
        else{
            System.out.println("incorrect password or username");
        }
    }
      public static void continueLogin(){
        ArrayList<admin>arr=new ArrayList<>();
      arr.add(new admin( 1,"maram","Jordan",19,"Anemia","Outpatient Clinic"));
      arr.add(new admin( 2,"ruba","Jordan",20,"Thyroid Gland","Endocrinology"));
      arr.add(new admin( 3,"sara","Jordan",19,"Sinusitis","Ear , Nose and Throat (ENT)"));
      arr.add(new admin( 4,"noura","Jordan",28,"Computed Tomography","Radiology"));
      arr.add(new admin( 5,"lina","Jordan",26,"Stimulant","Psychiatry"));
      arr.add(new admin( 6,"majd","Jordan",21,"Stimulant","Psychiatry"));
      arr.add(new admin( 7,"rama","Jordan",17,"Orthodontics","Dentistry"));               
      int choice=0;
      do{
         drawMenu();
         choice=input.nextInt();
         switch(choice){
             case 1:
                 System.out.println("Add new patient");
                 Addpatient(arr);
                  break;
             case 2:
                 System.out.println("print all patient");
                 printAllpatient(arr);
                  break;
            case 3:
                 System.out.println("Delete an patient");
                 System.out.println("enter patient ID you want delete");
                 int ID=input.nextInt();
                 int index=searchforanpatient(arr,ID);
                 if(index==-1){
                     System.out.println("the patient not found");
                 }
                 else{
                     arr.remove(index);
                     System.out.println(" patient is delete ");
                 }
                  break;
            case 4:
                 System.out.println("search for an patient");
                 System.out.println("enter patient name you want to search");
                 String  name=input.next();
                 index=searchforanpatientbyname(arr, name);
                 if(index==-1){
                 System.out.println("patient not found");
                 }
                 else{
                 System.out.println("patient found in index number"+index);
                 }        
                  break;
            case 5:
                 System.out.println("sort patient by name");
                  break;
            case 0:
                 System.out.println("To exit");
             break;
            default:
                System.out.println("No such choice");
         }
      }
      while(choice!=0);
    }

    public static void drawMenu(){
        System.out.println("what would you like to do: ");
        System.out.println("1- Add new patient");
        System.out.println("2-print all patient");
        System.out.println("3-Delete an patient");
        System.out.println("4-search for an patient");
        System.out.println("5-sort patient by name");
        System.out.println("0-To exit");
        System.out.println("Enter a choice");
    }
    public static void Addpatient(ArrayList<admin>arr){
        admin a1=new admin ();
        System.out.println("Enter patient ID");
        a1.setID(input.nextInt());
        System.out.println("Enter patient name ");
        a1.setName(input.next());
        System.out.println("Enter patient address");
        a1.setAddress(input.next());
        System.out.println("Enter patient age");
        a1.setAge(input.nextInt());
        System.out.println("Enter patient description");
        a1.setDescription(input.next());
        System.out.println("Enter patient department");
        a1.setDepartment(input.next());
        arr.add(a1);
        System.out.println("new patient is add");
    }
    public static void printAllpatient(ArrayList<admin>arr)    {
        admin.printTableHeader();
        for (int i = 0; i <arr.size(); i++) {
            arr.get(i).printAdminAsFormattedRow();
           System.out.println("\n\n");}
    }
    public static int searchforanpatientbyname(ArrayList<admin>arr,String name){
        for (int i = 0; i <arr.size(); i++) {
            if(arr.get(i).getName().equals(name))
                return i;
        }
        return -1;
    }
    public static int searchforanpatient(ArrayList<admin>arr,int ID){
        for (int i = 0; i <arr.size(); i++) {
            if(arr.get(i).getID()==ID)
                return i;
        }
        return -1;
    }

    
}



