package es.fpdual.primero.eadmin;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import es.fpdual.primero.eadmin.modelo.Documento;
import es.fpdual.primero.eadmin.modelo.DocumentoContable;
import es.fpdual.primero.eadmin.modelo.Expediente;
import es.fpdual.primero.eadmin.modelo.TipoExpediente;
import es.fpdual.primero.eadmin.modelo.Usuario;

public class ExpedienteTest {

	@Test
	public void deberiaDarmeLaLongitudDeLosNombreDelDocumento() {
		//Inicializacion
		
		final Usuario usuario = new Usuario(2, "usu", "c");
		final Date fechaCreacion = new Date();
		final List<Documento> documentos = new ArrayList<>();
	
		final Expediente rxpediente = new Expediente
				(1, "nombre", usuario, fechaCreacion,
						TipoExpediente.EXPEDIENTE_SUBVENCIONES,
						documentos);
		
	}
	@Test
	public void deberiaConstruirUnExpdienteConDocumentos() {
		final Usuario usuario = new Usuario (1, "Juan", "Alcalde");
		
		final DocumentoContable documentoContable =
				new DocumentoContable (10,"Operacion contable", usuario, new Date(), "8437865783467");
		
		final Documento documento =
				new DocumentoContable(15, "Operacion", usuario, new Date(), "973258647385");
		
		final List <Documento> documentos = new ArrayList<Documento>();
		documentos.add(documentoContable);
		documentos.add(documento);
	
		documentos.stream()
		.map(documentoActual
				-> documentoActual.getNombre())
		.forEach(docuemntoActual
				-> System.out.println(documentoActual));
		
		for(Documento documentoActual: documentos) {
			if(esDocumentoContable(documentoActual)) {
				System.out.println(documentoActual);
				
			}
		}
		
		
		for (Documento documentoActual: documentos) {
			System.out.println(documentoActual.getNombre().length());
		}
//		documentos.stream()
//		.map(documentoActual
//				-> documentoActual.getNombre())
//		.forEach(docuemntoActual
//				-> System.out.println(documentoActual));
		
//		
//		documentos.stream().
//		filter(this:: esDocumentoContable(documento)).
//		forEach(System.out::println);
//		
//		final List<Documentos> documentosContables =
//				documentos.stream().
//				filter(this::esDocumentoContable).
//				collect(Collectors.toList());
//		
		
		final Expediente expediente = new Expediente (1, "expediente 1",
				usuario, new Date(), TipoExpediente.EXPEDIENTE_LICENCIA_OBRAS,
				documentos);	
		
		//Comprobacion de resultados
		
		assertEquals(documentos, expediente.getDocumentos());
		assertTrue(expediente.getDocumentos().contains(documentoContable));
		assertEquals(documentos.size(),2);
	}

}
