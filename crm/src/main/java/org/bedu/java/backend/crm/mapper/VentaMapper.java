package org.bedu.java.backend.crm.mapper;

import org.bedu.java.backend.crm.entity.Venta;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface VentaMapper {
    Venta ventaModelToVentaEntity(org.bedu.java.backend.crm.model.Venta ventaModel);

    org.bedu.java.backend.crm.model.Venta ventaEntityToVentaModel(Venta venta);
}
