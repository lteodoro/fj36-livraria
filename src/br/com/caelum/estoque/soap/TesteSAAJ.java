package br.com.caelum.estoque.soap;

import javax.xml.namespace.QName;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPBodyElement;
import javax.xml.soap.SOAPMessage;

public class TesteSAAJ {

	public static void main(String[] args) throws Exception {
		
		MessageFactory factory = MessageFactory.newInstance();
		
		SOAPMessage message = factory.createMessage();
		SOAPBody body = message.getSOAPBody();
		
		QName qualifiedName = new QName ("http://ws.estoque.caelum.com.br/",
				"getQuantidade","ns2");
		
		SOAPBodyElement element = body.addBodyElement(qualifiedName);

	}

}
