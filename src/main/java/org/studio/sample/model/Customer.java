package org.studio.sample.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Data
public class Customer {

    private Integer customerId;
    private String firstName;
    private String lastName;
    private String middleName;
    private String customerName;
    private String gender;
    private String dateOfBirth;
    private List<Address> addresses;
    private List<Phone> phones;
    private List<Email> emails;

    /**
     * Returning Full Name (First Name, Middle Name, Last Name). It ignores the one which is empty or null.
     * Also, this will be in the same order as First name, Middle Name, Last Name.
     * @return String
     */
    public String getCustomerName() {
        return Stream.of(firstName, middleName, lastName).filter(StringUtils::isNotBlank).collect(Collectors.joining(" "));
    }

}
