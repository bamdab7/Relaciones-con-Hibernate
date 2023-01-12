package hibernateonetoone;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Pais {
	@Id
	private int codigo;
	private String nombre;
	private String continente;
	@OneToOne (fetch = FetchType.EAGER)
	@JoinColumn(name = "DAMPresidente" , foreignKey = @ForeignKey(name = "fk_presidente"))
	private Presidente idPresidente;
	
	public Pais() {
		
	}
	
	public Pais(int codigo, String nombre, String continent,Presidente idPresidente) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.continente = continente;
		this.idPresidente = idPresidente;
	}
	
	public Presidente getIdPresidente() {
		return idPresidente;
	}

	public void setIdPresidente(Presidente idPresidente) {
		this.idPresidente = idPresidente;
	}

	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getContinente() {
		return continente;
	}
	public void setContinente(String continente) {
		this.continente = continente;
	}

	@Override
	public String toString() {
		return "Pais [codigo=" + codigo + ", nombre=" + nombre + ", continente=" + continente + ", idPresidente="
				+ idPresidente + "]";
	}
	
}
