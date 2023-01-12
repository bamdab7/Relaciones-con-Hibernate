package hibernateonetomany;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Presidente {
	@Id
	private int id;
	private String nombre;
	private Double sueldo;
	
	@ManyToOne
	@JoinColumn(name ="IDPais", foreignKey= @ForeignKey(name = "fk_pais") ) 
	private Pais pais;
	
	
	
	

	public Presidente() {
		super();
	}

	public Presidente(int id, String nombre, Double sueldo, Pais pais) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.sueldo = sueldo;
		this.pais = pais;
	}
	
	public Pais getPais() {
			return pais;
		}
	
		public void setPais(Pais pais) {
			this.pais = pais;
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
