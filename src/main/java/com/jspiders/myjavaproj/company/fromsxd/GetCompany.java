package com.jspiders.myjavaproj.company.fromsxd;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.objtoxml.assignment.model.Address;
import com.objtoxml.assignment.model.Company;
import com.objtoxml.assignment.model.Employee;

public class GetCompany {
	public static Company getData() {

		/**
		 * @Address-1
		 */
		Address address1 = new Address();
		address1.setType("present");
		address1.setAddress1("3rd A Cross, 18th Main, ABC Layout");
		address1.setAddress2("Bangalore");
		address1.setLandmark("Near School");
		address1.setPincode(123456);

		/**
		 * @Address-2
		 */
		Address address2 = new Address();
		address2.setType("present");
		address2.setAddress1("3rd A Cross, 18th Main, ABC Layout");
		address2.setAddress2("Bangalore");
		address2.setLandmark("Near School");
		address2.setPincode(123456);

		List<Address> addList = new ArrayList<>();
		addList.add(address1);
		addList.add(address2);

		/**
		 * @Employee-1
		 */
		Employee employee = new Employee();
		employee.setAddress(addList);
		employee.setId(1);
		employee.setName("Pradeep Naik R");

		List<Long> phoneNumbers = new ArrayList<>();
		phoneNumbers.add(Long.valueOf("123456"));
		phoneNumbers.add(Long.valueOf("789456"));
		phoneNumbers.add(Long.valueOf("75395148620"));

		employee.setPhoneNumbers(phoneNumbers);
		employee.setSalary(30000.00);

		/**
		 * @Employee-2
		 */
		Employee employee2 = new Employee();
		employee2.setAddress(addList);
		employee2.setId(1);
		employee2.setName("Pradeep Naik R");

		List<Long> phoneNumbers2 = new ArrayList<>();
		phoneNumbers2.add(Long.valueOf("123456"));
		phoneNumbers2.add(Long.valueOf("789456"));
		phoneNumbers2.add(Long.valueOf("95175348620"));

		employee2.setPhoneNumbers(phoneNumbers2);
		employee2.setSalary(30000.00);

		List<Employee> empList = new ArrayList<>();
		empList.add(employee);
		empList.add(employee2);

		/**
		 * @Company
		 */
		Company company = new Company();

		company.setCompanyName("Jspiders Software Development");
		company.setEmployeeList(empList);

		Map<String, Object> infoMap = new HashMap<>();
		infoMap.put("Company-type", "Teaching");
		infoMap.put("company-location", "Bangalore");

		company.setInfo(infoMap);

		return company;
	}
}
