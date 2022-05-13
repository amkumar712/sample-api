package org.studio.sample.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.studio.sample.mapper.CustomerEntityMapper;
import org.studio.sample.mapper.CustomerMapper;
import org.studio.sample.model.Customer;
import org.studio.sample.repository.CustomerRepository;
import org.studio.sample.repository.entity.CustomerEntity;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class CustomerService {

    private CustomerRepository customerRepository;
    private CustomerMapper customerMapper;
    private CustomerEntityMapper customerEntityMapper;

    public Customer saveCustomer(Customer customer) {

        CustomerEntity customerEntity = customerEntityMapper.mapCustomerEntity(customer);

        customerEntity = customerRepository.save(customerEntity);

        return customerMapper.mapCustomer(customerEntity);

    }

    public Customer getCustomer(Integer customerId) {

        CustomerEntity customerEntity = customerRepository.getById(customerId);

        return customerMapper.mapCustomer(customerEntity);
    }
}
