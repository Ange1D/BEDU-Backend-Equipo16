package org.bedu.java.backend.crm.service;

import org.bedu.java.backend.crm.model.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductoService {
   public Producto guardaProducto(Producto producto);

   public List<Producto> obtenProductos();

   public Optional<Producto> obtenProducto(long idProducto);

   public void eliminaProducto(long idProducto);

   public Producto actualizaProducto(Producto producto);

   public long cuenteProductos();
}
