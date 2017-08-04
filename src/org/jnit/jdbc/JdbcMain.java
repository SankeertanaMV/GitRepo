package org.jnit.jdbc;

import java.sql.*;
import java.util.*;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class JdbcMain {
// Create getConnection()
	// Create connection
	// Create statement
	// Execute query
	// Process result
// Create Main method

	public static Connection getConnection() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javatraining", "root", "ROOT");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
// Get connection from DataSource
	public static Connection getConnectionWithDs() {
		Connection conn = null;
		MysqlDataSource ds = new MysqlDataSource();
		ds.setUser("root");
		ds.setPassword("ROOT");
		ds.setUrl("jdbc:mysql://localhost:3306/javatraining");
		
		try {
			conn = ds.getConnection();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return conn;
	
	}
    /*public static void create(){
    	Connection conn = getConnection();
		try {
			Statement s = conn.createStatement(); 
			String query  = "insert into customer(name,street,city,state,country,zipcode) values('sam','broad st','warrens','mo','us','64093')";
			int noOfRowsEffected = s.executeUpdate(query);
			System.out.println(noOfRowsEffected);
			while(rs.next()){
				System.out.println(rs.getString(2));
				System.out.println(rs.getInt("customerId"));
			}
			
			s.close();

		} catch (SQLException e) {

			e.printStackTrace();
		} 
    }*/
    public static void createWithPstmt(String name,String street,String city,String state,String country,String zipcode){
    	Connection conn = getConnection();
		try {
			String query  = "insert into customer(name,street,city,state,country,zipcode) values (?,?,?,?,?,?)";
			PreparedStatement pstmt = conn.prepareStatement(query); 
			pstmt.setString(1, name);
			pstmt.setString(2, street);
			pstmt.setString(3, city);
			pstmt.setString(4, state);
			pstmt.setString(5, country);
			pstmt.setString(6, zipcode);
				
			int noOfRowsEffected = pstmt.executeUpdate();
			System.out.println(noOfRowsEffected);
			
			pstmt.close();
			conn.close();

		} catch (SQLException e) {

			e.printStackTrace();
		} 
    }
    
    public static void createWithstmt(String name,String street,String city,String state,String country,String zipcode){
    	Connection conn = getConnection();
		try {
			String query  = "insert into customer(name,street,city,state,country,zipcode) values ('"+name+"','"+street+"','"+city+"','"+state+",'"+country+"','"+zipcode+"')";
			Statement stmt = conn.createStatement(); 
			
			int noOfRowsEffected = stmt.executeUpdate(query);
			System.out.println(noOfRowsEffected);
			
			stmt.close();
			conn.close();

		} catch (SQLException e) {

			e.printStackTrace();
		} 
    }
    
    public static Customer customerAccessing(int customerId){
    	Customer customer = new Customer();
    	Connection conn = getConnection();
    	
    	
    	try {
    		String sql = "select * from customer where customerId = ?";
			PreparedStatement st = conn.prepareStatement(sql);
			
			st.setInt(1, customerId);
			ResultSet rs = st.executeQuery();
			while(rs.next()){
				customer.setCustomerId(rs.getInt("customerId"));
				customer.setName(rs.getString("name"));
				customer.setStreet(rs.getString("street"));
				customer.setStreet(rs.getString("city"));
				customer.setStreet(rs.getString("state"));
				customer.setStreet(rs.getString("country"));
				customer.setStreet(rs.getString("zipcode"));
				
			}
			rs.close();
			conn.close();
			st.close();
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
		return customer;
    	
    	
    }
    
    public static Customer customerWithOrders(int customerId){
    	Customer customer = new Customer();
    	Connection conn = getConnection();
    	
    	
    	try {
    		String sql = "select c.name,c.city,o.item,o.orderId,o.order_status from customer c join ordersplaced o on c.customerId = o.customerId where c.customerId=?;";
			PreparedStatement st = conn.prepareStatement(sql);
			
			st.setInt(1, customerId);
			ResultSet rs = st.executeQuery();
			while(rs.next()){
				if(customer.getName() == null){
				customer.setName(rs.getString("name"));
				}
				if(customer.getCity() == null){
				customer.setCity(rs.getString("city"));
				}
				
				Order o = new Order();
				o.setOrderNo(rs.getInt("orderId"));
				o.setItem(rs.getString("item"));
				o.setStatus(OrderStatus.valueOf(rs.getString("order_status")));
				customer.getOrders().add(o);
			}
			rs.close();
			conn.close();
			st.close();
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
		return customer;
    	
    	
    }
    
    public static void callStoredProc(int customerId) throws SQLException{
    	Connection conn = getConnection();
    	CallableStatement cstmt = conn.prepareCall("call javatraining.fetchCustomers(?)");
    	cstmt.setInt(1, customerId);
    	ResultSet rs = cstmt.executeQuery();
    	while(rs.next()){
    		System.out.println(rs.getString("NAME"));
    		System.out.println(rs.getString("STREET"));
    		
    	}
    	rs.close();
		conn.close();
		cstmt.close();
    }
	public static void main(String[] args) throws SQLException {
		//create();
		//createWithPstmt("Santa", "Franklin", "Warrensburg", "MO", "USA", "64093");
		//Customer customer = customerAccessing(1);
		//System.out.println(customer);
		Customer customer = customerWithOrders(1);
		System.out.println( customer);
		callStoredProc(2);
	}

}
