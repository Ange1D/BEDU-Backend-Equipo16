package org.bedu.java.backend.crm.repository;

import org.bedu.java.backend.crm.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
