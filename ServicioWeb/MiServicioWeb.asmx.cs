using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Services;
using MySql.Data.MySqlClient;
using System.Data;
using System.Data.SqlClient;
using System.IO;
using System.Drawing.Imaging;
using System.Drawing;

namespace ServicioWeb
{
    /// <summary>
    /// Descripción breve de MiServicioWeb
    /// </summary>
    [WebService(Namespace = "http://tempuri.org/")]
    [WebServiceBinding(ConformsTo = WsiProfiles.BasicProfile1_1)]
    [System.ComponentModel.ToolboxItem(false)]
    // Para permitir que se llame a este servicio web desde un script, usando ASP.NET AJAX, quite la marca de comentario de la línea siguiente. 
    // [System.Web.Script.Services.ScriptService]
    public class MiServicioWeb : System.Web.Services.WebService
    {
        Conexion miconexion = new Conexion();
        String resultado;
        String resultado2;
        String datos;
        //List <MiEntidad> lista = new List();
        SqlDataAdapter miAdapatador = new SqlDataAdapter();
        DataView dv = new DataView();
        SqlCommand cmd;
        MemoryStream ms;

        //public string stConeccion;
        //private string stConsulta;
        public MySqlConnection Cnn = new MySqlConnection();
        [WebMethod]
        public string hola(int anio, String nombre)
        {
            try
            {
                int edad;
                edad = 2018 - anio;
                resultado = "Hola " + nombre.ToUpper() + " tienes " + edad + " años";
            }
            catch (Exception ex)
            {
            }
            return resultado;
        }
        [WebMethod]
        public String tablas(int num1, int num2)
        {
            try
            {

                for (int i = 1; i <= num2; i++)
                {
                    int miresultado = num1 * i;
                    Console.WriteLine(resultado2 = resultado2 + num1 + "*" + i + "=" + miresultado + "\n");


                }
            }
            catch (Exception ex)
            {

            }
            return resultado2;
        }

        [WebMethod]
        public String insertarDatos(String nombre, String apellidos, int edad )
        {
            //string connectionString ="Server=localhost;" +"Database=mibase;" +"User ID=root;" +"Password=12345678;";
            //IDbConnection conexion;
            //conexion = new MySqlConnection(connectionString);
            //conexion.Open();
            //IDbCommand dbcmd = conexion.CreateCommand();
            //string guardado = "INSERT INTO mitabla(nombre, apellidos, edad)" +"VALUES('"+nombre+"','"+apellidos+"','"+ edad+"')";
            //dbcmd.CommandText = guardado;
            //dbcmd.ExecuteNonQuery();
            //conexion.Close();
            //conexion = null;
            //return resultado2=guardado;
            
         
            string guardado;
            //cargimg();
            //ms = new MemoryStream();
            //imagen = new byte[ms.Length];
            //ms.Position = 0;
            //ms.Read(imagen, 0, imagen.Length);
            //cmd.Parameters.AddWithValue("imagen", imagen);
            guardado = "INSERT INTO tabla2(nombre, apellidos, edad)" + "VALUES('" + nombre + "','" + apellidos + "','" + edad +"')";
            miconexion.conectarBD();
            if(miconexion.ejecutarSQL(guardado))
            {
                resultado2 = guardado;
            }
            return resultado2;
        }
      
        [WebMethod]
        public String consulta(string nombre)
        {
            //stConeccion = "Server=localhost;" + "Database=mibase;" + "User ID=root;" + "Password=12345678;";
            //Cnn.ConnectionString = stConeccion;
            //Cnn.Open();
            //stConsulta = "select *from mitabla where nombre='"+nombre+"'";
            //MySqlCommand myCmd = new MySqlCommand();
            //myCmd.Connection = Cnn;
            //myCmd.CommandText = stConsulta;
            //MySqlDataReader myReader = myCmd.ExecuteReader();
            //if(myReader.HasRows)
            //{
            //    while(myReader.Read())
            //    {
            //        myReader.Read();
            //        datos = myReader["nombre"] +" "+ myReader["apellidos"] +" "+ myReader["edad"];
            //    }
            //}
            //Cnn.Close();
          
            
            try
            {
                miconexion.conectarBD();
                SqlCommand comando = new SqlCommand("Select *from tabla2 where nombre='"+nombre+"'",miconexion.variableConexion);
                SqlDataReader lector = comando.ExecuteReader();
                if (lector.HasRows)
                {
                    while (lector.Read())
                    {
                        datos = (Convert.ToString(lector["id"])) + "  " + (Convert.ToString(lector["nombre"])) + "  " + (Convert.ToString(lector["apellidos"]));
                    }
                }

            }
            catch(Exception ex)
            {
                
            }
            return datos;

           
        }
        public void cargimg()
        {
           
           
        }
    }
}

