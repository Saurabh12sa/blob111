package in.saurabhit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.saurabhit.entity.Employee;
public interface EmpRepository extends JpaRepository<Employee, Serializable> {

}
