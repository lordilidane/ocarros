/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyectofinal;


import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.edisoncor.gui.panel.PanelAvatarChooser;
import org.edisoncor.gui.util.Avatar;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
/**
 *
 * @author Felipe Buitrago
 */
 
public class ControlSQL {
    
    String[] animal = {"id_animal", "nombre", "especie", "sexo","chip","tatoo","placa","marca","imagen"};
    String[] historia = {"id_historia","fecha","escrito_por","id_responsable","id_clinico","peso","pulso","fc",
                        "fr","temp","condicion_corporal","condicion_mental","condicion_manejo","estado_salud",
                        "anamnesis","anormalidades_y_problemas","longitud_total","longitud_cola","longitud_brazo",
                        "longitud_mano","longitud_pierna","longitud_pie","perimetro_abdomen","perimetro_torax",
                        "perimetro_craneo","testiculo","pene","vulva","pezon","observaciones","id_animal","imagen"};
    String[] responsable ={"id_responsable","nombre","id_entidad","identificacion","telefono","direccion","correo"};
    String[] clinico = {"id_clinico","nombre","identificacion","telefono","direccion","correo"};
    String[] prot_anestesia = {"id_prot_anestesia","fecha","duracion_efecto","exito_aplicacion","registro_id_registro"};
    String[] otras_aplicaciones = {"id_otras_aplicaciones","fecha","medicamento","dosis","dosis_total","Unidad","via_admin",
                                   "dias_aplicacion","Precio_total","registro_id_registro"};
    String[] quimica_sanguinea = {"id_quimica_sanguinea","precio_total","imagen","Observaciones","registro_id_registro"};
    String[] imagen={"id_imagen","imagen","descripcion","registro_id_registro"};
   // String[] registro = {"id_registro","fecha","responsable","clinico","animal_id_animal"};
    ConexionDB mysql = new ConexionDB();
    Connection cn = mysql.conexion;
    String [] tipo_marcaje ={"id_tipo_marcaje","nombre"};
    String [] marcaje = {"marcaje","historia_clinica_historia_clinica","tipo_marcaje_id_tipo_marcaje"};
    String [] historia_clinica ={"fecha_ingreso","ficha_ingreso","especie","historia_clinica","fecha_historia_clinica","nit_chip","recinto_n_ctna","recinto_n_exh","nombre_comun","sexo","edb","edad_aprox","antecedentes"};
    String [] examen_medico = {"id_examen_medico","precio_total","imagen","observaciones","registro_id_registro"};
    String [] anestesia = {"id_anestesia","dosis","dosis_total","hora","registro_id_registro"};
    String [] cuadro_hematico = {"id_cuadro_hematico","fecha_resultado","hemo_parasitos","eritrositos","hcg","htc","vcm","plq","leuco","neutrofilos","lifoncitos","esosin","monoc","basof","bandas","registro_id_registro"};
    String [] entidad_1_reptiles_cuelonios = {"estado_general","cabeza","pico","plastron_o_peto","caparax_o_caparazon","sistema_muscular","sistema_oseo","organos_de_sentidos","sistema_urogenital","sistema_cardiopulmonar","hidratacion","registro_id_registro"};
    String [] diagnostico = {"id_diagnostico","observacion_clinicas","diagnostico_presuntivo","diagnostico_diferencial","pronostico","registro_id_registro"};
    String [] medicamento = {"id_medicamento","fecha","medicamento","dosis","dosis_total","unidad","via_admin","dias_aplicacion","precio_total","registro_id_registro"};
    String [] constantes_fisiologicas = {"id_constantes_fisiologicas","fc","fr","t","pulso","tllc","peso","registro_id_registro"};
    String [] examen_solicitado = {"examen_solicitado","nombre_examen","registro_id_registro"};
    String [] examen_solicitado2 = {"id_examen","id_registro"};
    String [] examen = {"id_examen","nombre"};
    String [] entidad_13_reptiles_crocodylus = {"estado_general","cabeza","maxilares","boca","cuello","region_dorsal","region_caudal","sistema_muscular","sistema_oseo","organos_de_sentidos","sistema_urogenital","sistema_cardiopulmonar","hidratacion","registro_id_registro"};
    String [] entidad_8_aves_mamiferos = {"estado_general","tegumento","mucosas","tracto_gastrointestinal","sistema_lifantico","sistema_cardiopulmonar","sistema_muscular","sistema_oseo","sistema_urogenital","organos_de_sentidos","sistema_nervioso","comportamiento","hidratacion","registro_id_registro"};
    String [] origen = {"id_origen","tipo_origen","historia_clinica_historia_clinica"};
    String [] registro = { "id_registro","fecha","responsable","clinico","historia_clinica_historia_clinica"};
     public String[] cargarTitulos(String nombreTabla){
        
         switch (nombreTabla) {
            case "animal":
                   return animal;                 
            case "historia":
                return historia;
            case "imagen":
                return imagen;
                 
            case "registro": 
                return registro;
     
     
            case "responsable":
                return responsable;      
    
            case "clinico" :
                return clinico;      
    
            case "prot_anestesia" :
                return prot_anestesia;      
    
            case "otras_aplicaciones":
                 return otras_aplicaciones;
    
            case "quimica_sanguinea":
                return quimica_sanguinea;
            case "tipo_marcaje" :
                return tipo_marcaje;

            case "marcaje" :
                return marcaje;

            case "historia_clinica":
                return historia_clinica;

            case "examen_medico":
                return examen_medico;

            case "anestesia" :
                return anestesia;

            case "cuadro_hematico" :
                return cuadro_hematico;

            case "entidad_1_reptiles_cuelonios":
                return entidad_1_reptiles_cuelonios;

            case "diagnostico" :
                return diagnostico;

            case "medicamento":
                return medicamento;

            case "constantes_fisiologicas":
                return constantes_fisiologicas;

            case "examen_solicitado":
                return examen_solicitado;
                
            case "examen_solicitado2":
                return examen_solicitado2;
                
            case "examen":
                return examen;

            case "entidad_13_reptiles_crocodylus":
                return entidad_13_reptiles_crocodylus;

            case "entidad_8_aves_mamiferos":
                return entidad_8_aves_mamiferos;

            case "origen":
                return origen;
      
            default:                 
                return null;
         }      
       
    }
    public void cargarBoxDeBusqueda(String nombreTabla,JComboBox parametroBox,JComboBox boxBusqueda){      
      String campo = parametroBox.getSelectedItem().toString(); 
        String esSQL = "SELECT "+campo+" FROM "+nombreTabla;   
         System.out.println(esSQL);
        ArrayList  array = new ArrayList();
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(esSQL);
        
    while(rs.next())
            {                   
                    array.add(rs.getObject(campo));
                 
            }
    } catch (SQLException ex) {
            Logger.getLogger(ControlSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
          String[] registro = new String[array.size()+1] ;
          registro[0]="";
         for (int i = 0; i < array.size(); i++) {
             if(array.get(i)!=null)
            registro[i+1]= array.get(i).toString();
             else
                 registro[i+1]=null;
        }
         boxBusqueda.setModel(new javax.swing.DefaultComboBoxModel(registro));
        
    }
    /*
    este metodo hay que hacerle terminarlo en caso de ser nesesario usarlo
    */
    
     public void llenarBox(String nombreTabla,String campo,JComboBox Jcombobox){
       String esSQL = "SELECT "+campo+" FROM "+nombreTabla;     
        ArrayList  array = new ArrayList();
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(esSQL);
        
    while(rs.next())
            {             
                int columnas = rs.getMetaData().getColumnCount();
                
                
                String texto="";
                if(campo.equals("id_animal,nombre")){
                    texto = rs.getObject(1)+". "+rs.getObject(2);                    
                    }else{
                        for (int i = 1; i <= columnas; i++) {
                              if(texto.equals("")){
                                  texto=""+rs.getObject(i);
                              }else{
                                texto = texto+" "+rs.getObject(i); 
                              }
                        }
                    }
                    array.add(texto);
                 
            }
    } catch (SQLException ex) {
            Logger.getLogger(ControlSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
          String[] registro = new String[array.size()+1] ;
          registro[0]="";
         for (int i = 0; i < array.size(); i++) {
             if(array.get(i)!=null)
            registro[i+1]= array.get(i).toString();
             else
                 registro[i+1]=null;
        }
         
         Jcombobox.setModel(new javax.swing.DefaultComboBoxModel(registro));
         AutoCompleteDecorator.decorate(Jcombobox);
        
     }
    public String[] cargarTitulos(String nombreTabla,JComboBox parametroBox){
         
        switch (nombreTabla) {
            case "animal":
                   parametroBox.setModel(new javax.swing.DefaultComboBoxModel(animal));   
                   return animal;  
                
            case "historia":
                 parametroBox.setModel(new javax.swing.DefaultComboBoxModel(historia));   
                return historia;
                
            case "imagen":
                parametroBox.setModel(new javax.swing.DefaultComboBoxModel(imagen)); 
                return imagen;
                 
            case "registro":
                parametroBox.setModel(new javax.swing.DefaultComboBoxModel(registro)); 
                return registro;
     
     
            case "responsable":
                parametroBox.setModel(new javax.swing.DefaultComboBoxModel(responsable)); 
                return responsable;      
    
            case "clinico" :
                parametroBox.setModel(new javax.swing.DefaultComboBoxModel(clinico)); 
                return clinico;      
    
            case "prot_anestesia" :
                parametroBox.setModel(new javax.swing.DefaultComboBoxModel(prot_anestesia)); 
                return prot_anestesia;      
    
            case "otras_aplicaciones":
                parametroBox.setModel(new javax.swing.DefaultComboBoxModel(otras_aplicaciones)); 
                 return otras_aplicaciones;
    
            case "quimica_sanguinea":
                parametroBox.setModel(new javax.swing.DefaultComboBoxModel(quimica_sanguinea)); 
                return quimica_sanguinea;
            case "tipo_marcaje" :
                parametroBox.setModel(new javax.swing.DefaultComboBoxModel(tipo_marcaje)); 
                return tipo_marcaje;

            case "marcaje" :
                parametroBox.setModel(new javax.swing.DefaultComboBoxModel(marcaje)); 
                return marcaje;

            case "historia_clinica":
                parametroBox.setModel(new javax.swing.DefaultComboBoxModel(historia_clinica)); 
                return historia_clinica;

            case "examen_medico":
                parametroBox.setModel(new javax.swing.DefaultComboBoxModel(examen_medico)); 
                return examen_medico;

            case "anestesia" :
                parametroBox.setModel(new javax.swing.DefaultComboBoxModel(anestesia)); 
                return anestesia;

            case "cuadro_hematico" :
                parametroBox.setModel(new javax.swing.DefaultComboBoxModel(cuadro_hematico)); 
                return cuadro_hematico;

            case "entidad_1_reptiles_cuelonios":
                parametroBox.setModel(new javax.swing.DefaultComboBoxModel(entidad_1_reptiles_cuelonios)); 
                return entidad_1_reptiles_cuelonios;

            case "diagnostico" :
                parametroBox.setModel(new javax.swing.DefaultComboBoxModel(diagnostico)); 
                return diagnostico;

            case "medicamento":
                parametroBox.setModel(new javax.swing.DefaultComboBoxModel(medicamento)); 
                return medicamento;

            case "constantes_fisiologicas":
                parametroBox.setModel(new javax.swing.DefaultComboBoxModel(constantes_fisiologicas)); 
                return constantes_fisiologicas;

            case "examen_solicitado":
                parametroBox.setModel(new javax.swing.DefaultComboBoxModel(examen_solicitado)); 
                return examen_solicitado;
                
            case "examen_solicitado2":
                parametroBox.setModel(new javax.swing.DefaultComboBoxModel(examen_solicitado2)); 
                return examen_solicitado2;    
                
            case "examen":
                parametroBox.setModel(new javax.swing.DefaultComboBoxModel(examen)); 
                return examen;

            case "entidad_13_reptiles_crocodylus":
                parametroBox.setModel(new javax.swing.DefaultComboBoxModel(entidad_13_reptiles_crocodylus)); 
                return entidad_13_reptiles_crocodylus;

            case "entidad_8_aves_mamiferos":
                parametroBox.setModel(new javax.swing.DefaultComboBoxModel(entidad_8_aves_mamiferos)); 
                return entidad_8_aves_mamiferos;

            case "origen":
                parametroBox.setModel(new javax.swing.DefaultComboBoxModel(origen)); 
                return origen;
      
            default:                 
                return null;
         }     
        
   
    }
   
   public DefaultTableModel CargarTabla(JTable tabla,String nombreTabla,JComboBox parametroBox,JComboBox boxBusqueda,JLabel parametro1){
   DefaultTableModel modelo;
   parametro1.setText(nombreTabla.toUpperCase());
  
        String[] titulos = cargarTitulos(nombreTabla, parametroBox);
        cargarBoxDeBusqueda(nombreTabla, parametroBox, boxBusqueda);
        
        boxBusqueda.setEditable(true);
        AutoCompleteDecorator.decorate(boxBusqueda);
        Object[] registro = new Object[titulos.length];
       
        String esSQL = "SELECT * FROM "+nombreTabla;
       
        modelo = new DefaultTableModel(null, titulos);
        try
        {
            
            Statement st = cn.createStatement();           
            ResultSet rs = st.executeQuery(esSQL);
          
            while(rs.next())
            {
             
                for (int i = 0; i < titulos.length; i++) {
//                    if(titulos[i].equals("fecha")){
//                       registro[i]="2013-11-08";
//                    }else{
                    registro[i] = rs.getObject(titulos[i]);
                    
                }
                
                
                modelo.addRow(registro);
            }
            tabla.setModel(modelo);

          
        } 
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex+"\nfallo carga tabla");
        }
    return modelo;
    }
     
