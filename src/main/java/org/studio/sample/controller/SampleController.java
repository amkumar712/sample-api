package org.studio.sample.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.studio.sample.model.Address;
import org.studio.sample.model.Customer;
import org.studio.sample.model.Email;
import org.studio.sample.model.Phone;
import org.studio.sample.service.CustomerService;

import java.util.List;

@RestController
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class SampleController {

    private CustomerService customerService;

    @GetMapping("/welcome")
    public String welcome(@RequestHeader(value = "name", required = false) String name) {

        if(name == null || name.isEmpty()) {
            return "Welcome Guest!!!";
        }
        return "Welcome " + name;
    }

    @PostMapping("/customer")
    public String saveCustomer(@RequestBody Customer customer) {

        customerService.saveCustomer(customer);

        return "Customer is created Successfully";
    }

    public String updateCustomer(@RequestBody Customer customer) {


        return "Customer Data is updated Successfully";
    }

    private String deleteCustomer(@RequestHeader(name = "customerId") Integer customerId) {



        return "Customer " + customerId + " is deleted Successfully";
    }

    public String addNewPhone(@RequestHeader(name = "customerId") Integer customerId,
                              @RequestBody List<Phone> phones) {

        return "Phone number added";
    }

    public String addNewAddress(@RequestHeader(name = "customerId") Integer customerId,
                                @RequestBody List<Address> addresses) {

        return "Address added";
    }

    public String addNewEmail(@RequestHeader(name = "customerId") Integer customerId,
                              @RequestBody List<Email> emails) {

        return "Email added";
    }

    @GetMapping("/customer/{id}")
    public Customer getPersonalInformation(@PathVariable(name = "id") Integer userId) {

        return customerService.getCustomer(userId);

    }
}
