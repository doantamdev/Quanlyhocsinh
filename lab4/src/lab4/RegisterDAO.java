
package lab4;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class RegisterDAO {
   Connection con = null;
   PreparedStatement ps = null;
   ResultSet rs = null;
   int st; //status
   
   public int registerStudent(Student student){
       con = ConnectionFactory.getConennection();
       try{
           
           java.sql.Date sqlDate = new  java.sql.Date(student.getDob().getTime());
           String query ="insert into "
                   + "student "
                   + "(name, dob, gender, mailid, mobile_no, pass, program, branch, semester) "
                   + "values(?,?,?,?,?,?,?,?,?)";
                   ps = con.prepareStatement(query);
                   ps.setString(1,student.getName());
                   ps.setDate(2, sqlDate);
                   ps.setString(3,student.getGender());
                   ps.setString(4,student.getMailId());
                   ps.setString(5,student.getMobileNo());
                   ps.setString(6,student.getEncPassword());
                   ps.setString(7,student.getProgram());
                   ps.setString(8,student.getBranch());
                   ps.setInt(9, student.getSemester());
                                     
                   st = ps.executeUpdate();
                   System.out.println("Inserted student " + st);                 
       }catch(SQLException e){
            e.printStackTrace();
            st = -2;
       }
       return st;
   }
}
