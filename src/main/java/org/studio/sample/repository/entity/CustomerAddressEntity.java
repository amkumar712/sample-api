package org.studio.sample.repository.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "customer_address")
public class CustomerAddressEntity {

    @Id
    private Integer addressId;
    @Column(name = "address_line_1")
    private String addressLine1;
    @Column(name = "address_line_2")
    private String addressLine2;
    private String city;
    private String state;
    private String zip;
    private String addressType;

    @ManyToOne(fetch = FetchType.LAZY)
    private CustomerEntity customer;
}
