package in.saurabhit.repository;
import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.saurabhit.entity.Address;
public interface AddressRepository extends JpaRepository<Address, Serializable> {

}