     public boolean InsertarDatos(String[] vectorRegistros,String nombreTabla){
       boolean guardadoConExito = false;
         String vectorCampos[] = cargarTitulos(nombreTabla);
//            JOptionPane.showMessageDialog(this, "Inserte el codigo del Cliente","Atencion", JOptionPane.ERROR_MESSAGE);
         String sql="INSERT INTO "+nombreTabla+" (";  
         String values="VALUES(";
         int tamanoVector = vectorCampos.length;
         for (int i = 0; i < tamanoVector; i++) {
             sql = sql+vectorCampos[i]+"";
             values = values+"?";
             if(i+1 < tamanoVector){
             sql=sql+",";
             values = values+",";
             }
         }
         values = values+")";
         sql=sql+")";
         
//            sql="INSERT INTO clientes (codigo, nombre, nombre2, identificacion, ciudad, direccion, telefono) VALUES(?,?,?,?,?,?,?)";
         sql=sql+values;
         System.out.println(sql);
         try {
            PreparedStatement p= cn.prepareStatement(sql);
             for (int i = 0; i < tamanoVector; i++) {
                 System.out.println(vectorRegistros[i]);
                if(vectorCampos[i].equals("imagen")&&vectorRegistros[i]!=null){
                    File imagen = new File(vectorRegistros[i]);
                    FileInputStream fis = new FileInputStream(imagen);               
                    p.setBinaryStream(i+1,fis,(int)imagen.length()); 
                
                }else                    
                p.setString(i+1,vectorRegistros[i]);
             }
                       
            boolean n= p.execute();
            guardadoConExito = true;
             
            if(n){
                  System.out.println("Guardado con exito");
                  
//                JOptionPane.showMessageDialog(null, "Se Ha Guardado el Regitro con Exito");
                    }
            
        } catch (SQLException ex) {
            guardadoConExito = false;
            Logger.getLogger(ControlSQL.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(null, "error al insertar los datos");            
        
            } catch (FileNotFoundException ex) {
                guardadoConExito = false;
            Logger.getLogger(ControlSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
         return guardadoConExito;
     }
     
     public boolean InsertarDatos(ArrayList<String> vectorRegistros,String nombreTabla){
       boolean guardadoConExito = false;
         String vectorCampos[] = cargarTitulos(nombreTabla);
//            JOptionPane.showMessageDialog(this, "Inserte el codigo del Cliente","Atencion", JOptionPane.ERROR_MESSAGE);
         String sql="INSERT INTO "+nombreTabla+" (";  
         String values="VALUES(";
         int tamanoVector = vectorCampos.length;
         for (int i = 0; i < tamanoVector; i++) {
             sql = sql+vectorCampos[i]+"";
             values = values+"?";
             if(i+1 < tamanoVector){
             sql=sql+",";
             values = values+",";
             }
         }
         values = values+")";
         sql=sql+")";
         
//            sql="INSERT INTO clientes (codigo, nombre, nombre2, identificacion, ciudad, direccion, telefono) VALUES(?,?,?,?,?,?,?)";
         sql=sql+values;
         System.out.println(sql);
         try {
            PreparedStatement p= cn.prepareStatement(sql);
             for (int i = 0; i < tamanoVector; i++) {
                 System.out.println(vectorRegistros.get(i));
                if(vectorCampos[i].equals("imagen")&&vectorRegistros.get(i)!=null){
                    File imagen = new File(vectorRegistros.get(i));
                    FileInputStream fis = new FileInputStream(imagen);               
                    p.setBinaryStream(i+1,fis,(int)imagen.length()); 
                
                }else                    
                p.setString(i+1,vectorRegistros.get(i));
             }
                       
            boolean n= p.execute();
            guardadoConExito = true;
             
            if(n){
                  System.out.println("Guardado con exito");
                  
//                JOptionPane.showMessageDialog(null, "Se Ha Guardado el Regitro con Exito");
                    }
            
        } catch (SQLException ex) {
            guardadoConExito = false;
            Logger.getLogger(ControlSQL.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(null, "error al insertar los datos");            
        
            } catch (FileNotFoundException ex) {
                guardadoConExito = false;
            Logger.getLogger(ControlSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
         return guardadoConExito;
     }
     
     public void buscar(JTable tabla,String nombreTabla,JComboBox parametroBox,JComboBox boxBusqueda){
   DefaultTableModel modelo;  
  
        String parametrobox= parametroBox.getSelectedItem().toString();
        String boxbusqueda = boxBusqueda.getSelectedItem().toString();
        String[] titulos = cargarTitulos(nombreTabla);        
        Object[] registro = new Object[titulos.length];
       
        String esSQL = "SELECT * FROM "+nombreTabla+" WHERE "+ parametrobox+" = '"+boxbusqueda+"' ;";
        modelo = new DefaultTableModel(null, titulos);
        try
        {
            
            Statement st = cn.createStatement();           
            ResultSet rs = st.executeQuery(esSQL);
          
            while(rs.next())
            {             
                for (int i = 0; i < titulos.length; i++) {
//                    if(titulos[i].equals("fecha")){
//                       registro[i]=rs.getObject(titulos[i]);
//                    }else
                    registro[i] = rs.getObject(titulos[i]);
                    
                }
                
                
                modelo.addRow(registro);
            }
            tabla.setModel(modelo);          
        } 
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex+"\nfallo carga tabla");
        }
         
     }
public void guardarImagen(String ruta){
    
String sql = "insert into animal(id_animal,imagen) values (?,?)";
PreparedStatement stmt;
        try {
            stmt = cn.prepareStatement(sql);
        
    File imagen = new File(ruta);
    FileInputStream fis = new FileInputStream(imagen);
    stmt.setString(1, "18");
    stmt.setBinaryStream(2,fis,(int)imagen.length());
    stmt.execute();
} catch (SQLException ex) {
            Logger.getLogger(ControlSQL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ControlSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
}
public BufferedImage mostrarImagen(String nombreTabla,String id,JLabel label){
BufferedImage img = null;
String titulos[] =cargarTitulos(nombreTabla);
boolean existeImagen=false;
    
    for (int i = 0; i < titulos.length; i++) {
        if(titulos[i].equals("imagen")){
        existeImagen=true;
        }        
    }
    if(existeImagen)
    try {    
    Statement st = cn.createStatement();  
    String sql ="SELECT imagen FROM "+nombreTabla+" where "+titulos[0]+" = "+id;
        System.out.println(sql);
    try (ResultSet rs = st.executeQuery(sql)) {
        while (rs.next())
        {
            try {
            Blob blob = rs.getBlob("imagen");
           if(blob!=null){
                byte[] data = blob.getBytes(1, (int)blob.length());  
                img = ImageIO.read(new ByteArrayInputStream(data));
           }
                
            } catch (IOException ex) {
                Logger.getLogger(null).log(Level.SEVERE, null, ex);
            }
//imagen.setImagen(img);
//imagen.setNombre(nombre);
//lista.add(imagen);
        }   
    }
} catch (SQLException ex) {
Logger.getLogger(null).log(Level.SEVERE, null, ex);
}
if(label != null)
if(img!=null){
ImageIcon icono = new ImageIcon((new ImageIcon(img)).getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT));
label.setIcon(icono); 
}else
    label.setIcon(null);

return img;
}
 public  void actualizar(String nombreTabla,String columna,String valor,String id){

        String sql1 = "UPDATE "+nombreTabla+" SET "+columna+" = '"+valor+"' where "+cargarTitulos(nombreTabla)[0]+" = "+id;
        System.out.println(sql1);
    
        Statement st2;
        try {
            st2 = cn.createStatement();
              st2.execute(sql1);
                  } catch (SQLException ex)
        {
           String e = ex+"";
            e=e.substring(e.indexOf(":"));
             JOptionPane.showMessageDialog(null, "ERROR "+e);
        }
    } 
 public void eliminar(String nombreTabla,String nombre,String id,JPanel panel){
          Statement st2;
            String mostrar = "";
            String   sql1;
        
//        for (int i = 0; i < nombres.length; i++) {
//        mostrar= mostrar+nombres[i]+"\n";
//        }
        if(JOptionPane.showConfirmDialog(panel,"Eliminar \nEsta seguro que desea eliminar los siguientes registros? :"+"\n\n"+nombre)==0){        
        
//            for (int i = 0; i < nombres.length; i++) {
            try {
              sql1="DELETE FROM "+nombreTabla+" WHERE "+cargarTitulos(nombreTabla)[0] +"= "+id+";";     
                System.out.println(sql1);
              st2 = cn.createStatement();
              st2.execute(sql1);
          
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(panel,"error al eliminar a "+ nombre);
               
            }
        
//        }
      
        }
 
 }
 /**
  * busca un unico valor en una consulta
  * @param sql la consulta debe devolver un unico valor 
  * @return tipo Objeto valor buscado 
  */
  public Object ejecutarConsulta(String sql){
 
     
          Statement st;            
        Object objeto = null ;
            try {
                
              System.out.println(sql);
              st = cn.createStatement();  
              
               ResultSet rs = st.executeQuery(sql);
                System.out.println(rs);
                        
                System.out.println(rs);
                if(rs.next()){
                objeto = rs.getObject(1);
                }
               else{
                   objeto = null;
               }
               System.out.println(objeto);
                
          
            } catch (SQLException ex) {      
                
                //JOptionPane.showMessageDialog(null,ex.toString());
               Logger.getLogger(null).log(Level.SEVERE, null, ex);
            }
return  objeto;
 }
   public String SiguienteID(String nomnbreTabla){
        String SQL = "select ifnull(max(id_"+nomnbreTabla+"),0) as cantidad from "+nomnbreTabla;
        Object objeto = ejecutarConsulta(SQL);
        int cantidadRegistros = Integer.parseInt(objeto+"");
        cantidadRegistros++;
   
    return cantidadRegistros+"";
    }
  /**
  * consulta una fila de un registro en especifico
  * @param sql consulta sql que retorne unicamente una fila no se admite mas de una
  * @return Obejeto tipo ArrayList
  */
  public ArrayList ejecutarConsultaFila(String sql){
 
     
          Statement st;            
        ArrayList objeto = new ArrayList() ;
            try {
                
              System.out.println(sql);
              st = cn.createStatement();             
               ResultSet rs = st.executeQuery(sql);
               
               if(rs.next()){
                   
               
               int i=1;
               
               
                while(rs.getObject(i)!=null) {
                    objeto.add(rs.getObject(i)); 
                    i++;
                }
                           
               }
            } catch (SQLException ex) {      
                
                //JOptionPane.showMessageDialog(null,ex.toString());
               
            }
return  objeto;
 }
  
    public ArrayList ejecutarConsulta2(String sql){
 
     
          Statement st;            
        ArrayList objeto = new ArrayList() ;
            try {
                
              System.out.println(sql);
              st = cn.createStatement();             
               ResultSet rs = st.executeQuery(sql);
               while(rs.next()){
               objeto.add(rs.getObject(1));
               }  
            } catch (SQLException ex) {      
                Logger.getLogger(null).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null,ex.toString());
               
            }
return  objeto;
    }
    public void llenarPanelAvatar(PanelAvatarChooser panelAvatar,String nombreTabla,String id_animal){
       
       BufferedImage imagen = null;
       List avatares = new ArrayList();
       String busqueda1="";
       String busqueda2="";
       String busqueda3="";
       if (nombreTabla.equals("animal")){
       busqueda1="select id_"+nombreTabla+" from "+nombreTabla;
       busqueda2="select nombre from " +nombreTabla;
       }
       //........................................................................insertar imagenes de registros en avator chooser
       if(nombreTabla.equals("registro")){
           //select i.id_imagen from imagen i,registro r where  i.registro_id_registro = r.id_registro and r.id_registro = 3;
       
       busqueda1="select i.id_imagen from imagen i,registro r where  i.registro_id_registro = r.id_registro and r.animal_id_animal = "+id_animal +" GROUP BY i.registro_id_registro";
       busqueda2="select fecha from " +nombreTabla;       
       busqueda3="select id_registro from registro where animal_id_animal = "+id_animal;
       }
       
       
       ArrayList id_tabla = ejecutarConsulta2(busqueda1);
      
        System.out.println("id tabla size");
        System.out.println(id_tabla.size());
        
       ArrayList nombre = ejecutarConsulta2(busqueda2);
       ArrayList id_registro = null;
       if(nombreTabla.equals("registro")){
       id_registro = ejecutarConsulta2(busqueda3);
       }
       ImageResizer redim = new ImageResizer();
      if(id_tabla.size() != 0)
       for (int i = 0; i < id_tabla.size(); i++) {
        if(nombreTabla.equals("registro")){
            imagen = mostrarImagen("imagen",id_tabla.get(i).toString(),null);
        }else{
             imagen = mostrarImagen(nombreTabla,id_tabla.get(i).toString(),null);
        }
        
          
        if(id_tabla.size()==1 && avatares.size()==0){
         avatares.add(new Avatar("Registro auxiliar",(BufferedImage)loadImage("/imagenes/Perro.png")));
        }
        if(imagen != null){
                //redimensionar las imagenes
            
        imagen  = redim.resize(imagen, 180, 180);
             if(nombreTabla.equals("registro")){
                avatares.add(new Avatar(id_registro.get(i).toString()+". "+ nombre.get(i).toString(),imagen));     
            }else{
                avatares.add(new Avatar(id_tabla.get(i).toString()+". "+ nombre.get(i).toString(),imagen));
                    }
        }else            
            if(nombreTabla.equals("registro")){
                avatares.add(new Avatar(id_registro.get(i).toString()+". "+ nombre.get(i).toString(),(BufferedImage)loadImage("/imagenes/Perro.png")));
            }else{  
                avatares.add(new Avatar(id_tabla.get(i).toString()+". "+ nombre.get(i).toString(),(BufferedImage)loadImage("/imagenes/Perro.png")));
            }
       // avatares.add(new Avatar("Protocolo ",loadImage("/images/pez amarillo 128 x 128.png")));
        }
       // System.out.println(avatares.size());
        if ( avatares.size()!=0) {
            panelAvatar.setAvatars(avatares);
        }else{
            avatares.add(new Avatar("null",(BufferedImage)loadImage("/imagenes/Perro.png")));
            //panelAvatar.setAvatars(avatares);
        }  
    }
    private static Image loadImage(String fileName){
        try{
        return ImageIO.read(JFrame.class.getResource(fileName));
        }catch(IOException e){
        JOptionPane.showMessageDialog(null, "problema al cargar imagen");
         return null;
        }
}
}


