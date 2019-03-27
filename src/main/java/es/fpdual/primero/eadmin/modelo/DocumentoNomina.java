package es.fpdual.primero.eadmin.modelo;

import java.util.Date;

public class DocumentoNomina extends Documento{
	
	private final String numeroOperacionNomina;

	public DocumentoNomina(int id, String nombre, Usuario usuario, Date fechaCreacion, String numeroOperacionNomina) {
		super(id, nombre, usuario, fechaCreacion, TipoDocumento.DOCUMENTO_NOMINA);
		
		this.numeroOperacionNomina = numeroOperacionNomina;
	}

	public String getNumeroOperacionNomina() {
		return numeroOperacionNomina;
	}
	

		
}
		


