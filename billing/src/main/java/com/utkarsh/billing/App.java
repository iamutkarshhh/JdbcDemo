package com.utkarsh.billing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.utkarsh.billing.Customer.CoustomerDetails;

public class App 
{
    public static void main( String[] args )
    {
    	Coustomer cos = new Coustomer();
    	
    	CoustomerDetails cust1 =  new CoustomerDetails();
    	cust1.setName("Utkarsh");
    	cust1.setLname("Singh");
    	cust1.setAddress("Vasai");
    	cust1.setPhone_no(12);
    cos.addCoustomerDetails(cust1);
    	
    	
    }
}
    class Coustomer
    {
    	 	 
    	public void addCoustomerDetails(CoustomerDetails cust)
    	{
    		System.out.println("In coustomer");
    		String sql = "Insert into Coustomer values(?,?,?,?)";
    		try
    		{
    			Class.forName("org.h2.Driver");
    			System.out.println("Connected");
    			Connection con = DriverManager.getConnection("jdbc:h2:~/bill", "sa","");
    		    PreparedStatement pst = con.prepareStatement(sql);
    		    pst.setString(1, cust.getName());
    		    pst.setString(2, cust.getLname());
    		    pst.setString(3, cust.getAddress());
    		    pst.setInt(4, cust.getPhone_no());
    		    pst.executeUpdate();
    		    System.out.println("Updated");
    		}
    		catch (Exception e) {
				// TODO: handle exception
			}
    	}
    }

