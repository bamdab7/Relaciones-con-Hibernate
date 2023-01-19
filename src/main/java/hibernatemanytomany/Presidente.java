package hibernatemanytomany;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Presidente {
	@Id
	private int id;
	private String nombre;
	private double sueldo;
	
	@ManyToMany(mappedBy = "listaPresidentes")
	private List<Pais> listaPais;
 	//@ManyToOne
	//@JoinColumn(name ="IDPais", foreignKey= @ForeignKey(name = "fk_pais") ) 
	//private Pais pais;
	
	

	public Presidente() {
		super();
	}

	public Presidente(int id, String nombre, Double sueldo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.sueldo = sueldo;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getSueldo() {
		return sueldo;
	}

	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Presidente [id=" + id + ", nombre=" + nombre + ", sueldo=" + sueldo + "]";
	}

}
