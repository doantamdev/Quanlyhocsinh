/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

import java.io.Serializable;
import java.security.Timestamp;
import java.util.Date;

/**
 *
 * @author ASUS
 */
public class Student implements Serializable {
    private long id;
    private String name;
    private Date dob;
    private String gender;
    private String mailId;
    private String mobileNo;
    private String password;
    private String rePassword;
    private String encPassword;  // mã hóa
    private String program;
    private String branch;
    private int semester;
    private Timestamp addDate;
    
    public Student(){
        
    }
    public Student(long id,String name,String gender,String mailId,String mobileNo,String branch){
        this.id =id;
        this.name = name;
        this.gender = gender;
        this.mailId = mailId;
        this.mobileNo = mobileNo;
        this.branch = branch;
    }
    
    public Student(String name,Date dob,String gender,String mailId,String mobileNo,
             String password,String rePassword,String program,String branch,int semester){
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.mailId = mailId;
        this.mobileNo = mobileNo;
        this.password = password;
        this.rePassword = rePassword;
        this.program = program;
        this.branch = branch;
        this.semester = semester;
    }
    
    public Student(long id,String name,Date dob,String gender,String mailId,String mobileNo,
             String password,String rePassword,String program,String branch,int semester,Timestamp addDate){
        this.id =id;
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.mailId = mailId;
        this.mobileNo = mobileNo;
        this.password = password;
        this.rePassword = rePassword;
        this.program = program;
        this.branch = branch;
        this.semester = semester;
        this.addDate = addDate;
    }
    
    @Override
    public String toString(){
        return "Student { " + " id= " +id + ", name: " + name + ", dob: "
                + dob + ", gender " + gender + ", mailId: " + mailId +
                ", mobileNo: " + mobileNo + ", password: " + password +
                ", rePassword: " + rePassword + ", program: " + program +
                ", branch: " + branch + ", semester: " + semester + 
                ", addDate: " +addDate + "}";
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    public String getMailId() {
        return mailId;
    }

    public void setMailId(String mailId) {
        this.mailId = mailId;
    }


    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRePassword() {
        return rePassword;
    }

    public void setRePassword(String rePassword) {
        this.rePassword = rePassword;
    }

    public String getEncPassword() {
        return encPassword;
    }

    public void setEncPassword(String encPassword) {
        this.encPassword = encPassword;
    }

    public String getProgram() {
        return program;
    }
    
    public void setProgram(String program) {
         this.program = program;
    }
    
    public String getBranch() {
          return branch;
     }

    public void setBranch(String branch) {
        this.branch = branch;
     } 


    public int getSemester() {
        return semester;
     }

    public void setSemester(int semester) {
        this.semester = semester;
     }


    public Timestamp getAddDate() {
        return addDate;
    }

    public void setAddDate(Timestamp addDate) {
       this.addDate = addDate;
    }
     
    
}
