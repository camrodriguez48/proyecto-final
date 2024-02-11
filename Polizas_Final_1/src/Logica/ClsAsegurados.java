package Logica;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class ClsAsegurados {
   public int NumAsegurados;
   public String NomAseg;
   public String FechaNac;
   public String Categoria;
   public String Hospital;
   public String Estado;
   
   //Constructor
   public ClsAsegurados(){
   }
   
   /**Lógica-Método para Registrar Persona*/
    public boolean RegistrarAsegurados(){
     boolean respuesta=true;
     
    try {
         Datos.ClsAsegurados asegurados=new Datos.ClsAsegurados();
         asegurados.NumAsegurados=this.NumAsegurados;
         asegurados.NomAseg=this.NomAseg;
         asegurados.FechaNac=this.FechaNac;
         asegurados.Categoria=this.Categoria;
         asegurados.Hospital=this.Hospital;
         asegurados.Estado=this.Estado;

        respuesta=asegurados.RegistrarAsegurados(); //ejecuta el método que registra asegurados
                 
    }catch(Exception ex){
        System.out.println("Se ha presentado el siguiente Error: "+ex);
    }

    return respuesta;
}
   /**Lógica-Método para Actualizar Persona*/
    public boolean ActualizarAsegurados(){
     boolean respuesta=true;
     
    try {
         Datos.ClsAsegurados asegurados=new Datos.ClsAsegurados();
         asegurados.NumAsegurados=this.NumAsegurados;
         asegurados.NomAseg=this.NomAseg;
         asegurados.FechaNac=this.FechaNac;
         asegurados.Categoria=this.Categoria;
         asegurados.Hospital=this.Hospital;
         asegurados.Estado=this.Estado;
         
        respuesta=asegurados.ActualizarAsegurados(); //ejecuta el método que actualiza asegurado
                 
    }catch(Exception ex){
        System.out.println("Se ha presentado el siguiente Error: "+ex);
    }

    return respuesta;
}

public boolean EliminarAsegurados(int NumAsegurados){
     boolean respuesta=true;
     
    try {
         Datos.ClsAsegurados asegurados=new Datos.ClsAsegurados();
         respuesta=asegurados.EliminarAsegurados(NumAsegurados); //ejecuta el método que elimina asegurados         
    }catch(Exception ex){
        System.out.println("Se ha presentado el siguiente Error: "+ex);
    }

    return respuesta;
}

/** Lógica-Convierte fecha de String a Date*/
    public Date ConvertirFecha(String Fecha){
    //System.out.println(Fecha);
    Date fechaDevolver=null;
    SimpleDateFormat FormatoFecha= new SimpleDateFormat("dd/MM/yyyy");
        try {
            fechaDevolver=(Date)FormatoFecha.parse(Fecha);
            //System.out.println(fechaDevolver);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    return fechaDevolver;
}
     /**Lógica- Listar Personas*/
       public TableModel ListarAsegurados(){
        TableModel modelo = new DefaultTableModel();

        try {
                       Datos.ClsAsegurados persona=new Datos.ClsAsegurados();
                       modelo=persona.ListarAsegurados();
            
        } catch(Exception ex) {
             System.out.println(ex);        
        }
        return modelo;
       }
       
       

       
       
       
       

      /**Lógica- Busca Personas*/
       public TableModel BusquedaAsegurados(String NomAseg){
        TableModel modelo = new DefaultTableModel();

        try {
                       Datos.ClsAsegurados asegurados=new Datos.ClsAsegurados();
                       modelo=asegurados.BusquedaAsegurados(NomAseg);
            
        } catch(Exception ex) {
             System.out.println(ex);        
        }
        return modelo;
       }
       
       
          
}
