package org.bedu.java.backend.crm.mapper;

import org.bedu.java.backend.crm.entity.Cliente;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClienteMapper {
    Cliente clienteModelToClienteEntity(org.bedu.java.backend.crm.model.Cliente clienteModel);

    org.bedu.java.backend.crm.model.Cliente clienteEntityToClienteModel(Cliente cliente);
}
