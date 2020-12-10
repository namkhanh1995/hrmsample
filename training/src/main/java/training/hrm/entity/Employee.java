package training.hrm.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
	private long employee_id;
	private String employee_code;
	private String last_name;
	private String first_name;
	private String birthday;
	private int gender;
	private String email;
	private String phone_number;
	@Id
	public long getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(long employee_id) {
		this.employee_id = employee_id;
	}
	
	public String getEmployee_code() {
		return employee_code;
	}
	public void setEmployee_code(String employee_code) {
		this.employee_code = employee_code;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	
	public Employee() {
		super();
	}
	public Employee(long employee_id, String employee_code, String last_name, String first_name, String birthday,
			int gender, String email, String phone_number) {
		super();
		this.employee_id = employee_id;
		this.employee_code = employee_code;
		this.last_name = last_name;
		this.first_name = first_name;
		this.birthday = birthday;
		this.gender = gender;
		this.email = email;
		this.phone_number = phone_number;
	}
	
}
