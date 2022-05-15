package com.spring.foobar.demo.repositories;

import java.sql.ResultSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.foobar.demo.models.Customer;
import com.spring.foobar.demo.util.DatabaseConnection;

@Repository
public class CustomerRepository {

	@Autowired
	private DatabaseConnection dbconection;
	
	public Integer createCustomer(Customer customer) throws SQLException{
	
	String insertCustomerFormat="""
			   INSERT INTO customers(
					   customernumber,
					   customerName,
					   customerlastName,
					   customerFirstName,
					   phone,
					   address,
					   city,
					   state
					   pincode
					   creditlimit
					   )
			   VALUE(?,?,"NA","NA","NA","NA","NA","NA","NA","NA")""";
			   		
			   try(PreparedStatement preparedStatement=dbConnection.getConnection().preparedStatement()){
					   preparedStatement.setInt(1,customer.getCustomerNumber());
					   preparedStatement.setString(2,customer.getCustomerName());
					   preparedStatement.setString(3,customer.getphone());
					   return preparedstatement.executeUpdate();
			   }
			   
			   
	}
			   
	
	public Customer findCustomerByCustomerName(Integer customer) {
		String getCustomer Format=""""
				Select*fromcustomers where customername=?""""
						+ "   		\r\n"
						+ "			   try(PreparedStatement preparedStatement=dbConnection.getConnection().preparedStatement()){\r\n"
						+ "					   preparedStatement.setInt(1,customer.getCustomerNumber());"
						
						ResultSet rs= preparedStatement.executeQuery();
		
		if(!rs.isBeforeFirst()) {
		return null;
	}
	}
Customer customer=new Customer();
while(rs.next()) {
	customer.getCustomerName(rs.getString("customerName"));
	customer.getCustomerNumber()rs.getint("customerNumber");
	customer.setPhone(rs.getString("phone"));
}
return customer;

}
}
			   
			   
			   public List<Customer> findAllCustomers(){
				   return null;
			   }
			   
			   
			   public Integer updateCustomer (Customer customer) {
				   return null;
				   
				   
				   public Integer deleteCustomerByCustomerNumber(Integer customerNumber) {
					   return null;
				   
				   
				   
			   }	   
}
