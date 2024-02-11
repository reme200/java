
package com.main;
import java.util.Scanner;

public class login {
  private String  username;
  private String  password;

    public login() {
        this.username="null";
        this.password="null";
    }

    public login(String username, String password) {
        //this.username = username;
        //this.password = password;
        setUsername(username);
        setPassword(password);
    }

   

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

   

    public void setPassword(String  password) {
        this.password = password;
    }

   public boolean checklogin(String enterusername,String enterpassword){
       if (enterusername.equals("maram") && enterpassword.equals("123")){
           //this.username=enterusername;
           //this.password=enterpassword;
           return true;
       }
       else{
        //this.username="null";
        //this.password="null";
           return false;
       }
       
   }
  
}