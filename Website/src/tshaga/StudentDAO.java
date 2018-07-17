/* This is java file it is used to store and retrieve the data that is submitted throughfrom 
 * information is stored in to a student bean using set bean and retrieved using get
 * data base connection is established using this file */


package tshaga;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import tshaga.StudentBean;

@WebServlet(name = "StudentDAO", urlPatterns = {"/StudentDAO"})

public class StudentDAO {
	public void saveForm(HttpServletRequest request) throws ServletException,
    IOException {
		    String name = request.getParameter("username");
	        String studentID = request.getParameter("studentid");
	        String address = request.getParameter("Address");
	        String city = request.getParameter("City");
	        String state = request.getParameter("State");
	        String zip = request.getParameter("zip");
	        String pno = request.getParameter("Phone");
	        String email = request.getParameter("Mail");
	        String url = request.getParameter("url");
	        String date = request.getParameter("Dos");
	        String[] thingsliked = request.getParameterValues("campue");
	        String howtosite = request.getParameter("university");
	        String comments = request.getParameter("comments");
	        String month = request.getParameter("month");
	        System.out.println(month);
	        String year = request.getParameter("year");
	        String rating = request.getParameter("likelihood");
	        String temp="";
	        StudentBean stud_bean = new StudentBean();
	        
	       
	        	stud_bean.setstudentid(studentID);
	        stud_bean.setName(name);
	        stud_bean.setAddress(address);
	        stud_bean.setcity(city);
	        stud_bean.setstate(state);
	        stud_bean.setZip(zip);
	        stud_bean.setPhone(pno);
	        stud_bean.setemailid(email);
	        stud_bean.setURL(url);
	        stud_bean.setDate(date);
	        for (int i = 0; i < thingsliked.length; i++) {
                temp = temp + thingsliked[i] + " ";
            }
	        stud_bean.setthings(temp);
	        stud_bean.setcomments(comments);
	        stud_bean.setgettoknow(howtosite);
	        stud_bean.setmonth(month);
	        stud_bean.setyear(year);
	        stud_bean.setlikelihood(rating);
	      
	        try
		       {
		    	   Class.forName("oracle.jdbc.driver.OracleDriver");
	    } catch (ClassNotFoundException ex) {
	        Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
	    }
		
	       
	        	        
	        try {
	        	 
	        	 Connection con;
	            con = DriverManager.getConnection("jdbc:oracle:thin:@apollo.ite.gmu.edu:1521:ite10g", "tshaga", "oocmoo");
	            System.out.println("Connection established");
	            


	            String sql = "insert into student values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	            System.out.println("Connection established");
	           
	            PreparedStatement prepared = con.prepareStatement(sql);
	            System.out.println("Connection established");
	            prepared.setString(1, stud_bean.getstudentid());
	            prepared.setString(2, stud_bean.getName());
	            prepared.setString(3, stud_bean.getAddress());
	            prepared.setString(4, stud_bean.getcity());
	            prepared.setString(5, stud_bean.getstate());
	            prepared.setString(6, stud_bean.getZip());
	            prepared.setString(7, stud_bean.getPhone());
	            prepared.setString(8, stud_bean.getemailid());
	            prepared.setString(9, stud_bean.getURL());
	            prepared.setString(10, stud_bean.getDate());
	            prepared.setString(11, stud_bean.getthings());
	            prepared.setString(12, stud_bean.getgettoknow());
	            prepared.setString(13, stud_bean.getcomments());
	            prepared.setString(14, stud_bean.getmonth());
	            prepared.setString(15, stud_bean.getyear());
	            prepared.setString(16, stud_bean.getlikelihood());
	            
	           
	              prepared.executeUpdate();
	              prepared.close();
	            if (con != null) {
	                con.close();
	            }
	        } catch (SQLException ex) {
	            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
	        }


	        
	}
	
	 @SuppressWarnings("resource")
	    public StudentBean retrieveForm(String id) {
	        StudentBean stud_bean = new StudentBean();
	 System.out.println("entered");
	        try {
	            Class.forName("oracle.jdbc.driver.OracleDriver");

	            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@apollo.ite.gmu.edu:1521:ite10g", "tshaga", "oocmoo");
	            Statement stmt = con.createStatement();
	            System.out.println("connection established");
	            System.out.println(id);
	            id="'"+id+"'";
	            System.out.println("Select * from student where studentid =" + id);
	            ResultSet result = stmt.executeQuery("Select * from student where studentid =" + id);
	            
	            while (result.next()) {
	            	System.out.println("entered retirieve");
	                stud_bean.setstudentid(result.getString(1));
	                stud_bean.setName(result.getString(2));
	                stud_bean.setAddress(result.getString(3));
	                stud_bean.setcity(result.getString(4));
	                stud_bean.setstate(result.getString(5));
	                stud_bean.setZip(result.getString(6));
	                stud_bean.setPhone(result.getString(7));
	                stud_bean.setemailid(result.getString(8));
	                stud_bean.setURL(result.getString(9));
	                stud_bean.setDate(result.getString(10));
	                stud_bean.setthings(result.getString(11));
	                stud_bean.setgettoknow(result.getString(12));
	                stud_bean.setcomments(result.getString(13));
	                stud_bean.setmonth(result.getString(14));
	                stud_bean.setyear(result.getString(15));	                
	                stud_bean.setlikelihood(result.getString(16));
	                System.out.println("fininshed retirieve");


	            }
	            System.out.println("exit");
	            System.out.println(stud_bean.getlikelihood());
	            con.close();
	           
	        } catch (Exception e) {
	        }
	        
       return stud_bean; 
	    }


}
	