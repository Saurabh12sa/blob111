package in.saurabhit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.saurabhit.entity.Address;
import in.saurabhit.service.EmployeeService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		EmployeeService service= context.getBean(EmployeeService.class);
		service.saveData();
		context.close();
// hiiiiii
	}

}
