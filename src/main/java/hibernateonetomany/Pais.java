package hibernateonetomany;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Pais {
	@Id
	private int codigo;
	private String nombre;
	private String continente;
	
	@OneToMany(fetch = FetchType.EAGER)
	private List<Presidente> listaPresidentes;
	
	
	public Pais() {
		
	}
	
	public Pais(int codigo, String nombre, String continent) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.continente = continente;
	}
	
	public List<Presidente> getListaPresidentes() {
		return listaPresidentes;
	}

	public void setListaPresidentes(List<Presidente> listaPresidentes) {
		this.listaPresidentes = listaPresidentes;
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
	
	//Añadidos a mano, alternativa añadir al constructor del pais los presidentes
	public void anhadirPresidente(Presidente p ) {
		listaPresidentes.add(p);
	}
	
	public void borrarPresidente(Presidente p) {
		listaPresidentes.remove(p);
	}
	
}
