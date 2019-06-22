package com.javasampleapproach.batchcsvpostgresql.dao;

import java.util.List;

import com.javasampleapproach.batchcsvpostgresql.model.Customer;
import org.springframework.context.annotation.Bean;

public interface CustomerDao {
	public void insert(List<? extends Customer> customers);
	List<Customer> loadAllCustomers();
}
