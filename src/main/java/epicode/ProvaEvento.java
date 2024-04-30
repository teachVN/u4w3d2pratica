package epicode;

import epicode.dao.EventoDao;
import epicode.entity.Evento;
import epicode.entity.TipoEvento;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;

public class ProvaEvento {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestioneeventi");
        EntityManager em = emf.createEntityManager();

        EventoDao dao = new EventoDao(em);

        Evento e1 = new Evento();
        e1.setTipoEvento(TipoEvento.PUBBLICO);
        e1.setTitolo("Concerto 1 maggio");
        e1.setDescrizione("Concerto al Circo Massimo");
        e1.setDataEvento(LocalDate.of(2024,5,1));
        e1.setNumeroMassimoPartecipanti(50000);

        dao.save(e1);

//        Evento e2 = dao.getById(1);
//        System.out.println(e2);
//
//        e2.setDescrizione("Concertone del 1 maggio al Circo Massimo");
//        dao.save(e2);
//
//        dao.delete(1);
    }
}
