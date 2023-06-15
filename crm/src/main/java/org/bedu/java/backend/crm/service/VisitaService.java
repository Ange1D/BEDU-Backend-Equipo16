package org.bedu.java.backend.crm.service;

import org.bedu.java.backend.crm.model.Visita;

import java.util.List;
import java.util.Optional;

public interface VisitaService {
   public Visita guardaVisita(Visita visita);

   public List<Visita> obtenVisitas();

   public Optional<Visita> obtenVisita(long idVisita);

   public void eliminaVisita(long idVisita);

   public Visita actualizaVisita(Visita visita);

   public long cuenteVisitas();
}
