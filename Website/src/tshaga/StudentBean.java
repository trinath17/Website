/*
 * this java bean(student bean) is used set and get the values of the fields in the form
 * set method is used to assign the value of the field in a form to a string
 * get is used to retrieve and display the values of filed in the form/ 
 */
package tshaga;

public class StudentBean {

	
		private String studentid ;
		private String Name;
		private String address;
		private String city;
		private String state;
		private String Zip;
		private String Phone;
		private String emailid;
		private String URL;
		private String Date;
		private String things;
		private String gettoknow;
		private String comments;
		private String month;
		private String year;
		private String likelihood;
		
		public String getstudentid()  {
	        return studentid ;
	    }

	    public void setstudentid (String studentid ) {
	        this.studentid  = studentid ;
	    }

	    public String getName() {
	        return Name;
	    }

	    public void setName(String Name) {
	        this.Name = Name;
	    }
		
		
	    public String getAddress() {
	        return address;
	    }

	    public void setAddress(String address) {
	        this.address = address;
	    }

	    
	    public String getcity() {
	        return city;
	    }

	    public void setcity(String city) {
	        this.city = city;
	    }

	    public String getstate() {
	        return state;
	    }

	    public void setstate(String state) {
	        this.state = state;
	    }

	    public String getZip() {
	        return Zip;
	    }

	    public void setZip(String Zip) {
	        this.Zip = Zip;
	    }

	    public String getPhone() {
	        return Phone;
	    }

	    public void setPhone(String Phone) {
	        this.Phone = Phone;
	    }

	    public String getemailid() {
	        return emailid;
	    }

	    public void setemailid(String emailid) {
	        this.emailid = emailid;
	    }

	    public String getURL() {
	        return URL;
	    }

	    public void setURL(String URL) {
	        this.URL = URL;
	    }
	    public String getDate() {
	        return Date;
	    }

	    public void setDate(String Date) {
	        this.Date = Date;
	    }
	    public String getthings() {
	        return things;
	    }

	    public void setthings(String temp) {
	    	
	        this.things = temp;
	    }
		public String getgettoknow() {
	        return gettoknow;
	    }

	    public void setgettoknow(String gettoknow) {
	        this.gettoknow =gettoknow;
	    }
		
		public String getcomments() {
	        return comments;
	    }

	    public void setcomments(String comments) {
	        this.comments = comments;
	    }
		public String getmonth() {
	        return month;
	    }
	    public void setmonth(String month) {
	        this.month = month;
	    }
		public String getyear() {
	        return year;
	    }

	    public void setyear(String year) {
	        this.year = year;
	    }
		public String getlikelihood() {
	        return likelihood;
	    }

	    public void setlikelihood(String likelihood) {
	        this.likelihood = likelihood;
	    }

}
