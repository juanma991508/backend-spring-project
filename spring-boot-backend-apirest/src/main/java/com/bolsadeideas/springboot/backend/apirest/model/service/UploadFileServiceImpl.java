package com.bolsadeideas.springboot.backend.apirest.model.service;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
@Service
public class UploadFileServiceImpl implements UploadFileService {

	private static final String RUTA_UPLOADS="uploads";
	@Override
	public Resource cargar(String nombreFoto) throws MalformedURLException {
	Path rutaArchivo = this.getPath(nombreFoto); 
		Resource recurso = new UrlResource(rutaArchivo.toUri());
		
		
		if(!recurso.exists() && !recurso.isReadable()) {
			rutaArchivo=Paths.get("src/main/resources/static").resolve("nouser.png").toAbsolutePath();
			recurso=new UrlResource(rutaArchivo.toUri());
		}
		
		return recurso;
	}

	@Override
	public String copiar(MultipartFile file) throws IOException {
		String nombreArchivo = UUID.randomUUID().toString() + "_" +  file.getOriginalFilename().replace(" ", "");
		

		Path rutaArchivo = this.getPath(nombreArchivo);
	
		Files.copy(file.getInputStream(), rutaArchivo);
	
		
		return nombreArchivo;
	}

	@Override
	public boolean eliminar(String nombreFoto) {
		if(nombreFoto !=null && nombreFoto.length() >0) {
			Path rutaFotoAnterior = Paths.get("uploads").resolve(nombreFoto).toAbsolutePath();
			File archivoFotoAnterior = rutaFotoAnterior.toFile();
			if(archivoFotoAnterior.exists() && archivoFotoAnterior.canRead()) {
				archivoFotoAnterior.delete();
				return true;
			}
		}
		return false;
	}

	@Override
	public Path getPath(String nombreFoto) {
		// TODO Auto-generated method stub
		return Paths.get(this.RUTA_UPLOADS).resolve(nombreFoto).toAbsolutePath();
	}

}
