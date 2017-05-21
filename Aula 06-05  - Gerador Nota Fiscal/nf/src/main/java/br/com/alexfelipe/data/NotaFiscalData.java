package br.com.alexfelipe.data;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alexfelipe.nf.NotaFiscal;

public class NotaFiscalData {
	public List<NotaFiscal> getAll()
    {
		final List<NotaFiscal> list = new ArrayList<NotaFiscal>();
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("postgres");

		EntityManager em = emf.createEntityManager();
		List<?> notas = em.createQuery(
			    "select notaFiscal from NotaFiscal as notaFiscal")
			    .getResultList();
		
        for(final Object o : notas) {
            list.add((NotaFiscal)o);
        }
        return list;
    }
	
	public void salvarNotaFiscal(NotaFiscal notaFiscal) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("postgres");

		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		em.persist(notaFiscal);

		em.getTransaction().commit();
		em.close();
	}
}
