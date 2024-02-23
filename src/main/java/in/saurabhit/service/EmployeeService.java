package in.saurabhit.service;

import org.springframework.stereotype.Service;

import in.saurabhit.entity.Address;
import in.saurabhit.entity.Employee;
import in.saurabhit.repository.AddressRepository;
import in.saurabhit.repository.EmpRepository;
import jakarta.transaction.Transactional;

@Service
public class EmployeeService {
	
	private EmpRepository empRepo;
	
	private AddressRepository addrRepo;
	
	public EmployeeService(EmpRepository empRepo,AddressRepository addrRepo) {
		
		this.empRepo=empRepo;
		this.addrRepo=addrRepo;
		
	}
	
	@Transactional(rollbackFor = Exception.class)
	public void saveData() {
		
		
		Employee emp = new Employee();
		
		emp.setEmpId(205);
		emp.setEmpName("Rahul");
		emp.setEmpSal(60000.00);
		empRepo.save(emp);
		
		int i = 10/0;
		
		Address addr = new Address();
		addr.setAddrId(505);
		addr.setEmpId(205);
		addr.setCity("Pune");
		addr.setState("Maharastra");
		addr.setCountry("India");
		addrRepo.save(addr);
	}

}
