package org.studio.sample.repository.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity(name = "customer")
public class CustomerEntity {

    @Id
    @Column(name = "customer_id")
    private Integer customerId;
    private String firstName;
    private String lastName;
    private String middleName;
    private String dob;
    private String gender;

    @OneToMany(cascade = CascadeType.ALL, targetEntity = CustomerPhoneEntity.class)
    @JoinColumn(name = "phone_id_FK", referencedColumnName = "customer_id")
    private List<CustomerPhoneEntity> phones;

    @OneToMany(cascade = CascadeType.ALL, targetEntity = CustomerAddressEntity.class)
    @JoinColumn(name = "address_id_FK", referencedColumnName = "customer_id")
    private List<CustomerAddressEntity> addresses;

    @OneToMany(cascade = CascadeType.ALL, targetEntity = CustomerEmailEntity.class)
    @JoinColumn(name = "email_id_FK", referencedColumnName = "customer_id")
    private List<CustomerEmailEntity> emails;
}
