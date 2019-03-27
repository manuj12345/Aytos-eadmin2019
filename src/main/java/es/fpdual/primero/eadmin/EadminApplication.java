package es.fpdual.primero.eadmin;

import java.util.Date;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import es.fpdual.primero.eadmin.modelo.Documento;
import es.fpdual.primero.eadmin.modelo.DocumentoContable;
import es.fpdual.primero.eadmin.modelo.DocumentoNomina;
import es.fpdual.primero.eadmin.modelo.TipoDocumento;
import es.fpdual.primero.eadmin.modelo.Usuario;


@SpringBootApplication
public class EadminApplication {

	public static void main(String[] args) {
		
		final Usuario usuario = new Usuario(1, "Bob", "Chef");
		final Date fecha = new Date();
		
		final Documento documentoContable = new DocumentoContable (2, "Certificado empadronamiento",
				usuario, fecha, "5723652");

		final Documento documentoNomina = new DocumentoNomina (1, "Luis",
				usuario, fecha, "67476467");
		
		SpringApplication.run(EadminApplication.class, args);
	}

}



