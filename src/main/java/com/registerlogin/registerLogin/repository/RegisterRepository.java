package com.registerlogin.registerLogin.repository;

import com.registerlogin.registerLogin.model.Register;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegisterRepository extends JpaRepository<Register, Long> {

}
