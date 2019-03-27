package es.fpdual.primero.eadmin.modelo;

import java.util.Date;
import java.util.List;

public class Expediente extends AdministracionElectronicaBase {

	private final int id;
	private final String nombre;
	private final Usuario usuario;
	private final Date fechaCreacion;
	private final TipoExpediente tipoExpediente;
	private final List<Documento> documentos;
	
	
	public Expediente(int id, String nombre, Usuario usuario, Date fechaCreacion, TipoExpediente tipoExpediente, List<Documento> documentos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.usuario = usuario;
		this.fechaCreacion = fechaCreacion;
		this.tipoExpediente = tipoExpediente;
		this.documentos = documentos;
	}


	public int getId() {
		return id;
	}


	public String getNombre() {
		return nombre;
	}


	public Usuario getUsuario() {
		return usuario;
	}


	public Date getFchaCreacion() {
		return fechaCreacion;
	}


	public TipoExpediente getTipoExpediente() {
		return tipoExpediente;
	}
	
	public List<Documento> getDocumentos() {
		return this.documentos;
	}


	@Override
	public boolean equals(Object object) {
		if (object instanceof Expediente) {
			final Expediente expediente = (Expediente) object;
			return this.id == expediente.getId();
		}
			return false;
	
	}



	@Override
	public int hashCode() {
			return this.id;
		}
	
	
	
	
}
