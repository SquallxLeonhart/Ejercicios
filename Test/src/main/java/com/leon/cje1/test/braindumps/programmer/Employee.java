package com.leon.cje1.test.braindumps.programmer;

import java.util.Optional;

import javax.enterprise.inject.New;

public class Employee {
    Optional<Address> address;

    Employee(Optional<Address> address) {
        this.address = address;
    }

    public Optional<Address> getAddress() {
        return address;
    }

    public static void main(String[] args) {
        Address address = null;
        Optional<Address> addrs1 = Optional.ofNullable(address);
        Employee e1 = new Employee(addrs1);
        String eAddress = (addrs1.isPresent()) ? addrs1.get().getCity() : "City Not available";
        System.out.println(eAddress);
        
    }
}

class Address {
    String city = "New York";

    public String getCity() {
        return city;
    }

    public String toString() {
        return city;
    }
}
