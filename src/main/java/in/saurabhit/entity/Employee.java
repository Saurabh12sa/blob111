package in.saurabhit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "EMP_TABLE")
public class Employee {
	
	
	public Employee() {
		
	}
	
	public Employee(Integer empId,String empName,Double empSal) {
		
		this.empId=empId;
		this.empName=empName;
		this.empSal=empSal;
	}
	
	@Id
	@Column(name = "EMP_ID")
	private Integer empId;
	
	@Column(name = "EMP_NAME")
	private String empName;
	
	@Column(name = "EMP_SAL")
	private Double empSal;

}
