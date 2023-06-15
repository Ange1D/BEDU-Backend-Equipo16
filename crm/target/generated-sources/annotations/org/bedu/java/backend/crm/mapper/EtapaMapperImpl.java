package org.bedu.java.backend.crm.mapper;

import javax.annotation.processing.Generated;
import org.bedu.java.backend.crm.model.Etapa;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-14T21:35:01-0500",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 18.0.2 (Oracle Corporation)"
)
@Component
public class EtapaMapperImpl implements EtapaMapper {

    @Override
    public org.bedu.java.backend.crm.entity.Etapa etapaModelToEtapaEntity(Etapa etapaModel) {
        if ( etapaModel == null ) {
            return null;
        }

        org.bedu.java.backend.crm.entity.Etapa etapa = new org.bedu.java.backend.crm.entity.Etapa();

        etapa.setEtapaId( etapaModel.getEtapaId() );
        etapa.setNombre( etapaModel.getNombre() );
        etapa.setOrden( etapaModel.getOrden() );

        return etapa;
    }

    @Override
    public Etapa etapaEntityToEtapaModel(org.bedu.java.backend.crm.entity.Etapa etapa) {
        if ( etapa == null ) {
            return null;
        }

        Etapa etapa1 = new Etapa();

        if ( etapa.getEtapaId() != null ) {
            etapa1.setEtapaId( etapa.getEtapaId() );
        }
        etapa1.setNombre( etapa.getNombre() );
        if ( etapa.getOrden() != null ) {
            etapa1.setOrden( etapa.getOrden() );
        }

        return etapa1;
    }
}
