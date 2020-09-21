using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Data.SqlClient;


namespace ServicioWeb
{
    public class Conexion
    {
        //declarar una variable de conexio de tipo SQLConnection
        public SqlConnection variableConexion=new SqlConnection();
        //creamos o declaramos una variable que permitira revisar las operaciones con la base de datos 
        SqlCommand comandoSQL;
        //Conexion con = new Conexion();
        

        //declaramos una variable de tipo booleano que indicara true cuando¡
        //se haya hecho la conexion o false cuando algo falla
        Boolean conectado, ejecutado;
        public Boolean conectarBD()
        {
            try
            {
                //inicializra mi variable de conexion
                // variableConexion=new SqlConnection("Data Source=JIMENA\\JIMENA;Initial Catalog=BDIntegrador502;Integrated Security=True");
                //Data Source=JIMENA\JIMENA;Initial Catalog=BDIntegrador502;Integrated Security=True
                //abrimos la conexion
                variableConexion = new SqlConnection("Data Source=MAURICIOT;Initial Catalog=pruebas;Integrated Security=True");

                variableConexion.Open();
                conectado = true;
            }
            catch (Exception ex)
            {
                conectado = false;
             
            }
            return conectado;
        }
        public Boolean ejecutarSQL(String sql)

        {
            try
            {
                //PREPARAMOS LA SENTENCIA A EJECUTAR
                comandoSQL = new SqlCommand(sql, variableConexion);
                //SE EJECUTA LA SENTYENCIA
                comandoSQL.ExecuteNonQuery();
                ejecutado = true;
            }
            catch (Exception ex)
            {
                ejecutado = false;
            }
            return ejecutado;

        }

    }
}