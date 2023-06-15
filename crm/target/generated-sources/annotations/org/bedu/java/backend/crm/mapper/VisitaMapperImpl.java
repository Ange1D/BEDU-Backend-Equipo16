package org.bedu.java.backend.crm.mapper;

import javax.annotation.processing.Generated;
import org.bedu.java.backend.crm.entity.Visita;
import org.bedu.java.backend.crm.model.Cliente;
import org.bedu.java.backend.crm.model.Cliente.ClienteBuilder;
import org.bedu.java.backend.crm.model.Visita.VisitaBuilder;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-14T21:35:01-0500",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 18.0.2 (Oracle Corporation)"
)
@Component
public class VisitaMapperImpl implements VisitaMapper {

    @Override
    public Visita visitaModelToVisitaEntity(org.bedu.java.backend.crm.model.Visita visitaModel) {
        if ( visitaModel == null ) {
            return null;
        }

        Visita visita = new Visita();

        visita.setId( visitaModel.getId() );
        visita.setCliente( clienteToCliente( visitaModel.getCliente() ) );
        visita.setFechaProgramada( visitaModel.getFechaProgramada() );
        visita.setDireccion( visitaModel.getDireccion() );
        visita.setProposito( visitaModel.getProposito() );
        visita.setVendedor( visitaModel.getVendedor() );

        return visita;
    }

    @Override
    public org.bedu.java.backend.crm.model.Visita visitaEntityToVisitaModel(Visita visita) {
        if ( visita == null ) {
            return null;
        }

        VisitaBuilder visita1 = org.bedu.java.backend.crm.model.Visita.builder();

        visita1.id( visita.getId() );
        visita1.cliente( clienteToCliente1( visita.getCliente() ) );
        visita1.fechaProgramada( visita.getFechaProgramada() );
        visita1.direccion( visita.getDireccion() );
        visita1.proposito( visita.getProposito() );
        visita1.vendedor( visita.getVendedor() );

        return visita1.build();
    }

    protected org.bedu.java.backend.crm.entity.Cliente clienteToCliente(Cliente cliente) {
        if ( cliente == null ) {
            return null;
        }

        org.bedu.java.backend.crm.entity.Cliente cliente1 = new org.bedu.java.backend.crm.entity.Cliente();

        cliente1.setId( cliente.getId() );
        cliente1.setNombre( cliente.getNombre() );
        cliente1.setCorreoContacto( cliente.getCorreoContacto() );
        cliente1.setNumeroEmpleados( String.valueOf( cliente.getNumeroEmpleados() ) );
        cliente1.setDireccion( cliente.getDireccion() );

        return cliente1;
    }

    protected Cliente clienteToCliente1(org.bedu.java.backend.crm.entity.Cliente cliente) {
        if ( cliente == null ) {
            return null;
        }

        ClienteBuilder cliente1 = Cliente.builder();

        if ( cliente.getId() != null ) {
            cliente1.id( cliente.getId() );
        }
        cliente1.nombre( cliente.getNombre() );
        cliente1.correoContacto( cliente.getCorreoContacto() );
        if ( cliente.getNumeroEmpleados() != null ) {
            cliente1.numeroEmpleados( Integer.parseInt( cliente.getNumeroEmpleados() ) );
        }
        cliente1.direccion( cliente.getDireccion() );

        return cliente1.build();
    }
}
