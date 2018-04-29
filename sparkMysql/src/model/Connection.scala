package model 
import java.sql.DriverManager
import java.util.Properties
import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql
import org.apache.spark.SparkContext
import org.apache.spark.sql.Dataset
import org.apache.spark.sql.Row
import org.apache.spark.sql.DataFrame
import org.apache.spark.sql.DataFrameReader

/*Importamos todas la Librerias desde C://spark/jars*/
object Connection{
    def main(args: Array[String]) {
    
   /*Definimos las Varaibles*/
    val url="jdbc:mysql://localhost/empresa"
    val user="root"
    val pass="Naizuore1x"
    val driver="com.mysql.jdbc.Driver"
    
    val spark = SparkSession
      .builder()
    
    val connection = DriverManager.getConnection(url, user, pass)
    
    
     if(connection != null){
      println("Conectado a MySQL")
    }else{
      println("No Conectado a MySQL")
    }
    
   try {
    Class.forName(driver)
    val statement = connection.createStatement
    val rs = statement.executeQuery("SELECT Numclie, Empresa FROM clientes")
    
    while (rs.next()){
      val Numclie = rs.getString("Numclie")
      val Empresa = rs.getString("Empresa")
      println("Número Cliente = %s, Nombre Empresa = %s".format(Numclie,Empresa))
    }
   }catch{
     case e: Exception => e.printStackTrace
   }
   
     
     connection.isClosed()
  }
}