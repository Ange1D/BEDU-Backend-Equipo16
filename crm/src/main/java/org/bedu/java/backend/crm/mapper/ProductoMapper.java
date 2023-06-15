package org.bedu.java.backend.crm.mapper;

import org.bedu.java.backend.crm.entity.Producto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductoMapper {
    Producto productoModelToProductoEntity(org.bedu.java.backend.crm.model.Producto productoModel);

    org.bedu.java.backend.crm.model.Producto productoEntityToProductoModel(Producto producto);
}
