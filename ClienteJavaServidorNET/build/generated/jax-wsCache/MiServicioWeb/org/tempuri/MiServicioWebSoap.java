
package org.tempuri;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "MiServicioWebSoap", targetNamespace = "http://tempuri.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface MiServicioWebSoap {


    /**
     * 
     * @param nombre
     * @param anio
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "http://tempuri.org/hola")
    @WebResult(name = "holaResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "hola", targetNamespace = "http://tempuri.org/", className = "org.tempuri.Hola")
    @ResponseWrapper(localName = "holaResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.HolaResponse")
    public String hola(
        @WebParam(name = "anio", targetNamespace = "http://tempuri.org/")
        int anio,
        @WebParam(name = "nombre", targetNamespace = "http://tempuri.org/")
        String nombre);

    /**
     * 
     * @param num1
     * @param num2
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "http://tempuri.org/tablas")
    @WebResult(name = "tablasResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "tablas", targetNamespace = "http://tempuri.org/", className = "org.tempuri.Tablas")
    @ResponseWrapper(localName = "tablasResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.TablasResponse")
    public String tablas(
        @WebParam(name = "num1", targetNamespace = "http://tempuri.org/")
        int num1,
        @WebParam(name = "num2", targetNamespace = "http://tempuri.org/")
        int num2);

    /**
     * 
     * @param apellidos
     * @param imagen
     * @param nombre
     * @param edad
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "http://tempuri.org/insertarDatos")
    @WebResult(name = "insertarDatosResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "insertarDatos", targetNamespace = "http://tempuri.org/", className = "org.tempuri.InsertarDatos")
    @ResponseWrapper(localName = "insertarDatosResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.InsertarDatosResponse")
    public String insertarDatos(
        @WebParam(name = "nombre", targetNamespace = "http://tempuri.org/")
        String nombre,
        @WebParam(name = "apellidos", targetNamespace = "http://tempuri.org/")
        String apellidos,
        @WebParam(name = "edad", targetNamespace = "http://tempuri.org/")
        int edad,
        @WebParam(name = "imagen", targetNamespace = "http://tempuri.org/")
        byte[] imagen);

    /**
     * 
     * @param nombre
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "http://tempuri.org/consulta")
    @WebResult(name = "consultaResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "consulta", targetNamespace = "http://tempuri.org/", className = "org.tempuri.Consulta")
    @ResponseWrapper(localName = "consultaResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ConsultaResponse")
    public String consulta(
        @WebParam(name = "nombre", targetNamespace = "http://tempuri.org/")
        String nombre);

}