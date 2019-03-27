package es.fpdual.primero.eadmin.servicio;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import es.fpdual.primero.eadmin.modelo.Documento; 
import es.fpdual.primero.eadmin.repositorio.RepositorioDocumento;

public class ServicioDocumentoImplTest {
	
	@Test
	public void deberiaObtenerTodosLosDocumentos() {
		
		
		 RepositorioDocumento repositorioDocumento = 
				 mock (RepositorioDocumento.class);
		final ServicioDocumentoImpl servicioDocumentoImpl =
				new ServicioDocumentoImpl (repositorioDocumento);
		List<Documento> listaDevueltaPorElRepositorio
		= new ArrayList<>();
		when(repositorioDocumento.obtenerTodosDocumentos()).thenReturn(listaDevueltaPorElRepositorio);
		
		
		
		final List<Documento> resultado = servicioDocumentoImpl.obtenerTodosDocumentos();
		
		assertEquals(listaDevueltaPorElRepositorio, resultado);
		
	
		
	}
	
	@Test
	public void deberiaModificarUnDocumentos() {
	 RepositorioDocumento repositorioDocumento = 
			 mock (RepositorioDocumento.class);
	final ServicioDocumentoImpl servicioDocumentoImpl =
			new ServicioDocumentoImpl (repositorioDocumento);
	Documento documento = mock(Documento.class);
	Documento documentoDevuletoPorElRepositorio = mock(Documento.class);
	when(repositorioDocumento.modificarDocumento(documento)).thenReturn( documentoDevuletoPorElRepositorio);
	
	
	
	final Documento resultado = servicioDocumentoImpl.modificarDocumento(documento);
	
	assertEquals( documentoDevuletoPorElRepositorio, resultado);

	}
	
}
