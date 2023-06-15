package org.bedu.java.backend.crm.mapper;

import org.bedu.java.backend.crm.entity.Visita;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface VisitaMapper {
    Visita visitaModelToVisitaEntity(org.bedu.java.backend.crm.model.Visita visitaModel);

    org.bedu.java.backend.crm.model.Visita visitaEntityToVisitaModel(Visita visita);
}
