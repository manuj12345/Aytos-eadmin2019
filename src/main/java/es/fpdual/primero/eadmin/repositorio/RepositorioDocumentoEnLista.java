package es.fpdual.primero.eadmin.repositorio;

import java.util.ArrayList;
import java.util.List;

import es.fpdual.primero.eadmin.modelo.AdministracionElectronicaException;
import es.fpdual.primero.eadmin.modelo.Documento;

public class RepositorioDocumentoEnLista implements RepositorioDocumento{
	
	private final List<Documento> documentos = new ArrayList();

//	@Override
//	public void altaDocumento(Documento documento) {
//		if (documentos.contains(documentos)) {
//			throw new AdministracionElectronicaException("El documento ya existe");
//		}
//		documentos.add(documento);


	@Override
	public Documento modificarDocumento(Documento documento) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminaDocumento(int codigoDocumento) {
		if (!documentos.contains(codigoDocumento)) {
			throw new AdministracionElectronicaException("no se puede eliminar un documento que no existe");	
	}
		documentos.remove(codigoDocumento);
}

	@Override
	public List<Documento> obtenerTodosDocumentos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getSiguienteId() {
		// TODO Auto-generated method stub
		return 0;
	}

}
