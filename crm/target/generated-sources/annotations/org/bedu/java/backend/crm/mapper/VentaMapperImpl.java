package org.bedu.java.backend.crm.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.bedu.java.backend.crm.entity.Producto;
import org.bedu.java.backend.crm.entity.Venta;
import org.bedu.java.backend.crm.model.Cliente;
import org.bedu.java.backend.crm.model.Cliente.ClienteBuilder;
import org.bedu.java.backend.crm.model.Producto.ProductoBuilder;
import org.bedu.java.backend.crm.model.Venta.VentaBuilder;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-14T21:35:01-0500",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 18.0.2 (Oracle Corporation)"
)
@Component
public class VentaMapperImpl implements VentaMapper {

    @Override
    public Venta ventaModelToVentaEntity(org.bedu.java.backend.crm.model.Venta ventaModel) {
        if ( ventaModel == null ) {
            return null;
        }

        Venta venta = new Venta();

        venta.setVentaId( ventaModel.getVentaId() );
        venta.setMonto( ventaModel.getMonto() );
        venta.setProductos( productoListToProductoList( ventaModel.getProductos() ) );
        venta.setCliente( clienteToCliente( ventaModel.getCliente() ) );
        venta.setFechaCreacion( ventaModel.getFechaCreacion() );

        return venta;
    }

    @Override
    public org.bedu.java.backend.crm.model.Venta ventaEntityToVentaModel(Venta venta) {
        if ( venta == null ) {
            return null;
        }

        VentaBuilder venta1 = org.bedu.java.backend.crm.model.Venta.builder();

        venta1.ventaId( venta.getVentaId() );
        venta1.monto( venta.getMonto() );
        venta1.productos( productoListToProductoList1( venta.getProductos() ) );
        venta1.cliente( clienteToCliente1( venta.getCliente() ) );
        venta1.fechaCreacion( venta.getFechaCreacion() );

        return venta1.build();
    }

    protected Producto productoToProducto(org.bedu.java.backend.crm.model.Producto producto) {
        if ( producto == null ) {
            return null;
        }

        Producto producto1 = new Producto();

        producto1.setId( producto.getId() );
        producto1.setNombre( producto.getNombre() );
        producto1.setCategoria( producto.getCategoria() );
        producto1.setPrecio( producto.getPrecio() );
        producto1.setNumeroRegistro( producto.getNumeroRegistro() );
        producto1.setFechaCreacion( producto.getFechaCreacion() );

        return producto1;
    }

    protected List<Producto> productoListToProductoList(List<org.bedu.java.backend.crm.model.Producto> list) {
        if ( list == null ) {
            return null;
        }

        List<Producto> list1 = new ArrayList<Producto>( list.size() );
        for ( org.bedu.java.backend.crm.model.Producto producto : list ) {
            list1.add( productoToProducto( producto ) );
        }

        return list1;
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

    protected org.bedu.java.backend.crm.model.Producto productoToProducto1(Producto producto) {
        if ( producto == null ) {
            return null;
        }

        ProductoBuilder producto1 = org.bedu.java.backend.crm.model.Producto.builder();

        if ( producto.getId() != null ) {
            producto1.id( producto.getId() );
        }
        producto1.nombre( producto.getNombre() );
        producto1.categoria( producto.getCategoria() );
        producto1.precio( producto.getPrecio() );
        producto1.numeroRegistro( producto.getNumeroRegistro() );
        producto1.fechaCreacion( producto.getFechaCreacion() );

        return producto1.build();
    }

    protected List<org.bedu.java.backend.crm.model.Producto> productoListToProductoList1(List<Producto> list) {
        if ( list == null ) {
            return null;
        }

        List<org.bedu.java.backend.crm.model.Producto> list1 = new ArrayList<org.bedu.java.backend.crm.model.Producto>( list.size() );
        for ( Producto producto : list ) {
            list1.add( productoToProducto1( producto ) );
        }

        return list1;
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
