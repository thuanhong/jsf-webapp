package stackjava.com.hibernatedemo;

import stackjava.com.hibernatedemo.dao.CustomerDAO;
import stackjava.com.hibernatedemo.model.Customer;

public class MainApp {
	public static void main(String[] args) {
		demoInsert();
//		demoSearchByName();
		demoDelete();
	}
	
	public static void demoInsert() {
		CustomerDAO customerDAO = new CustomerDAO();
		customerDAO.save(new Customer("Kai", "Viet Nam"));
		customerDAO.save(new Customer("Thanos", "Viet Nam"));
		customerDAO.save(new Customer("Thor", "Asgard"));
		customerDAO.save(new Customer("Hulk", "USA"));
		customerDAO.save(new Customer("Iron Man", "USA"));
	}
	
	public static void demoFindById() {
		CustomerDAO customerDAO = new CustomerDAO();
		customerDAO.findById(2);
	}
	
	public static void demoShowAll() {
		CustomerDAO customerDAO = new CustomerDAO();
		customerDAO.showAll();
	}
	
	public static void demoSearchByName() {
		CustomerDAO customerDAO = new CustomerDAO();
		customerDAO.searchByName("th");
	}
	
	public static void demoDelete() {
		CustomerDAO customerDAO = new CustomerDAO();
		customerDAO.delete(1);
	}
}
