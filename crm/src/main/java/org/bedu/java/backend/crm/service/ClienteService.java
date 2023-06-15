package org.bedu.java.backend.crm.service;

import org.bedu.java.backend.crm.model.Cliente;

import java.util.List;
import java.util.Optional;

public interface ClienteService {
   public Cliente guardaCliente(Cliente cliente);

   public List<Cliente> obtenClientes();

   public Optional<Cliente> obtenCliente(long idCliente);

   public void eliminaCliente(long idcliente);

   public Cliente actualizaCliente(Cliente cliente);

   public long cuenteClientes();
}
