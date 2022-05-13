package org.studio.sample.model;

import lombok.Data;

@Data
public class Address {

    private Integer addressId;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private String zipCode;
    private String addressType;
}
