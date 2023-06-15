package org.bedu.java.backend.crm.mapper;

import org.bedu.java.backend.crm.entity.Etapa;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EtapaMapper {
    Etapa etapaModelToEtapaEntity(org.bedu.java.backend.crm.model.Etapa etapaModel);

    org.bedu.java.backend.crm.model.Etapa etapaEntityToEtapaModel(Etapa etapa);
}
