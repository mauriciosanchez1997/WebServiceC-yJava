<%-- 
    Document   : Cliente
    Created on : 26/11/2018, 04:03:15 PM
    Author     : Mauricio
--%>

<%@page import="java.util.Arrays"%>
<%@page import="java.util.Arrays"%>
<%@page import="java.util.Arrays"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="#">
        
             <table border="1">
            <thead>
            <tr>
                <th>Campos</th>
                <th>Datos a llenar</th>
            </tr>
            </thead>
            <tr>
                <th>Nombre</th>
                <td>
                    <input type="text" id="txtNombreBD" name="txtNombreBD" placeholder="Nombre...">
                </td>
            </tr>
           <tr>
                <th>Apellidos</th>
                <td>
                    <input type="text" id="txtApellidosBD" name="txtApellidosBD" placeholder="Apellidos">
                </td>
            </tr>
            <tr>
                <th>Edad</th>
                <td>
                    <input type="text" id="txtEdadBD" name="txtEdadBD" placeholder="Edad...">
                </td>
            </tr>
             <tr>
                <th>Imagen</th>
                <td>
                    <img id="img" name="img">
                    <video id="v" name="v"></video>
                    <canvas id="c" name="c"></canvas>
                    <button id="t" name="t">Guardar</button>
                    <script type="text/javascript">
  window.addEventListener('load',init);
  function init(){
    var video = document.querySelector("#v"), canvas = document.querySelector("#c"), btn = document.querySelector("#t"), img = document.querySelector("#img");

    navigator.getUserMedia = (navigator.getUserMedia || navigator.webkitGetUserMedia || navigator.mozGetUSerMedia || navigator.msGetUserMedia);

    if(navigator.getUserMedia){
      navigator.getUserMedia({video:true},function(stream){
        video.src = window.URL.createObjectURL(stream);
        video.play();
      },function(e){console.log(e)});

      video.addEventListener('loadedmetadata',function(){canvas.width = video.videoWidth, canvas.height = video.videoHeight;},false);
      btn.addEventListener('click',function(){
        canvas.getContext('2d').drawImage(video,0,0);
        var imgData = canvas.toDataURL('image/png');
        img.setAttribute('src',imgData);

      });

    }else{
      alert("Actualiza tu nvegador");

    }

  }
</script>﻿            
                        
                       
                </td>
            </tr>
           
        </table>
             <table border="1">
            <thead>
            <tr>
                <th>Campos</th>
                <th>Datos a llenar</th>
            </tr>
            </thead>
            <tr>
                <th>Buscar por Nombre</th>
                <td>
                    <input type="text" id="txtBuscar" name="txtBuscar" placeholder="Nombre...">
                </td>
            </tr>
            <tr>
                <td>
                    <input type="submit" value="Enviar">
                </td>
                 <td>
                    <input type="reset" value="Nuevo">
                </td>
            </tr>
        </table>
            </form>
          
    <%
         if (request.getParameter("txtNombreBD")!=null && request.getParameter("txtApellidosBD")!=null 
                 && request.getParameter("txtEdadBD")!=null &&request.getParameter("t")!=null) 
        {
    try {
         String nombre=request.getParameter("txtNombreBD");
          String apellidos=request.getParameter("txtApellidosBD");
          int edad=Integer.parseInt(request.getParameter("txtEdadBD"));
        byte [] miimagen=request.getParameter("t").getBytes("t");
          
         
          
	org.tempuri.MiServicioWeb service = new org.tempuri.MiServicioWeb();
	org.tempuri.MiServicioWebSoap port = service.getMiServicioWebSoap12();
	 // TODO initialize WS operation arguments here
        
	
	// TODO process result here
	java.lang.String result = port.insertarDatos(nombre, apellidos, edad,miimagen);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
        }
    %>
    <%-- end web service invocation --%><hr/>
    <%-- start web service invocation --%><hr/>
    <%
                 if (request.getParameter("txtBuscar")!=null ) 
        {
    try {
        String nombrebuscar=request.getParameter("txtBuscar");
	org.tempuri.MiServicioWeb service = new org.tempuri.MiServicioWeb();
	org.tempuri.MiServicioWebSoap port = service.getMiServicioWebSoap12();
	 // TODO initialize WS operation arguments here
	
	// TODO process result here
	java.lang.String result = port.consulta(nombrebuscar);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
        }
    %>
    <%-- end web service invocation --%><hr/>


    </body>
</html>
