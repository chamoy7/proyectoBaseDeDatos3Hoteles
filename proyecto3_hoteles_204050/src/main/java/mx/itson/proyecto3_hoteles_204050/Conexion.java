/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.proyecto3_hoteles_204050;

import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Jesus
 */
public class Conexion {
    public MongoClient crearConexion(){
        MongoClient mongo=null;
        String servidor="localhost";
        Integer puerto=27017;
        try{
            mongo=new MongoClient(servidor,puerto);
            List<String> NombreBaseDatos=mongo.getDatabaseNames();
            JOptionPane.showMessageDialog(null, "Se conecto correctamente a MongoDB, las base de datos son: "+NombreBaseDatos.toString());
        }catch(MongoException e){
            JOptionPane.showMessageDialog(null, "Error en la conexion a MongoDB, error: "+e.toString());
        }
        return mongo;
    }
}
