/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;


import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author ASUS
 */
public class Validation {
    public List<String> validateRegistration(Student st){
        
        ArrayList<String> err = new ArrayList<String>();
        if(st.getName().isEmpty()){
            err.add("Name ko duoc trong");
        }
        else if(st.getName().length()<4)
        {
            err.add("Ten ngan qua");
        }
         else if(st.getName().length()>50)
        {
            err.add("Ten dai qua");
        }
         else if(!isString(st.getName()))
        {
            err.add("Chi cho phep ki tu");
        }
        else if(st.getMailId().isEmpty()){
            err.add("Mail ko duoc de trong");
        } else if(!isValidEmailAddress(st.getMailId())){
            err.add("Mail khong dung gia tri");
        }
          if(st.getMobileNo().isEmpty()){
            err.add("Sdt ko duoc de trong");
        }else if(st.getMobileNo().length()!=10){
            err.add("Sdt sai");
        }else if(!isDigit(st.getMobileNo())){
            err.add("Sdt chi nen co chu so");
        }
        if(st.getPassword().isEmpty()){
            err.add("Pass ko duoc de trong");
        } else if(st.getPassword().length()<8)
        {
            err.add("Pass ngan qua");
        }else if(st.getPassword().length()>20)
        {
            err.add("Pass dai qua");
        }else if(!isStrongPassword(st.getPassword()))
        {
            err.add("Pass qua yeu");
        }
         if(st.getRePassword().isEmpty()){
            err.add("Pass ko duoc de trong");
        } else if(st.getRePassword().length()<8)
        {
            err.add("Pass ngan qua");
        }else if(st.getRePassword().length()>20)
        {
            err.add("Pass dai qua");
        }
         if(!st.getPassword().equals(st.getRePassword())){
              err.add("Pass khong khop");
         }
        return err;  
    }
    public boolean isValidEmailAddress(String email){
        String ePattern = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        Pattern p = Pattern.compile(ePattern);
        Matcher m = p.matcher(email);
        return m.matches();
    }
    public boolean isString(String name){
        String ePattern = "^[\\p{L} '-]+$";
        Pattern p = Pattern.compile(ePattern);
        Matcher m = p.matcher(name);
        return m.matches();
    }
     public boolean isStrongPassword(String pass){
        String ePattern = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$";
        Pattern p = Pattern.compile(ePattern);
        Matcher m = p.matcher(pass);
        return m.matches();
    }
    public boolean isDigit(String mobileNo){
        boolean digits = mobileNo.chars().allMatch(Character::isDigit);
        return digits;
    }
    
}
