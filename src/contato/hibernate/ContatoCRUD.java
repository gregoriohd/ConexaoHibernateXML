package contato.hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import contato.Contato;

public class ContatoCRUD {
	
	
	public void salvar(Contato contato) {
		Session session = null;
		Transaction transection = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			transection = session.beginTransaction();
			session.save(contato);
			transection.commit();
		} catch (HibernateException he) {
			System.err.println("Erro ao inserir contato. Erro: "+ he);
		}finally {
			try {
				session.close();
			} catch (Exception e) {
				System.err.println("Erro ao fechar operação de inserção na tabela contato");
			}
		}
		
	}

}
