package org.studio.sample.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.studio.sample.model.Address;
import org.studio.sample.model.Customer;
import org.studio.sample.model.Email;
import org.studio.sample.model.Phone;
import org.studio.sample.repository.entity.CustomerAddressEntity;
import org.studio.sample.repository.entity.CustomerEmailEntity;
import org.studio.sample.repository.entity.CustomerEntity;
import org.studio.sample.repository.entity.CustomerPhoneEntity;

@Mapper(componentModel = "spring")
public interface CustomerMapper  {

    @Mapping(source = "dob", target = "dateOfBirth")
    Customer mapCustomer(CustomerEntity customerEntity);

    Phone mapPhone(CustomerPhoneEntity customerPhoneEntity);

    Email mapEmail(CustomerEmailEntity customerEmailEntity);

    @Mapping(source = "zip", target = "zipCode")
    Address mapAddress(CustomerAddressEntity customerAddressEntity);

}
