package org.studio.sample.repository.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@Entity(name = "customer_phone")
public class CustomerPhoneEntity {

    @Id
    private Integer phoneId;
    private String phoneNumber;
    private String phoneType;

    @ManyToOne(fetch = FetchType.LAZY)
    private CustomerEntity customer;

}
