package br.com.caelum.livraria.jaxb;

import java.io.FileOutputStream;
import java.math.BigDecimal;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class TesteMarshal {

	public static void main(String[] args) throws Exception {
		
		Livro livro = new Livro();
		livro.setCodigo("ARQ");
		livro.setTitulo("Arquitetura JAVA");
		livro.setNomeAutor("Paulo Silveira");
		livro.setValor(new BigDecimal("29.90"));
		
		JAXBContext context = JAXBContext.newInstance(Livro.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.marshal(livro, new FileOutputStream("livro.xml"));

	}

}