
package org.tempuri;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Hola }
     * 
     */
    public Hola createHola() {
        return new Hola();
    }

    /**
     * Create an instance of {@link HolaResponse }
     * 
     */
    public HolaResponse createHolaResponse() {
        return new HolaResponse();
    }

    /**
     * Create an instance of {@link Tablas }
     * 
     */
    public Tablas createTablas() {
        return new Tablas();
    }

    /**
     * Create an instance of {@link TablasResponse }
     * 
     */
    public TablasResponse createTablasResponse() {
        return new TablasResponse();
    }

    /**
     * Create an instance of {@link InsertarDatos }
     * 
     */
    public InsertarDatos createInsertarDatos() {
        return new InsertarDatos();
    }

    /**
     * Create an instance of {@link InsertarDatosResponse }
     * 
     */
    public InsertarDatosResponse createInsertarDatosResponse() {
        return new InsertarDatosResponse();
    }

    /**
     * Create an instance of {@link Consulta }
     * 
     */
    public Consulta createConsulta() {
        return new Consulta();
    }

    /**
     * Create an instance of {@link ConsultaResponse }
     * 
     */
    public ConsultaResponse createConsultaResponse() {
        return new ConsultaResponse();
    }

}
