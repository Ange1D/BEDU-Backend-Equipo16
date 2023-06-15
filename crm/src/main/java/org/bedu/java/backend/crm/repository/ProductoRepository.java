package org.bedu.java.backend.crm.repository;

import org.bedu.java.backend.crm.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
