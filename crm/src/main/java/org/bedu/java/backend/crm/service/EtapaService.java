package org.bedu.java.backend.crm.service;

import org.bedu.java.backend.crm.model.Etapa;

import java.util.List;
import java.util.Optional;

public interface EtapaService {
   public Etapa guardaEtapa(Etapa etapa);

   public List<Etapa> obtenEtapas();

   public Optional<Etapa> obtenEtapa(long idEtapa);

   public void eliminaEtapa(long idEtapa);

   public Etapa actualizaEtapa(Etapa etapa);

   public long cuenteEtapas();

}
