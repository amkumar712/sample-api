package org.studio.sample.repository.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@Entity(name = "customer_email")
public class CustomerEmailEntity {

    @Id
    private Integer id;
    private String emailAddress;
    private String emailType;

    @ManyToOne(fetch = FetchType.LAZY)
    private CustomerEntity customer;
}
