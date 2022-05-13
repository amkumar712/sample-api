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
public interface CustomerEntityMapper {

    @Mapping(source = "dateOfBirth", target = "dob")
    CustomerEntity mapCustomerEntity(Customer customer);

    CustomerPhoneEntity mapPhoneEntity(Phone phone);

    CustomerEmailEntity mapEmailEntity(Email email);

    @Mapping(source = "zipCode", target = "zip")
    CustomerAddressEntity mapAddressEntity(Address address);

}
