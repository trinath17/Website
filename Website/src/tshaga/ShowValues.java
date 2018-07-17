/* this is the mail servlet file. It calls the other java and jsp files. 
 * 
 */
package tshaga;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.*;
import java.util.ArrayList;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

/**
 * Servlet implementation class showValues
 */
@WebServlet(name = "ShowValues", urlPatterns = {"/ShowValues"})
public class ShowValues extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
    public ShowValues() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		StudentDAO stu_dao1 = new StudentDAO();
		String ID1=request.getParameter("id");
		System.out.println(ID1);		
		StudentBean stu_bean1=stu_dao1.retrieveForm(ID1);
		//System.out.println("emailid:"+stubean5.getemailid());
		HttpSession session = request.getSession();
		session.setAttribute("student1", stu_bean1);
		String address1;
		if (stu_bean1 != null)
		{  address1 = "/WEB-INF/lib/student1.jsp";}
		else
		{
			address1= "/WEB-INF/lib/NoSuchStudent.jsp";
		}
		
		RequestDispatcher dispatcher;
		dispatcher = request.getRequestDispatcher(address1);
		dispatcher.forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		StudentDAO stu_dao= new StudentDAO();
		stu_dao.saveForm(request);
		float mean;
		double std_dev;
		String datan=request.getParameter("data");
		DataProcessor data_proc=new DataProcessor();
		mean=data_proc.Meancaluculation(datan);
		std_dev=data_proc.sdcalculation(datan,mean);
		DataBean data_bean=new DataBean();
		data_bean.setMean(mean);
		data_bean.setStandardDeviation(std_dev);
		//System.out.println("Mean:" +mean );
		//System.out.println("Stnd:"+std_dev);
		String id_string="";
		 try {
	            Class.forName("oracle.jdbc.driver.OracleDriver");

	            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@apollo.ite.gmu.edu:1521:ite10g", "tshaga", "oocmoo");
	            Statement stmt = con.createStatement();
	            ResultSet result = stmt.executeQuery("Select studentid from student");
	            while (result.next()) {
	                id_string=id_string+result.getString(1)+",";
	            }
	            
	            con.close();
	           
	        } catch (Exception e) {
	        }
		 String[] id_list = id_string.split(",");
		/* int i;
		 for(i=0;i<id_list.length;i++)
		 {
			 System.out.println(id_list[i]);
		 }*/
		request.setAttribute("id_jsp", id_list);
			HttpSession session = request.getSession();
			session.setAttribute("data_bean1", data_bean);			
			
			RequestDispatcher dispatcher;
		String address;
			if (data_bean.getMean() >= 90) {
				address = "/WEB-INF/lib/WinnerAcknowledgement.jsp";
			} else {
				address = "/WEB-INF/lib/SimpleAcknowledgement.jsp";
			}

			dispatcher = request.getRequestDispatcher(address);
			dispatcher.forward(request, response);
		
		
		
		
	
		
	}

}
