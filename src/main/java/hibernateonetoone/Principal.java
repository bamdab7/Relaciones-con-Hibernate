package hibernateonetoone;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Principal {

	public static void main(String[] args) {
		StandardServiceRegistry sr = new StandardServiceRegistryBuilder().configure().build();
		SessionFactory sf = new MetadataSources(sr).buildMetadata().buildSessionFactory();

		Session sesion = sf.openSession();
		
		sesion.beginTransaction();
		
		//Presidente
		Presidente presidente1 = new Presidente(10, "Pepito",8000.0);
		Presidente presidente2 = new Presidente(20, "Fulanito", 1500.0);
		
		//Pais
		Pais pais1 = new Pais(100,"Andorra", "Europa", presidente2);
		Pais pais2 = new Pais(200,"Narnia", "Atlantia",presidente1);
		
		sesion.persist(presidente1);
		sesion.persist(presidente2);
		
		sesion.persist(pais1);
		sesion.persist(pais2);
		
		sesion.getTransaction().commit();
		
		sesion.close();
		sf.close();
	}

}
