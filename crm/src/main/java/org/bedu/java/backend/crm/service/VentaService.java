package org.bedu.java.backend.crm.service;

import org.bedu.java.backend.crm.model.Venta;

import java.util.List;
import java.util.Optional;

public interface VentaService {
   public Venta guardaVenta(Venta Venta);

   public List<Venta> obtenVentas();

   public Optional<Venta> obtenVenta(long idVenta);

   public void eliminaVenta(long idVenta);

   public Venta actualizaVenta(Venta venta);

   public long cuenteVentas();
}
