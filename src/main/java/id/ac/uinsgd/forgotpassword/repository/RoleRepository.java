package id.ac.uinsgd.forgotpassword.repository;

import id.ac.uinsgd.forgotpassword.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RoleRepository extends JpaRepository<Role, Long> {
}
