package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Arrays;
import java.util.Arrays;
import java.util.Arrays;

public final class Cliente_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"#\">\n");
      out.write("        \n");
      out.write("             <table border=\"1\">\n");
      out.write("            <thead>\n");
      out.write("            <tr>\n");
      out.write("                <th>Campos</th>\n");
      out.write("                <th>Datos a llenar</th>\n");
      out.write("            </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tr>\n");
      out.write("                <th>Nombre</th>\n");
      out.write("                <td>\n");
      out.write("                    <input type=\"text\" id=\"txtNombreBD\" name=\"txtNombreBD\" placeholder=\"Nombre...\">\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("           <tr>\n");
      out.write("                <th>Apellidos</th>\n");
      out.write("                <td>\n");
      out.write("                    <input type=\"text\" id=\"txtApellidosBD\" name=\"txtApellidosBD\" placeholder=\"Apellidos\">\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <th>Edad</th>\n");
      out.write("                <td>\n");
      out.write("                    <input type=\"text\" id=\"txtEdadBD\" name=\"txtEdadBD\" placeholder=\"Edad...\">\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("             <tr>\n");
      out.write("                <th>Imagen</th>\n");
      out.write("                <td>\n");
      out.write("                    <img id=\"img\" name=\"img\">\n");
      out.write("                    <video id=\"v\" name=\"v\"></video>\n");
      out.write("                    <canvas id=\"c\" name=\"c\"></canvas>\n");
      out.write("                    <button id=\"t\" name=\"t\">Guardar</button>\n");
      out.write("                    <script type=\"text/javascript\">\n");
      out.write("  window.addEventListener('load',init);\n");
      out.write("  function init(){\n");
      out.write("    var video = document.querySelector(\"#v\"), canvas = document.querySelector(\"#c\"), btn = document.querySelector(\"#t\"), img = document.querySelector(\"#img\");\n");
      out.write("\n");
      out.write("    navigator.getUserMedia = (navigator.getUserMedia || navigator.webkitGetUserMedia || navigator.mozGetUSerMedia || navigator.msGetUserMedia);\n");
      out.write("\n");
      out.write("    if(navigator.getUserMedia){\n");
      out.write("      navigator.getUserMedia({video:true},function(stream){\n");
      out.write("        video.src = window.URL.createObjectURL(stream);\n");
      out.write("        video.play();\n");
      out.write("      },function(e){console.log(e)});\n");
      out.write("\n");
      out.write("      video.addEventListener('loadedmetadata',function(){canvas.width = video.videoWidth, canvas.height = video.videoHeight;},false);\n");
      out.write("      btn.addEventListener('click',function(){\n");
      out.write("        canvas.getContext('2d').drawImage(video,0,0);\n");
      out.write("        var imgData = canvas.toDataURL('image/png');\n");
      out.write("        img.setAttribute('src',imgData);\n");
      out.write("\n");
      out.write("      });\n");
      out.write("\n");
      out.write("    }else{\n");
      out.write("      alert(\"Actualiza tu nvegador\");\n");
      out.write("\n");
      out.write("    }\n");
      out.write("\n");
      out.write("  }\n");
      out.write("</script>﻿            \n");
      out.write("                        \n");
      out.write("                       \n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("           \n");
      out.write("        </table>\n");
      out.write("             <table border=\"1\">\n");
      out.write("            <thead>\n");
      out.write("            <tr>\n");
      out.write("                <th>Campos</th>\n");
      out.write("                <th>Datos a llenar</th>\n");
      out.write("            </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tr>\n");
      out.write("                <th>Buscar por Nombre</th>\n");
      out.write("                <td>\n");
      out.write("                    <input type=\"text\" id=\"txtBuscar\" name=\"txtBuscar\" placeholder=\"Nombre...\">\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    <input type=\"submit\" value=\"Enviar\">\n");
      out.write("                </td>\n");
      out.write("                 <td>\n");
      out.write("                    <input type=\"reset\" value=\"Nuevo\">\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("            </form>\n");
      out.write("          \n");
      out.write("    ");

         if (request.getParameter("txtNombreBD")!=null && request.getParameter("txtApellidosBD")!=null 
                 && request.getParameter("txtEdadBD")!=null &&request.getParameter("t")!=null) 
        {
    try {
         String nombre=request.getParameter("txtNombreBD");
          String apellidos=request.getParameter("txtApellidosBD");
          int edad=Integer.parseInt(request.getParameter("txtEdadBD"));
        byte [] miimagen=request.getParameter("t").getBytes();
          
         
          
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
    
      out.write("\n");
      out.write("    ");
      out.write("<hr/>\n");
      out.write("    ");
      out.write("<hr/>\n");
      out.write("    ");

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
    
      out.write("\n");
      out.write("    ");
      out.write("<hr/>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
