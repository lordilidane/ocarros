/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package historiasclinicaslosocarros2;

import com.toedter.calendar.JDateChooser;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import org.edisoncor.gui.panel.Panel;
import proyectofinal.ControlSQL;
import proyectofinal.PanelDeBusquedas;

/**
 *
 * @author Felipe Buitrago
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    JFileChooser file=new JFileChooser();
    public MenuPrincipal() {
        initComponents();     
//        PanelDeBusquedas penelBusqueda = new PanelDeBusquedas();
//        penelBusqueda.llamarPanel(panel7, "medicamento");
          llamarPanel(panel7, "medicamento");
//        PanelDeBusquedas penelBusqueda1 = new PanelDeBusquedas();
//        penelBusqueda1.llamarPanel(panel10, "entidad_8_aves_mamiferos");
          llamarPanel(panel10, "entidad_8_aves_mamiferos");
//        PanelDeBusquedas penelBusqueda2 = new PanelDeBusquedas();
//        penelBusqueda2.llamarPanel(panel12, "constantes_fisiologicas");
          llamarPanel(panel12, "constantes_fisiologicas");
//        PanelDeBusquedas penelBusqueda3 = new PanelDeBusquedas();
//        penelBusqueda3.llamarPanel(panel19, "entidad_1_reptiles_cuelonios");
          llamarPanel(panel15, "entidad_1_reptiles_cuelonios");
//        PanelDeBusquedas penelBusqueda4 = new PanelDeBusquedas();
//        penelBusqueda4.llamarPanel(panel21, "historia_clinica");
          llamarPanel(panel21, "historia_clinica");
          
          llamarPanel(panel29, "diagnostico");
          
          llamarPanel(panel25, "examen_solicitado2");
          
          llamarPanel(panel19, "entidad_13_reptiles_crocodylus");
          
        
          
        ControlSQL control = new ControlSQL();
        control.llenarBox("historia_clinica", "historia_clinica", buscarClinica);
        //tabbedSelector21.setVisible(false);
        N_Registro1.setText(control.SiguienteID("registro"));
        
          
        
    }
    public void llamarPanel(Panel panel, String nombreTabla){
     panel.removeAll();
     PanelDeBusquedas panelBusqueda = new PanelDeBusquedas();
     panelBusqueda.llamarPanel(panel,nombreTabla );     
      panel.repaint();
    }
    
    public <String> ArrayList CapturarCamposRegistro(){
        ArrayList <String> Capturar= new ArrayList<String>();
        Capturar.add((String)N_Registro1.getText());
        Capturar.add((String)fecha(fechaRegistro));
        Capturar.add((String)Responsable_Registro1.getText());
        Capturar.add((String)Clinico_Registro1.getText());
        Capturar.add((String)buscarClinica.getSelectedItem().toString());  // llave foranea 
        return Capturar;
    }
    
    private void borrarCamposRegistro(){
        ControlSQL control = new ControlSQL();        
        N_Registro1.setText(control.SiguienteID("registro"));
        Responsable_Registro1.setText("");
        Clinico_Registro1.setText("");
    }
    private void habilitarDesabilitaCamposRewgistro(boolean bolean){
        buscarClinica.setEnabled(bolean);
        N_Registro1.setEditable(bolean);
        Responsable_Registro1.setEditable(bolean);
        Clinico_Registro1.setEnabled(bolean);
        buttonAction5.setEnabled(bolean);
        buttonAction6.setEnabled(bolean);
        fechaRegistro.setEnabled(bolean);
    }
        public <String> ArrayList CapturarCamposConstantesFisiologicas(){
        ControlSQL control = new ControlSQL();
        ArrayList <String> Capturar= new ArrayList<>();
            Capturar.add((String)control.SiguienteID("constantes_fisiologicas"));
            Capturar.add((String)textField1.getText());
            Capturar.add((String)textField14.getText());
            Capturar.add((String)textField15.getText());
            Capturar.add((String)textField17.getText());
            Capturar.add((String)textField16.getText());  
            Capturar.add((String)textField18.getText());
            Capturar.add((String)N_Registro1.getText()); // llave foranea
        return Capturar;
    }
        
        public <String> ArrayList CapturaCamposReptilesCuelonios(){
        ArrayList<String> Captura = new ArrayList<String>();

        if(jRadioButton79.isSelected()){
            Captura.add((String) "N");
        }
        if(jRadioButton80.isSelected()){
            Captura.add((String)"AN");
        }
        if(jRadioButton81.isSelected()){
            Captura.add((String)"NE");
        }
        if(jRadioButton89.isSelected()){
            Captura.add((String)"N");
        }
        if(jRadioButton90.isSelected()){
            Captura.add((String)"AN");
        }
        if(jRadioButton91.isSelected()){
            Captura.add((String)"NE");
        }
        if(jRadioButton92.isSelected()){
            Captura.add((String)"N");
        }
        if(jRadioButton93.isSelected()){
            Captura.add((String)"AN");
        }
        if(jRadioButton94.isSelected()){
            Captura.add((String)"NE");
        }
        if(jRadioButton95.isSelected()){
            Captura.add((String)"N");
        }
        if(jRadioButton96.isSelected()){
            Captura.add((String)"AN");
        }
        if(jRadioButton97.isSelected()){
            Captura.add((String)"NE");
        }
        if(jRadioButton98.isSelected()){
            Captura.add((String)"N");
        }
        if(jRadioButton99.isSelected()){
            Captura.add((String)"AN");
        }
        if(jRadioButton100.isSelected()){
            Captura.add((String)"NE");
        }
        if(jRadioButton101.isSelected()){
            Captura.add((String)"N");
        }
        if(jRadioButton102.isSelected()){
            Captura.add((String)"AN");
        }
        if(jRadioButton103.isSelected()){
            Captura.add((String)"NE");
        }
        if(jRadioButton104.isSelected()){
            Captura.add((String)"N");
        }
        if(jRadioButton105.isSelected()){
            Captura.add((String)"AN");
        }
        if(jRadioButton106.isSelected()){
            Captura.add((String)"NE");
        }
        if(jRadioButton107.isSelected()){
            Captura.add((String)"N");
        }
        if(jRadioButton108.isSelected()){
            Captura.add((String)"AN");
        }
        if(jRadioButton109.isSelected()){
            Captura.add((String)"NE");
        }
        if(jRadioButton110.isSelected()){
            Captura.add((String)"N");
        }
        if(jRadioButton111.isSelected()){
            Captura.add((String)"AN");
        }
        if(jRadioButton112.isSelected()){
            Captura.add((String)"NE");
        }
        if(jRadioButton113.isSelected()){
            Captura.add((String)"N");
        }
        if(jRadioButton114.isSelected()){
            Captura.add((String)"AN");
        }
        if(jRadioButton115.isSelected()){
            Captura.add((String)"NE");
        }
        if(jRadioButton116.isSelected()){
            Captura.add((String)"N");
        }
        if(jRadioButton117.isSelected()){
            Captura.add((String)"AN");
        }
        if(jRadioButton82.isSelected()){
            Captura.add((String)"NE");
        }
    
        Captura.add((String)N_Registro1.getText() ); // llave foranea .!!!
        

        return Captura;
    }
    public <String> ArrayList CapturaCamposAvesMamiferos(){
        ArrayList<String> Captura = new ArrayList<String>();

        if(jRadioButton1.isSelected()){
            Captura.add((String) "N");
        }
        if(jRadioButton2.isSelected()){
            Captura.add((String)"AN");
        }
        if(jRadioButton3.isSelected()){
            Captura.add((String)"NE");
        }
        if(jRadioButton4.isSelected()){
            Captura.add((String)"N");
        }
        if(jRadioButton5.isSelected()){
            Captura.add((String)"AN");
        }
        if(jRadioButton6.isSelected()){
            Captura.add((String)"NE");
        }
        if(jRadioButton7.isSelected()){
            Captura.add((String)"N");
        }
        if(jRadioButton8.isSelected()){
            Captura.add((String)"AN");
        }
        if(jRadioButton9.isSelected()){
            Captura.add((String)"NE");
        }
        if(jRadioButton10.isSelected()){
            Captura.add((String)"N");
        }
        if(jRadioButton11.isSelected()){
            Captura.add((String)"AN");
        }
        if(jRadioButton12.isSelected()){
            Captura.add((String)"NE");
        }
        if(jRadioButton13.isSelected()){
            Captura.add((String)"N");
        }
        if(jRadioButton14.isSelected()){
            Captura.add((String)"AN");
        }
        if(jRadioButton15.isSelected()){
            Captura.add((String)"NE");
        }
        if(jRadioButton16.isSelected()){
            Captura.add((String)"N");
        }
        if(jRadioButton17.isSelected()){
            Captura.add((String)"AN");
        }
        if(jRadioButton18.isSelected()){
            Captura.add((String)"NE");
        }
        if(jRadioButton19.isSelected()){
            Captura.add((String)"N");
        }
        if(jRadioButton20.isSelected()){
            Captura.add((String)"AN");
        }
        if(jRadioButton21.isSelected()){
            Captura.add((String)"NE");
        }
        if(jRadioButton22.isSelected()){
            Captura.add((String)"N");
        }
        if(jRadioButton23.isSelected()){
            Captura.add((String)"AN");
        }
        if(jRadioButton24.isSelected()){
            Captura.add((String)"NE");
        }
        if(jRadioButton25.isSelected()){
            Captura.add((String)"N");
        }
        if(jRadioButton26.isSelected()){
            Captura.add((String)"AN");
        }
        if(jRadioButton27.isSelected()){
            Captura.add((String)"NE");
        }
        if(jRadioButton28.isSelected()){
            Captura.add((String)"N");
        }
        if(jRadioButton29.isSelected()){
            Captura.add((String)"AN");
        }
        if(jRadioButton30.isSelected()){
            Captura.add((String)"NE");
        }
        if(jRadioButton31.isSelected()){
            Captura.add((String)"N");
        }
        if(jRadioButton32.isSelected()){
            Captura.add((String)"AN");
        }
        if(jRadioButton33.isSelected()){
            Captura.add((String)"NE");
        }
        if(jRadioButton34.isSelected()){
            Captura.add((String)"N");
        }
        if(jRadioButton35.isSelected()){
            Captura.add((String)"AN");
        }
        if(jRadioButton36.isSelected()){
            Captura.add((String)"NE");
        }
        if(jRadioButton37.isSelected()){
            Captura.add((String)"N");
        }
        if(jRadioButton38.isSelected()){
            Captura.add((String)"AN");
        }
        if(jRadioButton39.isSelected()){
            Captura.add((String)"NE");
        }
        
        Captura.add((String)N_Registro1.getText() ); // Variable para validar .!!!
        

        return Captura;
    }
   
    
    
        public <String> ArrayList CapturaCamposHistoraClinica(){
        ArrayList <String> Captura  = new  ArrayList <> ();
        Captura.add((String)fecha(Fecha_De_Ingreso));
        Captura.add((String)Ficha_De_Ingreso.getText());
        Captura.add((String) Especie.getSelectedItem());
        Captura.add((String)Te_Historia_Clinica.getText());
        Captura.add((String)fecha(Fecha_Historia_Clinica));
        Captura.add((String) Nit.getText());
        Captura.add((String)Recinto_N_CTNA.getText());
        Captura.add((String) Recinto_N_EXH.getText());
        Captura.add((String)Nombre_Comun.getText());
        Captura.add((String) Sexo.getSelectedItem());
        Captura.add((String)EDB.getSelectedItem());
        Captura.add((String) fecha(Edad_Aproximada));
        Captura.add((String)Antecedentes.getText());
        return Captura;
    }
        
       public <String> ArrayList CapturaCamposReptilesCrocodylus(){
        ArrayList<String> Captura = new ArrayList<String>();

        if(jRadioButton40.isSelected()){
            Captura.add((String) "N");
        }
        if(jRadioButton41.isSelected()){
            Captura.add((String)"AN");
        }
        if(jRadioButton42.isSelected()){
            Captura.add((String)"NE");
        }
        if(jRadioButton50.isSelected()){
            Captura.add((String)"N");
        }
        if(jRadioButton51.isSelected()){
            Captura.add((String)"AN");
        }
        if(jRadioButton52.isSelected()){
            Captura.add((String)"NE");
        }
        if(jRadioButton53.isSelected()){
            Captura.add((String)"N");
        }
        if(jRadioButton54.isSelected()){
            Captura.add((String)"AN");
        }
        if(jRadioButton55.isSelected()){
            Captura.add((String)"NE");
        }
        if(jRadioButton56.isSelected()){
            Captura.add((String)"N");
        }
        if(jRadioButton57.isSelected()){
            Captura.add((String)"AN");
        }
        if(jRadioButton58.isSelected()){
            Captura.add((String)"NE");
        }
        if(jRadioButton59.isSelected()){
            Captura.add((String)"N");
        }
        if(jRadioButton60.isSelected()){
            Captura.add((String)"AN");
        }
        if(jRadioButton61.isSelected()){
            Captura.add((String)"NE");
        }
        if(jRadioButton62.isSelected()){
            Captura.add((String)"N");
        }
        if(jRadioButton63.isSelected()){
            Captura.add((String)"AN");
        }
        if(jRadioButton64.isSelected()){
            Captura.add((String)"NE");
        }
        if(jRadioButton65.isSelected()){
            Captura.add((String)"N");
        }
        if(jRadioButton66.isSelected()){
            Captura.add((String)"AN");
        }
        if(jRadioButton67.isSelected()){
            Captura.add((String)"NE");
        }
        if(jRadioButton68.isSelected()){
            Captura.add((String)"N");
        }
        if(jRadioButton69.isSelected()){
            Captura.add((String)"AN");
        }
        if(jRadioButton70.isSelected()){
            Captura.add((String)"NE");
        }
        if(jRadioButton71.isSelected()){
            Captura.add((String)"N");
        }
        if(jRadioButton72.isSelected()){
            Captura.add((String)"AN");
        }
        if(jRadioButton73.isSelected()){
            Captura.add((String)"NE");
        }
        if(jRadioButton74.isSelected()){
            Captura.add((String)"N");
        }
        if(jRadioButton75.isSelected()){
            Captura.add((String)"AN");
        }
        if(jRadioButton76.isSelected()){
            Captura.add((String)"NE");
        }
        if(jRadioButton77.isSelected()){
            Captura.add((String)"N");
        }
        if(jRadioButton78.isSelected()){
            Captura.add((String)"AN");
        }
        if(jRadioButton43.isSelected()){
            Captura.add((String)"NE");
        }
        if(jRadioButton44.isSelected()){
            Captura.add((String)"N");
        }
        if(jRadioButton45.isSelected()){
            Captura.add((String)"AN");
        }
        if(jRadioButton46.isSelected()){
            Captura.add((String)"NE");
        }
        if(jRadioButton47.isSelected()){
            Captura.add((String)"N");
        }
        if(jRadioButton48.isSelected()){
            Captura.add((String)"AN");
        }
        if(jRadioButton49.isSelected()){
            Captura.add((String)"NE");
        }
        
        Captura.add((String)N_Registro1.getText() ); // llave foranea .!!!
        

        return Captura;
    }
        
        public <String> ArrayList CapturaCamposExamenesSolicitados(){
        ArrayList<String> Captura = new ArrayList<>();
       
        if(jCheckBox1.isSelected()){
            Captura.add((String) "Biometria Hepatica");
        }
        if(jCheckBox4.isSelected()){
            Captura.add((String)"Perfil Hepatico");
        }
        if(jCheckBox6.isSelected()){
            Captura.add((String)"Perfil Renal");
        }
        if(jCheckBox5.isSelected()){
            Captura.add((String)"Hormonas");
        }
        if(jCheckBox14.isSelected()){
            Captura.add((String)"Cropologico");
        }
        if(jCheckBox13.isSelected()){
            Captura.add((String)"Coprocultivo");
        }
        if(jCheckBox16.isSelected()){
            Captura.add((String)"Hemoparasitos");
        }
        if(jCheckBox15.isSelected()){
            Captura.add((String)"Uroanalisis");
        }
        if(jCheckBox12.isSelected()){
            Captura.add((String)"Rx-Ecografia");
        }
        if(jCheckBox7.isSelected()){
            Captura.add((String)"Ecografia");
        }
        if(jCheckBox3.isSelected()){
            Captura.add((String)"Cultivo Bacteriano");
        }
        if(jCheckBox2.isSelected()){
            Captura.add((String)"Parasitologia");
        }
        if(jCheckBox8.isSelected()){
            Captura.add((String)"Cultivo Micotico");
        }
        if(jCheckBox9.isSelected()){
            Captura.add((String)"Citologia");
        }
        if(jCheckBox11.isSelected()){
            Captura.add((String)"Otros");
        }
        
        return Captura;
}
        public String fecha(JDateChooser x){
        String fecha;
        int dia,mes,año;
        dia=x.getCalendar().get(Calendar.DAY_OF_MONTH);
        mes=x.getCalendar().get(Calendar.MONTH)+1;
        año=x.getCalendar().get(Calendar.YEAR);
        fecha=String.valueOf(año)+"-"+String.valueOf(mes)+"-"+ String.valueOf(dia);
        return fecha;
    }
        
         public <String> ArrayList CapturaCamposDiagnosticos(){
        ControlSQL control = new ControlSQL();
        ArrayList <String> Captura  = new  ArrayList <> ();
        Captura.add((String)control.SiguienteID("diagnostico"));// metodo de nuemro consecutivo
        Captura.add((String) Observaciones_Diagnosticos.getText());
        Captura.add((String)Presuntivo_Diagnosticos.getText());
		Captura.add((String)Diferencial_Diagnosticos.getText());
		Captura.add((String)Pronostico_Diagnosticos.getText());
		Captura.add((String)N_Registro1.getText());//llave foranea
        
        return Captura;
    }   
         
    public boolean aceptar(JPanel panel,JLabel ImagenAnimal,String nombreTabla,ArrayList<String> contenidoCampos ){
PanelDeBusquedas  panelBusqueda = new PanelDeBusquedas ();
       ControlSQL controlSql = new ControlSQL();
      
      boolean guardoExitoso = controlSql.InsertarDatos(contenidoCampos,nombreTabla);  
      if(guardoExitoso){  
          if(panel!=null){
       panel.removeAll();     
       panelBusqueda.llamarPanel((Panel) panel,nombreTabla);
          }
      file = new JFileChooser();
      if(ImagenAnimal != null){
      ImagenAnimal.setIcon(null);
      }
      //.........................................................................LLamar el panel Nuevo registro
      file=null;
      return true;
      }else{System.out.println("Se ha producido un error al guardar");
                return false;}
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        estadoGeneral = new javax.swing.ButtonGroup();
        tegumento = new javax.swing.ButtonGroup();
        muscosas = new javax.swing.ButtonGroup();
        tractoGastroIntestinal = new javax.swing.ButtonGroup();
        sistemaLinfatico = new javax.swing.ButtonGroup();
        sistemaCardiopulmunar = new javax.swing.ButtonGroup();
        sistemaMuscular = new javax.swing.ButtonGroup();
        sistemaOseo = new javax.swing.ButtonGroup();
        sistemaUrogenital = new javax.swing.ButtonGroup();
        organosDeLosSentidos = new javax.swing.ButtonGroup();
        sistemaNervioso = new javax.swing.ButtonGroup();
        comportamiento = new javax.swing.ButtonGroup();
        hidratacion = new javax.swing.ButtonGroup();
        estadoGeneralCu = new javax.swing.ButtonGroup();
        cabezaCu = new javax.swing.ButtonGroup();
        piscoCu = new javax.swing.ButtonGroup();
        plastronCu = new javax.swing.ButtonGroup();
        caparazonCu = new javax.swing.ButtonGroup();
        sistemaMuscularCu = new javax.swing.ButtonGroup();
        sistemaOseoCu = new javax.swing.ButtonGroup();
        organosDeLosSentidosCu = new javax.swing.ButtonGroup();
        sistemaUrogenitalCu = new javax.swing.ButtonGroup();
        sistemaCardioPulmunarCu = new javax.swing.ButtonGroup();
        hidratacionCu = new javax.swing.ButtonGroup();
        estadoGeneralCr = new javax.swing.ButtonGroup();
        cabezaCr = new javax.swing.ButtonGroup();
        maxilaresCr = new javax.swing.ButtonGroup();
        bocaCr = new javax.swing.ButtonGroup();
        cuelloCr = new javax.swing.ButtonGroup();
        regionDorsalCr = new javax.swing.ButtonGroup();
        regionCaudalCr = new javax.swing.ButtonGroup();
        sistemaMuscularCr = new javax.swing.ButtonGroup();
        sistemaOseoCr = new javax.swing.ButtonGroup();
        organosDeLosSentidosCR = new javax.swing.ButtonGroup();
        sistemaUrogenitalCr = new javax.swing.ButtonGroup();
        sistemaCardiopulmunarCr = new javax.swing.ButtonGroup();
        hidratacionCr = new javax.swing.ButtonGroup();
        chekChip = new javax.swing.JCheckBox();
        tabbedPaneRound1 = new org.edisoncor.gui.tabbedPane.TabbedPaneRound();
        panel3 = new org.edisoncor.gui.panel.Panel();
        tabbedSelector22 = new org.edisoncor.gui.tabbedPane.TabbedSelector2();
        panel21 = new org.edisoncor.gui.panel.Panel();
        panel22 = new org.edisoncor.gui.panel.Panel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Historia_Clinica = new org.edisoncor.gui.panel.Panel();
        labelCustom2 = new org.edisoncor.gui.label.LabelCustom();
        labelCustom16 = new org.edisoncor.gui.label.LabelCustom();
        jScrollPane3 = new javax.swing.JScrollPane();
        Antecedentes = new javax.swing.JTextArea();
        panel23 = new org.edisoncor.gui.panel.Panel();
        labelCustom15 = new org.edisoncor.gui.label.LabelCustom();
        Chip = new javax.swing.JCheckBox();
        Areta = new javax.swing.JCheckBox();
        Corte = new javax.swing.JCheckBox();
        Te_Chip = new org.edisoncor.gui.textField.TextField();
        Te_Areta = new org.edisoncor.gui.textField.TextField();
        Te_Corte = new org.edisoncor.gui.textField.TextField();
        Tatoo = new javax.swing.JCheckBox();
        Te_Tatoo = new org.edisoncor.gui.textField.TextField();
        Placa = new javax.swing.JCheckBox();
        Te_Placa = new org.edisoncor.gui.textField.TextField();
        marca = new javax.swing.JCheckBox();
        Te_Marca = new org.edisoncor.gui.textField.TextField();
        Tatoo1 = new javax.swing.JCheckBox();
        Te_Tatoo1 = new org.edisoncor.gui.textField.TextField();
        Tatoo2 = new javax.swing.JCheckBox();
        Te_Tatoo2 = new org.edisoncor.gui.textField.TextField();
        panel24 = new org.edisoncor.gui.panel.Panel();
        labelCustom1 = new org.edisoncor.gui.label.LabelCustom();
        Fecha_De_Ingreso = new com.toedter.calendar.JDateChooser();
        labelCustom4 = new org.edisoncor.gui.label.LabelCustom();
        jLabel1 = new javax.swing.JLabel();
        Origen = new javax.swing.JComboBox();
        labelCustom5 = new org.edisoncor.gui.label.LabelCustom();
        Ficha_De_Ingreso = new org.edisoncor.gui.textField.TextField();
        labelCustom6 = new org.edisoncor.gui.label.LabelCustom();
        Fecha_Historia_Clinica = new com.toedter.calendar.JDateChooser();
        labelCustom7 = new org.edisoncor.gui.label.LabelCustom();
        Te_Historia_Clinica = new org.edisoncor.gui.textField.TextField();
        labelCustom8 = new org.edisoncor.gui.label.LabelCustom();
        Nit = new org.edisoncor.gui.textField.TextField();
        labelCustom11 = new org.edisoncor.gui.label.LabelCustom();
        Sexo = new javax.swing.JComboBox();
        labelCustom13 = new org.edisoncor.gui.label.LabelCustom();
        EDB = new javax.swing.JComboBox();
        labelCustom10 = new org.edisoncor.gui.label.LabelCustom();
        Recinto_N_EXH = new org.edisoncor.gui.textField.TextField();
        labelCustom12 = new org.edisoncor.gui.label.LabelCustom();
        Nombre_Comun = new org.edisoncor.gui.textField.TextField();
        labelCustom14 = new org.edisoncor.gui.label.LabelCustom();
        Especie = new javax.swing.JComboBox();
        Recinto_N_EXH1 = new org.edisoncor.gui.textField.TextField();
        buttonAction4 = new org.edisoncor.gui.button.ButtonAction();
        panel2 = new org.edisoncor.gui.panel.Panel();
        tabbedSelector21 = new org.edisoncor.gui.tabbedPane.TabbedSelector2();
        panel1 = new org.edisoncor.gui.panel.Panel();
        panel5 = new org.edisoncor.gui.panel.Panel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox11 = new javax.swing.JCheckBox();
        jCheckBox12 = new javax.swing.JCheckBox();
        jCheckBox13 = new javax.swing.JCheckBox();
        jCheckBox14 = new javax.swing.JCheckBox();
        jCheckBox15 = new javax.swing.JCheckBox();
        jCheckBox16 = new javax.swing.JCheckBox();
        jLabel55 = new javax.swing.JLabel();
        buttonAction10 = new org.edisoncor.gui.button.ButtonAction();
        panel25 = new org.edisoncor.gui.panel.Panel();
        panel8 = new org.edisoncor.gui.panel.Panel();
        Aves_Mamiferos = new org.edisoncor.gui.panel.Panel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        panel9 = new org.edisoncor.gui.panel.Panel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton33 = new javax.swing.JRadioButton();
        jRadioButton34 = new javax.swing.JRadioButton();
        jRadioButton35 = new javax.swing.JRadioButton();
        jRadioButton36 = new javax.swing.JRadioButton();
        jRadioButton37 = new javax.swing.JRadioButton();
        jRadioButton38 = new javax.swing.JRadioButton();
        jRadioButton39 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jRadioButton13 = new javax.swing.JRadioButton();
        jRadioButton14 = new javax.swing.JRadioButton();
        jRadioButton15 = new javax.swing.JRadioButton();
        jRadioButton16 = new javax.swing.JRadioButton();
        jRadioButton17 = new javax.swing.JRadioButton();
        jRadioButton18 = new javax.swing.JRadioButton();
        jRadioButton19 = new javax.swing.JRadioButton();
        jRadioButton20 = new javax.swing.JRadioButton();
        jRadioButton21 = new javax.swing.JRadioButton();
        jRadioButton22 = new javax.swing.JRadioButton();
        jRadioButton23 = new javax.swing.JRadioButton();
        jRadioButton24 = new javax.swing.JRadioButton();
        jRadioButton25 = new javax.swing.JRadioButton();
        jRadioButton26 = new javax.swing.JRadioButton();
        jRadioButton27 = new javax.swing.JRadioButton();
        jRadioButton28 = new javax.swing.JRadioButton();
        jRadioButton29 = new javax.swing.JRadioButton();
        jRadioButton30 = new javax.swing.JRadioButton();
        jRadioButton31 = new javax.swing.JRadioButton();
        jRadioButton32 = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        buttonAction1 = new org.edisoncor.gui.button.ButtonAction();
        panel10 = new org.edisoncor.gui.panel.Panel();
        panel11 = new org.edisoncor.gui.panel.Panel();
        Constantes_Fisiologicas = new org.edisoncor.gui.panel.Panel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        textField1 = new org.edisoncor.gui.textField.TextField();
        textField14 = new org.edisoncor.gui.textField.TextField();
        textField15 = new org.edisoncor.gui.textField.TextField();
        textField16 = new org.edisoncor.gui.textField.TextField();
        textField17 = new org.edisoncor.gui.textField.TextField();
        textField18 = new org.edisoncor.gui.textField.TextField();
        buttonAction11 = new org.edisoncor.gui.button.ButtonAction();
        jLabel60 = new javax.swing.JLabel();
        textField19 = new org.edisoncor.gui.textField.TextField();
        jLabel61 = new javax.swing.JLabel();
        textField20 = new org.edisoncor.gui.textField.TextField();
        jLabel67 = new javax.swing.JLabel();
        textField21 = new org.edisoncor.gui.textField.TextField();
        panel12 = new org.edisoncor.gui.panel.Panel();
        panel27 = new org.edisoncor.gui.panel.Panel();
        panel28 = new org.edisoncor.gui.panel.Panel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        buttonAction12 = new org.edisoncor.gui.button.ButtonAction();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        panel29 = new org.edisoncor.gui.panel.Panel();
        panel16 = new org.edisoncor.gui.panel.Panel();
        entidad_5 = new org.edisoncor.gui.panel.Panel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jCheckBox17 = new javax.swing.JCheckBox();
        jCheckBox18 = new javax.swing.JCheckBox();
        jCheckBox19 = new javax.swing.JCheckBox();
        jCheckBox20 = new javax.swing.JCheckBox();
        jCheckBox21 = new javax.swing.JCheckBox();
        jTextField1 = new javax.swing.JTextField();
        jCheckBox22 = new javax.swing.JCheckBox();
        jCheckBox23 = new javax.swing.JCheckBox();
        jTextField2 = new javax.swing.JTextField();
        panel33 = new org.edisoncor.gui.panel.Panel();
        panel17 = new org.edisoncor.gui.panel.Panel();
        entidad_6 = new org.edisoncor.gui.panel.Panel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        panel34 = new org.edisoncor.gui.panel.Panel();
        panel18 = new org.edisoncor.gui.panel.Panel();
        entidad_7 = new org.edisoncor.gui.panel.Panel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        panel35 = new org.edisoncor.gui.panel.Panel();
        panel13 = new org.edisoncor.gui.panel.Panel();
        valoracion_nutricional = new org.edisoncor.gui.panel.Panel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        panel14 = new org.edisoncor.gui.panel.Panel();
        jRadioButton40 = new javax.swing.JRadioButton();
        jRadioButton41 = new javax.swing.JRadioButton();
        jRadioButton42 = new javax.swing.JRadioButton();
        jRadioButton43 = new javax.swing.JRadioButton();
        jRadioButton44 = new javax.swing.JRadioButton();
        jRadioButton45 = new javax.swing.JRadioButton();
        jRadioButton46 = new javax.swing.JRadioButton();
        jRadioButton47 = new javax.swing.JRadioButton();
        jRadioButton48 = new javax.swing.JRadioButton();
        jRadioButton49 = new javax.swing.JRadioButton();
        jRadioButton50 = new javax.swing.JRadioButton();
        jRadioButton51 = new javax.swing.JRadioButton();
        jRadioButton52 = new javax.swing.JRadioButton();
        jRadioButton53 = new javax.swing.JRadioButton();
        jRadioButton54 = new javax.swing.JRadioButton();
        jRadioButton55 = new javax.swing.JRadioButton();
        jRadioButton56 = new javax.swing.JRadioButton();
        jRadioButton57 = new javax.swing.JRadioButton();
        jRadioButton58 = new javax.swing.JRadioButton();
        jRadioButton59 = new javax.swing.JRadioButton();
        jRadioButton60 = new javax.swing.JRadioButton();
        jRadioButton61 = new javax.swing.JRadioButton();
        jRadioButton62 = new javax.swing.JRadioButton();
        jRadioButton63 = new javax.swing.JRadioButton();
        jRadioButton64 = new javax.swing.JRadioButton();
        jRadioButton65 = new javax.swing.JRadioButton();
        jRadioButton66 = new javax.swing.JRadioButton();
        jRadioButton67 = new javax.swing.JRadioButton();
        jRadioButton68 = new javax.swing.JRadioButton();
        jRadioButton69 = new javax.swing.JRadioButton();
        jRadioButton70 = new javax.swing.JRadioButton();
        jRadioButton71 = new javax.swing.JRadioButton();
        jRadioButton72 = new javax.swing.JRadioButton();
        jRadioButton73 = new javax.swing.JRadioButton();
        jRadioButton74 = new javax.swing.JRadioButton();
        jRadioButton75 = new javax.swing.JRadioButton();
        jRadioButton76 = new javax.swing.JRadioButton();
        jRadioButton77 = new javax.swing.JRadioButton();
        jRadioButton78 = new javax.swing.JRadioButton();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        buttonAction2 = new org.edisoncor.gui.button.ButtonAction();
        jLabel34 = new javax.swing.JLabel();
        jRadioButton79 = new javax.swing.JRadioButton();
        jRadioButton80 = new javax.swing.JRadioButton();
        jRadioButton81 = new javax.swing.JRadioButton();
        jRadioButton82 = new javax.swing.JRadioButton();
        jRadioButton83 = new javax.swing.JRadioButton();
        jRadioButton84 = new javax.swing.JRadioButton();
        jRadioButton85 = new javax.swing.JRadioButton();
        jRadioButton86 = new javax.swing.JRadioButton();
        jRadioButton87 = new javax.swing.JRadioButton();
        jRadioButton88 = new javax.swing.JRadioButton();
        jRadioButton89 = new javax.swing.JRadioButton();
        jRadioButton90 = new javax.swing.JRadioButton();
        jRadioButton91 = new javax.swing.JRadioButton();
        panel15 = new org.edisoncor.gui.panel.Panel();
        panel26 = new org.edisoncor.gui.panel.Panel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        Responsable_Registro1 = new org.edisoncor.gui.textField.TextField();
        buscarClinica = new javax.swing.JComboBox();
        jLabel66 = new javax.swing.JLabel();
        buttonAction5 = new org.edisoncor.gui.button.ButtonAction();
        buttonAction6 = new org.edisoncor.gui.button.ButtonAction();
        fechaRegistro = new com.toedter.calendar.JDateChooser();
        buttonAction7 = new org.edisoncor.gui.button.ButtonAction();

        chekChip.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabbedPaneRound1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabbedPaneRound1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel21Layout = new javax.swing.GroupLayout(panel21);
        panel21.setLayout(panel21Layout);
        panel21Layout.setHorizontalGroup(
            panel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1218, Short.MAX_VALUE)
        );
        panel21Layout.setVerticalGroup(
            panel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 574, Short.MAX_VALUE)
        );

        tabbedSelector22.addTab("Listado de Historias", panel21);

        labelCustom2.setBackground(new java.awt.Color(0, 0, 51));
        labelCustom2.setText("HISTORIA CLINICA");

        labelCustom16.setBackground(new java.awt.Color(0, 0, 51));
        labelCustom16.setText("Antecedentes :");

        Antecedentes.setColumns(20);
        Antecedentes.setRows(5);
        jScrollPane3.setViewportView(Antecedentes);

        labelCustom15.setBackground(new java.awt.Color(0, 0, 51));
        labelCustom15.setText("Marcaje :");

        Chip.setBackground(new java.awt.Color(0, 0, 0));
        Chip.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Chip.setForeground(new java.awt.Color(255, 255, 255));
        Chip.setText("Chip");
        Chip.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChipMouseClicked(evt);
            }
        });

        Areta.setBackground(new java.awt.Color(0, 0, 0));
        Areta.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Areta.setForeground(new java.awt.Color(255, 255, 255));
        Areta.setText("Areta");
        Areta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AretaMouseClicked(evt);
            }
        });

        Corte.setBackground(new java.awt.Color(0, 0, 0));
        Corte.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Corte.setForeground(new java.awt.Color(255, 255, 255));
        Corte.setText("Corte");
        Corte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CorteMouseClicked(evt);
            }
        });

        Te_Chip.setEnabled(false);

        Te_Areta.setEnabled(false);

        Te_Corte.setEnabled(false);

        Tatoo.setBackground(new java.awt.Color(0, 0, 0));
        Tatoo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Tatoo.setForeground(new java.awt.Color(255, 255, 255));
        Tatoo.setText("Tatoo");
        Tatoo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TatooMouseClicked(evt);
            }
        });

        Te_Tatoo.setEnabled(false);

        Placa.setBackground(new java.awt.Color(0, 0, 0));
        Placa.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Placa.setForeground(new java.awt.Color(255, 255, 255));
        Placa.setText("Placa");
        Placa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PlacaMouseClicked(evt);
            }
        });

        Te_Placa.setEnabled(false);

        marca.setBackground(new java.awt.Color(0, 0, 0));
        marca.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        marca.setForeground(new java.awt.Color(255, 255, 255));
        marca.setText("Marca");
        marca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                marcaMouseClicked(evt);
            }
        });

        Te_Marca.setEnabled(false);

        Tatoo1.setBackground(new java.awt.Color(0, 0, 0));
        Tatoo1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Tatoo1.setForeground(new java.awt.Color(255, 255, 255));
        Tatoo1.setText("Anillo");
        Tatoo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tatoo1MouseClicked(evt);
            }
        });

        Te_Tatoo1.setEnabled(false);

        Tatoo2.setBackground(new java.awt.Color(0, 0, 0));
        Tatoo2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Tatoo2.setForeground(new java.awt.Color(255, 255, 255));
        Tatoo2.setText("Otro");
        Tatoo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tatoo2MouseClicked(evt);
            }
        });

        Te_Tatoo2.setEnabled(false);

        javax.swing.GroupLayout panel23Layout = new javax.swing.GroupLayout(panel23);
        panel23.setLayout(panel23Layout);
        panel23Layout.setHorizontalGroup(
            panel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelCustom15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel23Layout.createSequentialGroup()
                        .addComponent(Corte)
                        .addGap(18, 18, 18)
                        .addComponent(Te_Corte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panel23Layout.createSequentialGroup()
                        .addGroup(panel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Areta)
                            .addComponent(Chip))
                        .addGap(18, 18, 18)
                        .addGroup(panel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Te_Chip, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Te_Areta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(49, 49, 49)
                .addGroup(panel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Tatoo)
                    .addGroup(panel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(marca)
                        .addComponent(Placa)))
                .addGap(18, 18, 18)
                .addGroup(panel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Te_Marca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Te_Placa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Te_Tatoo, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(panel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel23Layout.createSequentialGroup()
                        .addComponent(Tatoo1)
                        .addGap(18, 18, 18)
                        .addComponent(Te_Tatoo1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel23Layout.createSequentialGroup()
                        .addComponent(Tatoo2)
                        .addGap(18, 18, 18)
                        .addComponent(Te_Tatoo2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel23Layout.setVerticalGroup(
            panel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Tatoo1)
                        .addComponent(Te_Tatoo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelCustom15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Chip)
                        .addComponent(Te_Chip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Tatoo)
                        .addComponent(Te_Tatoo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Tatoo2)
                        .addComponent(Te_Tatoo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Areta)
                        .addComponent(Te_Areta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Placa)
                        .addComponent(Te_Placa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Corte)
                    .addComponent(Te_Corte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(marca)
                    .addComponent(Te_Marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        labelCustom1.setBackground(new java.awt.Color(0, 0, 51));
        labelCustom1.setText("Fecha De Ingreso:");

        labelCustom4.setBackground(new java.awt.Color(0, 0, 51));
        labelCustom4.setText("Clase:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Origen :");

        Origen.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nacimiento", "Cav", "Intercambio", "Abandono" }));
        Origen.setPreferredSize(new java.awt.Dimension(81, 20));

        labelCustom5.setBackground(new java.awt.Color(0, 0, 51));
        labelCustom5.setText("Ficha De Ingreso:");

        labelCustom6.setBackground(new java.awt.Color(0, 0, 51));
        labelCustom6.setText("Fecha Historia Clinica:");

        labelCustom7.setBackground(new java.awt.Color(0, 0, 51));
        labelCustom7.setText("Historia Clinica:");

        Te_Historia_Clinica.setPreferredSize(new java.awt.Dimension(81, 20));

        labelCustom8.setBackground(new java.awt.Color(0, 0, 51));
        labelCustom8.setText("Nit/Chip :");

        Nit.setPreferredSize(new java.awt.Dimension(81, 20));

        labelCustom11.setBackground(new java.awt.Color(0, 0, 51));
        labelCustom11.setText("Sexo:");

        Sexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Macho", "Hembra", "Indeterminado" }));
        Sexo.setPreferredSize(new java.awt.Dimension(81, 20));

        labelCustom13.setBackground(new java.awt.Color(0, 0, 51));
        labelCustom13.setText("EDB :");

        EDB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Neonato", "Juvenil", "Sub Adulto", "Adulto", "Geriatrico" }));
        EDB.setPreferredSize(new java.awt.Dimension(81, 20));

        labelCustom10.setBackground(new java.awt.Color(0, 0, 51));
        labelCustom10.setText("Recinto:");

        Recinto_N_EXH.setPreferredSize(new java.awt.Dimension(81, 20));
        Recinto_N_EXH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Recinto_N_EXHActionPerformed(evt);
            }
        });

        labelCustom12.setBackground(new java.awt.Color(0, 0, 51));
        labelCustom12.setText("Nombre Comun:");

        Nombre_Comun.setPreferredSize(new java.awt.Dimension(81, 20));

        labelCustom14.setBackground(new java.awt.Color(0, 0, 51));
        labelCustom14.setText("Edad Aproximada :");

        Especie.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Anfibios", "Aves", "Mamiferos", "Reptiles Crocodylus", "Reptiles Quelonios" }));

        Recinto_N_EXH1.setPreferredSize(new java.awt.Dimension(81, 20));
        Recinto_N_EXH1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Recinto_N_EXH1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel24Layout = new javax.swing.GroupLayout(panel24);
        panel24.setLayout(panel24Layout);
        panel24Layout.setHorizontalGroup(
            panel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel24Layout.createSequentialGroup()
                        .addComponent(labelCustom14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Recinto_N_EXH1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel24Layout.createSequentialGroup()
                        .addComponent(labelCustom8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Nit, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel24Layout.createSequentialGroup()
                        .addComponent(labelCustom7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Te_Historia_Clinica, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel24Layout.createSequentialGroup()
                        .addComponent(labelCustom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Fecha_De_Ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel24Layout.createSequentialGroup()
                        .addGroup(panel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(labelCustom4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Origen, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Especie, 0, 160, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel24Layout.createSequentialGroup()
                        .addComponent(labelCustom10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Recinto_N_EXH, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44)
                .addGroup(panel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel24Layout.createSequentialGroup()
                        .addComponent(labelCustom5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Ficha_De_Ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel24Layout.createSequentialGroup()
                        .addComponent(labelCustom12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Nombre_Comun, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel24Layout.createSequentialGroup()
                        .addComponent(labelCustom13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(EDB, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel24Layout.createSequentialGroup()
                        .addComponent(labelCustom11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel24Layout.createSequentialGroup()
                        .addComponent(labelCustom6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Fecha_Historia_Clinica, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(485, Short.MAX_VALUE))
        );
        panel24Layout.setVerticalGroup(
            panel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel24Layout.createSequentialGroup()
                        .addGroup(panel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Fecha_De_Ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelCustom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ficha_De_Ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelCustom5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(labelCustom4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelCustom6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Especie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Fecha_Historia_Clinica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(Origen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelCustom7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Te_Historia_Clinica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelCustom8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Nit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel24Layout.createSequentialGroup()
                        .addGroup(panel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelCustom11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelCustom13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EDB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelCustom12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Nombre_Comun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)))
                .addGroup(panel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCustom10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Recinto_N_EXH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(panel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCustom14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Recinto_N_EXH1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        buttonAction4.setText("Guardar");
        buttonAction4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAction4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Historia_ClinicaLayout = new javax.swing.GroupLayout(Historia_Clinica);
        Historia_Clinica.setLayout(Historia_ClinicaLayout);
        Historia_ClinicaLayout.setHorizontalGroup(
            Historia_ClinicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Historia_ClinicaLayout.createSequentialGroup()
                .addGroup(Historia_ClinicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Historia_ClinicaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Historia_ClinicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(Historia_ClinicaLayout.createSequentialGroup()
                        .addGroup(Historia_ClinicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Historia_ClinicaLayout.createSequentialGroup()
                                .addGap(337, 337, 337)
                                .addComponent(labelCustom2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Historia_ClinicaLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(labelCustom16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(270, 728, Short.MAX_VALUE))
                    .addGroup(Historia_ClinicaLayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(Historia_ClinicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(buttonAction4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Historia_ClinicaLayout.setVerticalGroup(
            Historia_ClinicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Historia_ClinicaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelCustom2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(panel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(labelCustom16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(buttonAction4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        jScrollPane1.setViewportView(Historia_Clinica);

        javax.swing.GroupLayout panel22Layout = new javax.swing.GroupLayout(panel22);
        panel22.setLayout(panel22Layout);
        panel22Layout.setHorizontalGroup(
            panel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1218, Short.MAX_VALUE)
        );
        panel22Layout.setVerticalGroup(
            panel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)
        );

        tabbedSelector22.addTab("Nueva Historia", panel22);

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedSelector22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedSelector22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tabbedPaneRound1.addTab("Historias", panel3);

        panel2.setColorPrimario(new java.awt.Color(255, 255, 255));
        panel2.setColorSecundario(new java.awt.Color(204, 204, 204));
        panel2.setPreferredSize(new java.awt.Dimension(1000, 586));

        tabbedSelector21.setBackground(new java.awt.Color(255, 255, 255));
        tabbedSelector21.setForeground(new java.awt.Color(0, 0, 0));
        tabbedSelector21.setColorBackGround(new java.awt.Color(255, 255, 255));
        tabbedSelector21.setColorDeBorde(new java.awt.Color(228, 228, 228));
        tabbedSelector21.setColorDeSegundoBorde(new java.awt.Color(0, 0, 0));
        tabbedSelector21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tabbedSelector21.setSelectionColor(new java.awt.Color(0, 0, 0));
        tabbedSelector21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabbedSelector21MouseClicked(evt);
            }
        });

        panel1.setColorPrimario(new java.awt.Color(255, 255, 255));
        panel1.setColorSecundario(new java.awt.Color(255, 255, 255));

        panel5.setColorPrimario(new java.awt.Color(255, 255, 255));
        panel5.setColorSecundario(new java.awt.Color(204, 204, 204));

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox1.setText("Biometria Hematica");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox2.setText("Parasitologia");

        jCheckBox3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox3.setText("Cultivo Bacteriano");

        jCheckBox4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox4.setText("Perfil Hepatico");

        jCheckBox5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox5.setText("Hormonas");

        jCheckBox6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox6.setText("Perfil Renal");

        jCheckBox7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox7.setText("Ecografia");
        jCheckBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox7ActionPerformed(evt);
            }
        });

        jCheckBox8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox8.setText("Cultivo Micotico");

        jCheckBox9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox9.setText("Citologia");

        jCheckBox11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox11.setText("Otros");

        jCheckBox12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox12.setText("Rx-Ecografia");
        jCheckBox12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox12ActionPerformed(evt);
            }
        });

        jCheckBox13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox13.setText("Coprocultivo");

        jCheckBox14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox14.setText("Coprologico");

        jCheckBox15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox15.setText("Uroanalis");

        jCheckBox16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox16.setText("Hemoparasitos");

        jLabel55.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel55.setText("Examenes Solicitados");

        buttonAction10.setText("Registrar");
        buttonAction10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAction10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel5Layout = new javax.swing.GroupLayout(panel5);
        panel5.setLayout(panel5Layout);
        panel5Layout.setHorizontalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel5Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel55)
                .addContainerGap(93, Short.MAX_VALUE))
            .addGroup(panel5Layout.createSequentialGroup()
                .addContainerGap(201, Short.MAX_VALUE)
                .addComponent(buttonAction10, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel5Layout.createSequentialGroup()
                .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox4)
                    .addComponent(jCheckBox5)
                    .addComponent(jCheckBox14)
                    .addComponent(jCheckBox13)
                    .addComponent(jCheckBox15)
                    .addComponent(jCheckBox16)
                    .addComponent(jCheckBox6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox9)
                    .addComponent(jCheckBox8)
                    .addComponent(jCheckBox11)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox7)
                    .addComponent(jCheckBox3)
                    .addComponent(jCheckBox12)))
        );
        panel5Layout.setVerticalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel5Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel55)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox12))
                .addGap(28, 28, 28)
                .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox4)
                    .addComponent(jCheckBox7))
                .addGap(39, 39, 39)
                .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox6)
                    .addComponent(jCheckBox3))
                .addGap(38, 38, 38)
                .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox5)
                    .addComponent(jCheckBox2))
                .addGap(33, 33, 33)
                .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox14)
                    .addComponent(jCheckBox8))
                .addGap(30, 30, 30)
                .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox13)
                    .addComponent(jCheckBox9))
                .addGap(37, 37, 37)
                .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox16)
                    .addComponent(jCheckBox11))
                .addGap(30, 30, 30)
                .addComponent(jCheckBox15)
                .addGap(18, 18, 18)
                .addComponent(buttonAction10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panel25.setColorPrimario(new java.awt.Color(255, 255, 255));
        panel25.setColorSecundario(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout panel25Layout = new javax.swing.GroupLayout(panel25);
        panel25.setLayout(panel25Layout);
        panel25Layout.setHorizontalGroup(
            panel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 606, Short.MAX_VALUE)
        );
        panel25Layout.setVerticalGroup(
            panel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(panel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tabbedSelector21.addTab(" Examenes", panel1);

        panel8.setColorPrimario(new java.awt.Color(255, 255, 255));
        panel8.setColorSecundario(new java.awt.Color(255, 255, 255));

        Aves_Mamiferos.setColorPrimario(new java.awt.Color(255, 255, 255));
        Aves_Mamiferos.setColorSecundario(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Estado General:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Hidratacion:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Tegumento:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Cardiovascular:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Digestivo:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Respiratorio:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Nervioso:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Musculo Esqueletico:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Urinario:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Reproductivo:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Linfoide:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Organos de los sentidos:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Otros:");

        panel9.setColorPrimario(new java.awt.Color(255, 255, 255));
        panel9.setColorSecundario(new java.awt.Color(204, 204, 204));

        jRadioButton1.setBackground(new java.awt.Color(224, 224, 224));
        estadoGeneral.add(jRadioButton1);

        jRadioButton2.setBackground(new java.awt.Color(224, 224, 224));
        estadoGeneral.add(jRadioButton2);

        jRadioButton3.setBackground(new java.awt.Color(224, 224, 224));
        estadoGeneral.add(jRadioButton3);

        jRadioButton33.setBackground(new java.awt.Color(224, 224, 224));
        sistemaNervioso.add(jRadioButton33);

        jRadioButton34.setBackground(new java.awt.Color(224, 224, 224));
        comportamiento.add(jRadioButton34);

        jRadioButton35.setBackground(new java.awt.Color(224, 224, 224));
        comportamiento.add(jRadioButton35);

        jRadioButton36.setBackground(new java.awt.Color(224, 224, 224));
        comportamiento.add(jRadioButton36);

        jRadioButton37.setBackground(new java.awt.Color(224, 224, 224));
        hidratacion.add(jRadioButton37);

        jRadioButton38.setBackground(new java.awt.Color(224, 224, 224));
        hidratacion.add(jRadioButton38);

        jRadioButton39.setBackground(new java.awt.Color(224, 224, 224));
        hidratacion.add(jRadioButton39);

        jRadioButton4.setBackground(new java.awt.Color(224, 224, 224));
        tegumento.add(jRadioButton4);

        jRadioButton5.setBackground(new java.awt.Color(224, 224, 224));
        tegumento.add(jRadioButton5);

        jRadioButton6.setBackground(new java.awt.Color(224, 224, 224));
        tegumento.add(jRadioButton6);

        jRadioButton7.setBackground(new java.awt.Color(224, 224, 224));
        muscosas.add(jRadioButton7);

        jRadioButton8.setBackground(new java.awt.Color(224, 224, 224));
        muscosas.add(jRadioButton8);

        jRadioButton9.setBackground(new java.awt.Color(224, 224, 224));
        muscosas.add(jRadioButton9);

        jRadioButton10.setBackground(new java.awt.Color(224, 224, 224));
        tractoGastroIntestinal.add(jRadioButton10);

        jRadioButton11.setBackground(new java.awt.Color(224, 224, 224));
        tractoGastroIntestinal.add(jRadioButton11);

        jRadioButton12.setBackground(new java.awt.Color(224, 224, 224));
        tractoGastroIntestinal.add(jRadioButton12);

        jRadioButton13.setBackground(new java.awt.Color(224, 224, 224));
        sistemaLinfatico.add(jRadioButton13);

        jRadioButton14.setBackground(new java.awt.Color(224, 224, 224));
        sistemaLinfatico.add(jRadioButton14);

        jRadioButton15.setBackground(new java.awt.Color(224, 224, 224));
        sistemaLinfatico.add(jRadioButton15);

        jRadioButton16.setBackground(new java.awt.Color(224, 224, 224));
        sistemaCardiopulmunar.add(jRadioButton16);

        jRadioButton17.setBackground(new java.awt.Color(224, 224, 224));
        sistemaCardiopulmunar.add(jRadioButton17);

        jRadioButton18.setBackground(new java.awt.Color(224, 224, 224));
        sistemaCardiopulmunar.add(jRadioButton18);

        jRadioButton19.setBackground(new java.awt.Color(224, 224, 224));
        sistemaMuscular.add(jRadioButton19);

        jRadioButton20.setBackground(new java.awt.Color(224, 224, 224));
        sistemaMuscular.add(jRadioButton20);

        jRadioButton21.setBackground(new java.awt.Color(224, 224, 224));
        sistemaMuscular.add(jRadioButton21);

        jRadioButton22.setBackground(new java.awt.Color(224, 224, 224));
        sistemaOseo.add(jRadioButton22);

        jRadioButton23.setBackground(new java.awt.Color(224, 224, 224));
        sistemaOseo.add(jRadioButton23);

        jRadioButton24.setBackground(new java.awt.Color(224, 224, 224));
        sistemaOseo.add(jRadioButton24);

        jRadioButton25.setBackground(new java.awt.Color(224, 224, 224));
        sistemaUrogenital.add(jRadioButton25);

        jRadioButton26.setBackground(new java.awt.Color(224, 224, 224));
        sistemaUrogenital.add(jRadioButton26);

        jRadioButton27.setBackground(new java.awt.Color(224, 224, 224));
        sistemaUrogenital.add(jRadioButton27);

        jRadioButton28.setBackground(new java.awt.Color(224, 224, 224));
        organosDeLosSentidos.add(jRadioButton28);

        jRadioButton29.setBackground(new java.awt.Color(224, 224, 224));
        organosDeLosSentidos.add(jRadioButton29);

        jRadioButton30.setBackground(new java.awt.Color(224, 224, 224));
        organosDeLosSentidos.add(jRadioButton30);

        jRadioButton31.setBackground(new java.awt.Color(224, 224, 224));
        sistemaNervioso.add(jRadioButton31);

        jRadioButton32.setBackground(new java.awt.Color(224, 224, 224));
        sistemaNervioso.add(jRadioButton32);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("N");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("AN");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("NE");

        buttonAction1.setText("Registrar");
        buttonAction1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAction1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel9Layout = new javax.swing.GroupLayout(panel9);
        panel9.setLayout(panel9Layout);
        panel9Layout.setHorizontalGroup(
            panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel9Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel9Layout.createSequentialGroup()
                        .addGroup(panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel9Layout.createSequentialGroup()
                                .addGroup(panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jRadioButton10)
                                        .addComponent(jRadioButton13))
                                    .addComponent(jRadioButton4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton7))
                                .addGap(18, 18, 18)
                                .addGroup(panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel9Layout.createSequentialGroup()
                                        .addComponent(jRadioButton5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jRadioButton6))
                                    .addGroup(panel9Layout.createSequentialGroup()
                                        .addGroup(panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(panel9Layout.createSequentialGroup()
                                                .addComponent(jRadioButton8)
                                                .addGap(18, 18, 18)
                                                .addComponent(jRadioButton9))
                                            .addGroup(panel9Layout.createSequentialGroup()
                                                .addComponent(jRadioButton11)
                                                .addGap(18, 18, 18)
                                                .addComponent(jRadioButton12))
                                            .addGroup(panel9Layout.createSequentialGroup()
                                                .addComponent(jRadioButton14)
                                                .addGap(18, 18, 18)
                                                .addComponent(jRadioButton15)))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(panel9Layout.createSequentialGroup()
                                .addComponent(jRadioButton34)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton35)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRadioButton36))
                            .addGroup(panel9Layout.createSequentialGroup()
                                .addGroup(panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel9Layout.createSequentialGroup()
                                        .addComponent(jRadioButton1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton3))
                                    .addGroup(panel9Layout.createSequentialGroup()
                                        .addComponent(jRadioButton16)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton17)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton18))
                                    .addGroup(panel9Layout.createSequentialGroup()
                                        .addComponent(jRadioButton31)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton32)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton33))
                                    .addGroup(panel9Layout.createSequentialGroup()
                                        .addComponent(jRadioButton19)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton20)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton21))
                                    .addGroup(panel9Layout.createSequentialGroup()
                                        .addComponent(jRadioButton22)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton23)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton24))
                                    .addGroup(panel9Layout.createSequentialGroup()
                                        .addComponent(jRadioButton25)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton26)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton27))
                                    .addGroup(panel9Layout.createSequentialGroup()
                                        .addComponent(jRadioButton28)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton29)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton30))
                                    .addGroup(panel9Layout.createSequentialGroup()
                                        .addComponent(jRadioButton37)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton38)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton39))
                                    .addComponent(buttonAction1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        panel9Layout.setVerticalGroup(
            panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel9Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addGap(18, 18, 18)
                .addGroup(panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel9Layout.createSequentialGroup()
                        .addGroup(panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panel9Layout.createSequentialGroup()
                                .addGroup(panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jRadioButton3)
                                    .addComponent(jRadioButton2)
                                    .addComponent(jRadioButton1))
                                .addGap(11, 11, 11)
                                .addGroup(panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton4)
                                    .addComponent(jRadioButton5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jRadioButton6, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(11, 11, 11)
                                .addGroup(panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton7)
                                    .addComponent(jRadioButton8, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jRadioButton9, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(11, 11, 11)
                                .addGroup(panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton10)
                                    .addComponent(jRadioButton11)
                                    .addComponent(jRadioButton12))
                                .addGap(11, 11, 11)
                                .addGroup(panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton13)
                                    .addComponent(jRadioButton14)
                                    .addComponent(jRadioButton15))
                                .addGap(11, 11, 11)
                                .addGroup(panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton16)
                                    .addComponent(jRadioButton17)
                                    .addComponent(jRadioButton18))
                                .addGap(11, 11, 11)
                                .addGroup(panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton19)
                                    .addComponent(jRadioButton20)
                                    .addComponent(jRadioButton21))
                                .addGap(11, 11, 11)
                                .addGroup(panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton22)
                                    .addComponent(jRadioButton23)
                                    .addComponent(jRadioButton24))
                                .addGap(11, 11, 11)
                                .addGroup(panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton25)
                                    .addComponent(jRadioButton26)
                                    .addComponent(jRadioButton27))
                                .addGap(11, 11, 11)
                                .addGroup(panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton28)
                                    .addComponent(jRadioButton29)
                                    .addComponent(jRadioButton30))
                                .addGap(11, 11, 11)
                                .addGroup(panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton31)
                                    .addComponent(jRadioButton32)
                                    .addComponent(jRadioButton33))
                                .addGap(11, 11, 11)
                                .addGroup(panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton34)
                                    .addComponent(jRadioButton36, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addComponent(jRadioButton35))
                        .addGap(11, 11, 11)
                        .addGroup(panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton37)
                            .addComponent(jRadioButton39, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(jRadioButton38))
                .addGap(18, 18, 18)
                .addComponent(buttonAction1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Aves_MamiferosLayout = new javax.swing.GroupLayout(Aves_Mamiferos);
        Aves_Mamiferos.setLayout(Aves_MamiferosLayout);
        Aves_MamiferosLayout.setHorizontalGroup(
            Aves_MamiferosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Aves_MamiferosLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(Aves_MamiferosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(panel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Aves_MamiferosLayout.setVerticalGroup(
            Aves_MamiferosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Aves_MamiferosLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabel2)
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addGap(14, 14, 14)
                .addComponent(jLabel4)
                .addGap(14, 14, 14)
                .addComponent(jLabel5)
                .addGap(15, 15, 15)
                .addComponent(jLabel7)
                .addGap(15, 15, 15)
                .addComponent(jLabel6)
                .addGap(15, 15, 15)
                .addComponent(jLabel8)
                .addGap(15, 15, 15)
                .addComponent(jLabel9)
                .addGap(15, 15, 15)
                .addComponent(jLabel10)
                .addGap(15, 15, 15)
                .addComponent(jLabel11)
                .addGap(15, 15, 15)
                .addComponent(jLabel12)
                .addGap(15, 15, 15)
                .addComponent(jLabel13)
                .addGap(15, 15, 15)
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(Aves_MamiferosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel10.setColorPrimario(new java.awt.Color(255, 255, 255));
        panel10.setColorSecundario(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout panel10Layout = new javax.swing.GroupLayout(panel10);
        panel10.setLayout(panel10Layout);
        panel10Layout.setHorizontalGroup(
            panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 593, Short.MAX_VALUE)
        );
        panel10Layout.setVerticalGroup(
            panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel8Layout = new javax.swing.GroupLayout(panel8);
        panel8.setLayout(panel8Layout);
        panel8Layout.setHorizontalGroup(
            panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel8Layout.createSequentialGroup()
                .addComponent(Aves_Mamiferos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(panel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel8Layout.setVerticalGroup(
            panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Aves_Mamiferos, javax.swing.GroupLayout.PREFERRED_SIZE, 574, Short.MAX_VALUE)
            .addComponent(panel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tabbedSelector21.addTab("Evaluacion Externa", panel8);

        panel11.setColorPrimario(new java.awt.Color(255, 255, 255));
        panel11.setColorSecundario(new java.awt.Color(255, 255, 255));

        Constantes_Fisiologicas.setColorPrimario(new java.awt.Color(255, 255, 255));
        Constantes_Fisiologicas.setColorSecundario(new java.awt.Color(204, 204, 204));

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel48.setText("Constantes fisiologicas");

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel49.setText("F.C");

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel50.setText("F.R");

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel51.setText("T°");

        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel52.setText("T.LLC.");

        jLabel53.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel53.setText("TEMPERAMENTO");

        jLabel54.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel54.setText("ACTITUD");

        buttonAction11.setText("Registrar");
        buttonAction11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAction11ActionPerformed(evt);
            }
        });

        jLabel60.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel60.setText("M.M");

        jLabel61.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel61.setText("PESO");

        jLabel67.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel67.setText("C.C");

        javax.swing.GroupLayout Constantes_FisiologicasLayout = new javax.swing.GroupLayout(Constantes_Fisiologicas);
        Constantes_Fisiologicas.setLayout(Constantes_FisiologicasLayout);
        Constantes_FisiologicasLayout.setHorizontalGroup(
            Constantes_FisiologicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Constantes_FisiologicasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Constantes_FisiologicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Constantes_FisiologicasLayout.createSequentialGroup()
                        .addComponent(jLabel48)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(Constantes_FisiologicasLayout.createSequentialGroup()
                        .addGroup(Constantes_FisiologicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel54)
                            .addComponent(jLabel52)
                            .addComponent(jLabel51)
                            .addComponent(jLabel50)
                            .addComponent(jLabel49)
                            .addComponent(jLabel60)
                            .addComponent(jLabel53)
                            .addComponent(jLabel61)
                            .addComponent(jLabel67))
                        .addGap(27, 27, 27)
                        .addGroup(Constantes_FisiologicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Constantes_FisiologicasLayout.createSequentialGroup()
                                .addComponent(buttonAction11, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(Constantes_FisiologicasLayout.createSequentialGroup()
                                .addGroup(Constantes_FisiologicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textField19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textField14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textField15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textField17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textField16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textField20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textField21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textField18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(68, 68, 68))))))
        );
        Constantes_FisiologicasLayout.setVerticalGroup(
            Constantes_FisiologicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Constantes_FisiologicasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel48)
                .addGap(58, 58, 58)
                .addGroup(Constantes_FisiologicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Constantes_FisiologicasLayout.createSequentialGroup()
                        .addComponent(jLabel51)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel49)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel50)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel60)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel52))
                    .addGroup(Constantes_FisiologicasLayout.createSequentialGroup()
                        .addComponent(textField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(Constantes_FisiologicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel53))
                        .addGap(18, 18, 18)
                        .addGroup(Constantes_FisiologicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel54)
                            .addComponent(textField18, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(Constantes_FisiologicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel61))
                        .addGap(18, 18, 18)
                        .addGroup(Constantes_FisiologicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel67))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonAction11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panel12.setColorPrimario(new java.awt.Color(255, 255, 255));
        panel12.setColorSecundario(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout panel12Layout = new javax.swing.GroupLayout(panel12);
        panel12.setLayout(panel12Layout);
        panel12Layout.setHorizontalGroup(
            panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 573, Short.MAX_VALUE)
        );
        panel12Layout.setVerticalGroup(
            panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 574, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel11Layout = new javax.swing.GroupLayout(panel11);
        panel11.setLayout(panel11Layout);
        panel11Layout.setHorizontalGroup(
            panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Constantes_Fisiologicas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panel11Layout.setVerticalGroup(
            panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Constantes_Fisiologicas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tabbedSelector21.addTab("Examen Clinico", panel11);

        panel27.setColorPrimario(new java.awt.Color(255, 255, 255));
        panel27.setColorSecundario(new java.awt.Color(255, 255, 255));

        panel28.setColorPrimario(new java.awt.Color(255, 255, 255));
        panel28.setColorSecundario(new java.awt.Color(204, 204, 204));
        panel28.setPreferredSize(new java.awt.Dimension(378, 547));

        jLabel56.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel56.setText("Planes Diagnósticos");

        jLabel57.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel57.setText("Hallazgos Anormales:");

        jLabel58.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel58.setText("Diagnostico Diferenciales:");

        jLabel59.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel59.setText("Planes Terapeúticos:");

        buttonAction12.setText("Registrar");
        buttonAction12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAction12ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane5.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane6.setViewportView(jTextArea2);

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane7.setViewportView(jTextArea3);

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jScrollPane8.setViewportView(jTextArea4);

        javax.swing.GroupLayout panel28Layout = new javax.swing.GroupLayout(panel28);
        panel28.setLayout(panel28Layout);
        panel28Layout.setHorizontalGroup(
            panel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel28Layout.createSequentialGroup()
                .addGroup(panel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel28Layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(buttonAction12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panel28Layout.createSequentialGroup()
                        .addGroup(panel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel28Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel57))
                            .addGroup(panel28Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel58))
                            .addGroup(panel28Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel56))
                            .addGroup(panel28Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(panel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panel28Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(panel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel28Layout.createSequentialGroup()
                    .addContainerGap(61, Short.MAX_VALUE)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(50, 50, 50)))
        );
        panel28Layout.setVerticalGroup(
            panel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel28Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel57)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel58)
                .addGap(108, 108, 108)
                .addComponent(jLabel56)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel59)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(buttonAction12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel28Layout.createSequentialGroup()
                    .addGap(194, 194, 194)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(301, Short.MAX_VALUE)))
        );

        panel29.setColorPrimario(new java.awt.Color(255, 255, 255));
        panel29.setColorSecundario(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout panel29Layout = new javax.swing.GroupLayout(panel29);
        panel29.setLayout(panel29Layout);
        panel29Layout.setHorizontalGroup(
            panel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 596, Short.MAX_VALUE)
        );
        panel29Layout.setVerticalGroup(
            panel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel27Layout = new javax.swing.GroupLayout(panel27);
        panel27.setLayout(panel27Layout);
        panel27Layout.setHorizontalGroup(
            panel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel27Layout.createSequentialGroup()
                .addComponent(panel28, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(panel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel27Layout.setVerticalGroup(
            panel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel28, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)
            .addComponent(panel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tabbedSelector21.addTab("Diagnostico", panel27);

        panel16.setColorPrimario(new java.awt.Color(255, 255, 255));
        panel16.setColorSecundario(new java.awt.Color(255, 255, 255));

        entidad_5.setColorPrimario(new java.awt.Color(255, 255, 255));
        entidad_5.setColorSecundario(new java.awt.Color(204, 204, 204));

        jLabel84.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel84.setText("ESI:");

        jLabel85.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel85.setText("PCP:");

        jLabel86.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel86.setText("HOSPITALIZADO:");

        jLabel87.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel87.setText("PLP:");

        jLabel88.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel88.setText("PRONOSTICO:");

        jLabel89.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel89.setText("CUARENTENA:");

        jLabel90.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel90.setText("TIEMPO DE CUARENTENA:");

        jCheckBox20.setText("SI");

        jCheckBox21.setText("NO");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jCheckBox22.setText("NO");

        jCheckBox23.setText("SI");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout entidad_5Layout = new javax.swing.GroupLayout(entidad_5);
        entidad_5.setLayout(entidad_5Layout);
        entidad_5Layout.setHorizontalGroup(
            entidad_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(entidad_5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(entidad_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(entidad_5Layout.createSequentialGroup()
                        .addGroup(entidad_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel84)
                            .addComponent(jLabel85, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                            .addComponent(jLabel87, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(entidad_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox19)
                            .addComponent(jCheckBox18)
                            .addComponent(jCheckBox17)))
                    .addGroup(entidad_5Layout.createSequentialGroup()
                        .addComponent(jLabel86)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox20)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox21))
                    .addGroup(entidad_5Layout.createSequentialGroup()
                        .addComponent(jLabel88)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(entidad_5Layout.createSequentialGroup()
                        .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox23)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox22))
                    .addGroup(entidad_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        entidad_5Layout.setVerticalGroup(
            entidad_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(entidad_5Layout.createSequentialGroup()
                .addGroup(entidad_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(entidad_5Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel84))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, entidad_5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jCheckBox17)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(entidad_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel85)
                    .addComponent(jCheckBox18))
                .addGap(7, 7, 7)
                .addGroup(entidad_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel87)
                    .addComponent(jCheckBox19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(entidad_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(entidad_5Layout.createSequentialGroup()
                        .addGroup(entidad_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel86)
                            .addComponent(jCheckBox20)
                            .addComponent(jCheckBox21))
                        .addGap(18, 18, 18)
                        .addGroup(entidad_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel88)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel89))
                    .addGroup(entidad_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckBox23)
                        .addComponent(jCheckBox22)))
                .addGap(30, 30, 30)
                .addComponent(jLabel90)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(266, Short.MAX_VALUE))
        );

        panel33.setColorPrimario(new java.awt.Color(255, 255, 255));
        panel33.setColorSecundario(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout panel33Layout = new javax.swing.GroupLayout(panel33);
        panel33.setLayout(panel33Layout);
        panel33Layout.setHorizontalGroup(
            panel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 639, Short.MAX_VALUE)
        );
        panel33Layout.setVerticalGroup(
            panel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel16Layout = new javax.swing.GroupLayout(panel16);
        panel16.setLayout(panel16Layout);
        panel16Layout.setHorizontalGroup(
            panel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel16Layout.createSequentialGroup()
                .addComponent(entidad_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(panel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel16Layout.setVerticalGroup(
            panel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(entidad_5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel33, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tabbedSelector21.addTab("Entidad_5", panel16);

        panel17.setColorPrimario(new java.awt.Color(255, 255, 255));
        panel17.setColorSecundario(new java.awt.Color(255, 255, 255));

        entidad_6.setColorPrimario(new java.awt.Color(255, 255, 255));
        entidad_6.setColorSecundario(new java.awt.Color(204, 204, 204));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "FECHA", "EVOLUCIÓN"
            }
        ));
        jScrollPane4.setViewportView(jTable1);

        javax.swing.GroupLayout entidad_6Layout = new javax.swing.GroupLayout(entidad_6);
        entidad_6.setLayout(entidad_6Layout);
        entidad_6Layout.setHorizontalGroup(
            entidad_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(entidad_6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
                .addContainerGap())
        );
        entidad_6Layout.setVerticalGroup(
            entidad_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(entidad_6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4)
                .addContainerGap())
        );

        panel34.setColorPrimario(new java.awt.Color(255, 255, 255));
        panel34.setColorSecundario(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout panel34Layout = new javax.swing.GroupLayout(panel34);
        panel34.setLayout(panel34Layout);
        panel34Layout.setHorizontalGroup(
            panel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );
        panel34Layout.setVerticalGroup(
            panel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 574, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel17Layout = new javax.swing.GroupLayout(panel17);
        panel17.setLayout(panel17Layout);
        panel17Layout.setHorizontalGroup(
            panel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel17Layout.createSequentialGroup()
                .addComponent(entidad_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(panel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel17Layout.setVerticalGroup(
            panel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(entidad_6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel34, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tabbedSelector21.addTab("Terapeutica y Evolucion", panel17);

        panel18.setColorPrimario(new java.awt.Color(255, 255, 255));
        panel18.setColorSecundario(new java.awt.Color(255, 255, 255));

        entidad_7.setColorPrimario(new java.awt.Color(255, 255, 255));
        entidad_7.setColorSecundario(new java.awt.Color(204, 204, 204));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "FECHA", "RECINTO"
            }
        ));
        jScrollPane9.setViewportView(jTable2);

        javax.swing.GroupLayout entidad_7Layout = new javax.swing.GroupLayout(entidad_7);
        entidad_7.setLayout(entidad_7Layout);
        entidad_7Layout.setHorizontalGroup(
            entidad_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(entidad_7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
                .addContainerGap())
        );
        entidad_7Layout.setVerticalGroup(
            entidad_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(entidad_7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9)
                .addContainerGap())
        );

        panel35.setColorPrimario(new java.awt.Color(255, 255, 255));
        panel35.setColorSecundario(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout panel35Layout = new javax.swing.GroupLayout(panel35);
        panel35.setLayout(panel35Layout);
        panel35Layout.setHorizontalGroup(
            panel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );
        panel35Layout.setVerticalGroup(
            panel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 574, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel18Layout = new javax.swing.GroupLayout(panel18);
        panel18.setLayout(panel18Layout);
        panel18Layout.setHorizontalGroup(
            panel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel18Layout.createSequentialGroup()
                .addComponent(entidad_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(panel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel18Layout.setVerticalGroup(
            panel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(entidad_7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel35, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tabbedSelector21.addTab("Movimiento Animal", panel18);

        panel13.setColorPrimario(new java.awt.Color(255, 255, 255));
        panel13.setColorSecundario(new java.awt.Color(255, 255, 255));

        valoracion_nutricional.setColorPrimario(new java.awt.Color(255, 255, 255));
        valoracion_nutricional.setColorSecundario(new java.awt.Color(204, 204, 204));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("Estrés:");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("Polidipsia:");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("Polifagia:");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setText("Depravacion del gusto:");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setText("Anorexia Selectiva:");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setText("Anorexia:");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setText("Inapetencia:");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setText("Prehensión y masticacion:");

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setText("Deglución:");

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel27.setText("Rumia:");

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel28.setText("Emesis:");

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel29.setText("Duración:");

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel30.setText("Regurgitación:");

        panel14.setColorPrimario(new java.awt.Color(255, 255, 255));
        panel14.setColorSecundario(new java.awt.Color(204, 204, 204));

        jRadioButton40.setBackground(new java.awt.Color(224, 224, 224));
        estadoGeneral.add(jRadioButton40);

        jRadioButton41.setBackground(new java.awt.Color(224, 224, 224));
        estadoGeneral.add(jRadioButton41);

        jRadioButton42.setBackground(new java.awt.Color(224, 224, 224));
        estadoGeneral.add(jRadioButton42);

        jRadioButton43.setBackground(new java.awt.Color(224, 224, 224));
        sistemaNervioso.add(jRadioButton43);

        jRadioButton44.setBackground(new java.awt.Color(224, 224, 224));
        comportamiento.add(jRadioButton44);

        jRadioButton45.setBackground(new java.awt.Color(224, 224, 224));
        comportamiento.add(jRadioButton45);

        jRadioButton46.setBackground(new java.awt.Color(224, 224, 224));
        comportamiento.add(jRadioButton46);

        jRadioButton47.setBackground(new java.awt.Color(224, 224, 224));
        hidratacion.add(jRadioButton47);

        jRadioButton48.setBackground(new java.awt.Color(224, 224, 224));
        hidratacion.add(jRadioButton48);

        jRadioButton49.setBackground(new java.awt.Color(224, 224, 224));
        hidratacion.add(jRadioButton49);

        jRadioButton50.setBackground(new java.awt.Color(224, 224, 224));
        tegumento.add(jRadioButton50);

        jRadioButton51.setBackground(new java.awt.Color(224, 224, 224));
        tegumento.add(jRadioButton51);

        jRadioButton52.setBackground(new java.awt.Color(224, 224, 224));
        tegumento.add(jRadioButton52);

        jRadioButton53.setBackground(new java.awt.Color(224, 224, 224));
        muscosas.add(jRadioButton53);

        jRadioButton54.setBackground(new java.awt.Color(224, 224, 224));
        muscosas.add(jRadioButton54);

        jRadioButton55.setBackground(new java.awt.Color(224, 224, 224));
        muscosas.add(jRadioButton55);

        jRadioButton56.setBackground(new java.awt.Color(224, 224, 224));
        tractoGastroIntestinal.add(jRadioButton56);

        jRadioButton57.setBackground(new java.awt.Color(224, 224, 224));
        tractoGastroIntestinal.add(jRadioButton57);

        jRadioButton58.setBackground(new java.awt.Color(224, 224, 224));
        tractoGastroIntestinal.add(jRadioButton58);

        jRadioButton59.setBackground(new java.awt.Color(224, 224, 224));
        sistemaLinfatico.add(jRadioButton59);

        jRadioButton60.setBackground(new java.awt.Color(224, 224, 224));
        sistemaLinfatico.add(jRadioButton60);

        jRadioButton61.setBackground(new java.awt.Color(224, 224, 224));
        sistemaLinfatico.add(jRadioButton61);

        jRadioButton62.setBackground(new java.awt.Color(224, 224, 224));
        sistemaCardiopulmunar.add(jRadioButton62);

        jRadioButton63.setBackground(new java.awt.Color(224, 224, 224));
        sistemaCardiopulmunar.add(jRadioButton63);

        jRadioButton64.setBackground(new java.awt.Color(224, 224, 224));
        sistemaCardiopulmunar.add(jRadioButton64);

        jRadioButton65.setBackground(new java.awt.Color(224, 224, 224));
        sistemaMuscular.add(jRadioButton65);

        jRadioButton66.setBackground(new java.awt.Color(224, 224, 224));
        sistemaMuscular.add(jRadioButton66);

        jRadioButton67.setBackground(new java.awt.Color(224, 224, 224));
        sistemaMuscular.add(jRadioButton67);

        jRadioButton68.setBackground(new java.awt.Color(224, 224, 224));
        sistemaOseo.add(jRadioButton68);

        jRadioButton69.setBackground(new java.awt.Color(224, 224, 224));
        sistemaOseo.add(jRadioButton69);

        jRadioButton70.setBackground(new java.awt.Color(224, 224, 224));
        sistemaOseo.add(jRadioButton70);

        jRadioButton71.setBackground(new java.awt.Color(224, 224, 224));
        sistemaUrogenital.add(jRadioButton71);

        jRadioButton72.setBackground(new java.awt.Color(224, 224, 224));
        sistemaUrogenital.add(jRadioButton72);

        jRadioButton73.setBackground(new java.awt.Color(224, 224, 224));
        sistemaUrogenital.add(jRadioButton73);

        jRadioButton74.setBackground(new java.awt.Color(224, 224, 224));
        organosDeLosSentidos.add(jRadioButton74);

        jRadioButton75.setBackground(new java.awt.Color(224, 224, 224));
        organosDeLosSentidos.add(jRadioButton75);

        jRadioButton76.setBackground(new java.awt.Color(224, 224, 224));
        organosDeLosSentidos.add(jRadioButton76);

        jRadioButton77.setBackground(new java.awt.Color(224, 224, 224));
        sistemaNervioso.add(jRadioButton77);

        jRadioButton78.setBackground(new java.awt.Color(224, 224, 224));
        sistemaNervioso.add(jRadioButton78);

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel31.setText("P");

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel32.setText("NP");

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel33.setText("NO");

        buttonAction2.setText("Registrar");
        buttonAction2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAction2ActionPerformed(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel34.setText("N");

        jRadioButton79.setBackground(new java.awt.Color(224, 224, 224));
        muscosas.add(jRadioButton79);

        jRadioButton80.setBackground(new java.awt.Color(224, 224, 224));
        tegumento.add(jRadioButton80);

        jRadioButton81.setBackground(new java.awt.Color(224, 224, 224));
        estadoGeneral.add(jRadioButton81);

        jRadioButton82.setBackground(new java.awt.Color(224, 224, 224));
        tractoGastroIntestinal.add(jRadioButton82);

        jRadioButton83.setBackground(new java.awt.Color(224, 224, 224));
        sistemaLinfatico.add(jRadioButton83);

        jRadioButton84.setBackground(new java.awt.Color(224, 224, 224));
        sistemaCardiopulmunar.add(jRadioButton84);

        jRadioButton85.setBackground(new java.awt.Color(224, 224, 224));
        sistemaMuscular.add(jRadioButton85);

        jRadioButton86.setBackground(new java.awt.Color(224, 224, 224));
        sistemaOseo.add(jRadioButton86);

        jRadioButton87.setBackground(new java.awt.Color(224, 224, 224));
        sistemaUrogenital.add(jRadioButton87);

        jRadioButton88.setBackground(new java.awt.Color(224, 224, 224));
        organosDeLosSentidos.add(jRadioButton88);

        jRadioButton89.setBackground(new java.awt.Color(224, 224, 224));
        sistemaNervioso.add(jRadioButton89);

        jRadioButton90.setBackground(new java.awt.Color(224, 224, 224));
        comportamiento.add(jRadioButton90);

        jRadioButton91.setBackground(new java.awt.Color(224, 224, 224));
        hidratacion.add(jRadioButton91);

        javax.swing.GroupLayout panel14Layout = new javax.swing.GroupLayout(panel14);
        panel14.setLayout(panel14Layout);
        panel14Layout.setHorizontalGroup(
            panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel14Layout.createSequentialGroup()
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel14Layout.createSequentialGroup()
                        .addComponent(buttonAction2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panel14Layout.createSequentialGroup()
                        .addGroup(panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel14Layout.createSequentialGroup()
                                .addComponent(jRadioButton44)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton45)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton46))
                            .addGroup(panel14Layout.createSequentialGroup()
                                .addGroup(panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jRadioButton56)
                                        .addComponent(jRadioButton59))
                                    .addComponent(jRadioButton50, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton53))
                                .addGap(18, 18, 18)
                                .addGroup(panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel14Layout.createSequentialGroup()
                                        .addComponent(jRadioButton51)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton52))
                                    .addGroup(panel14Layout.createSequentialGroup()
                                        .addComponent(jRadioButton54)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton55))
                                    .addGroup(panel14Layout.createSequentialGroup()
                                        .addComponent(jRadioButton57)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton58))
                                    .addGroup(panel14Layout.createSequentialGroup()
                                        .addComponent(jRadioButton60)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton61))))
                            .addGroup(panel14Layout.createSequentialGroup()
                                .addComponent(jRadioButton40)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton41)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton42))
                            .addGroup(panel14Layout.createSequentialGroup()
                                .addComponent(jRadioButton62)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton63)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton64))
                            .addGroup(panel14Layout.createSequentialGroup()
                                .addComponent(jRadioButton77)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton78)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton43))
                            .addGroup(panel14Layout.createSequentialGroup()
                                .addComponent(jRadioButton65)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton66)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton67))
                            .addGroup(panel14Layout.createSequentialGroup()
                                .addComponent(jRadioButton68)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton69)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton70))
                            .addGroup(panel14Layout.createSequentialGroup()
                                .addComponent(jRadioButton71)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton72)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton73))
                            .addGroup(panel14Layout.createSequentialGroup()
                                .addComponent(jRadioButton74)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton75)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton76))
                            .addGroup(panel14Layout.createSequentialGroup()
                                .addComponent(jRadioButton47)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton48)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton49)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton90)
                            .addComponent(jRadioButton80)
                            .addComponent(jRadioButton79)
                            .addComponent(jRadioButton82)
                            .addComponent(jRadioButton83)
                            .addComponent(jRadioButton81)
                            .addComponent(jRadioButton84)
                            .addComponent(jRadioButton89)
                            .addComponent(jRadioButton85)
                            .addComponent(jRadioButton86)
                            .addComponent(jRadioButton87)
                            .addComponent(jRadioButton88)
                            .addComponent(jRadioButton91))))
                .addContainerGap())
        );
        panel14Layout.setVerticalGroup(
            panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel14Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel14Layout.createSequentialGroup()
                        .addGroup(panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31)
                            .addComponent(jLabel32)
                            .addComponent(jLabel33)
                            .addComponent(jLabel34))
                        .addGap(18, 18, 18)
                        .addGroup(panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panel14Layout.createSequentialGroup()
                                .addGroup(panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panel14Layout.createSequentialGroup()
                                        .addGroup(panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jRadioButton42)
                                            .addComponent(jRadioButton41)
                                            .addComponent(jRadioButton40))
                                        .addGap(11, 11, 11)
                                        .addGroup(panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jRadioButton50)
                                            .addComponent(jRadioButton51, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jRadioButton52, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(11, 11, 11)
                                        .addGroup(panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jRadioButton53)
                                            .addComponent(jRadioButton54, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jRadioButton55, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(11, 11, 11)
                                        .addGroup(panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jRadioButton56)
                                            .addComponent(jRadioButton57)
                                            .addComponent(jRadioButton58))
                                        .addGap(11, 11, 11)
                                        .addGroup(panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jRadioButton59)
                                            .addComponent(jRadioButton60)
                                            .addComponent(jRadioButton61))
                                        .addGap(11, 11, 11)
                                        .addGroup(panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jRadioButton62)
                                            .addComponent(jRadioButton63)
                                            .addComponent(jRadioButton64))
                                        .addGap(11, 11, 11)
                                        .addGroup(panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jRadioButton65)
                                            .addComponent(jRadioButton66)
                                            .addComponent(jRadioButton67))
                                        .addGap(11, 11, 11)
                                        .addGroup(panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jRadioButton68)
                                            .addComponent(jRadioButton69)
                                            .addComponent(jRadioButton70))
                                        .addGap(11, 11, 11)
                                        .addGroup(panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jRadioButton71)
                                            .addComponent(jRadioButton72)
                                            .addComponent(jRadioButton73))
                                        .addGap(11, 11, 11)
                                        .addGroup(panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jRadioButton74)
                                            .addComponent(jRadioButton75)
                                            .addComponent(jRadioButton76))
                                        .addGap(11, 11, 11)
                                        .addGroup(panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jRadioButton77)
                                            .addComponent(jRadioButton78)
                                            .addComponent(jRadioButton43))
                                        .addGap(11, 11, 11)
                                        .addGroup(panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jRadioButton44)
                                            .addComponent(jRadioButton46, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addComponent(jRadioButton45))
                                .addGap(11, 11, 11)
                                .addGroup(panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton47)
                                    .addComponent(jRadioButton49, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addComponent(jRadioButton48)))
                    .addGroup(panel14Layout.createSequentialGroup()
                        .addComponent(jRadioButton81)
                        .addGap(11, 11, 11)
                        .addComponent(jRadioButton80)
                        .addGap(11, 11, 11)
                        .addComponent(jRadioButton79)
                        .addGap(11, 11, 11)
                        .addComponent(jRadioButton82)
                        .addGap(11, 11, 11)
                        .addComponent(jRadioButton83)
                        .addGap(11, 11, 11)
                        .addComponent(jRadioButton84)
                        .addGap(11, 11, 11)
                        .addComponent(jRadioButton85)
                        .addGap(11, 11, 11)
                        .addComponent(jRadioButton86)
                        .addGap(11, 11, 11)
                        .addComponent(jRadioButton87)
                        .addGap(11, 11, 11)
                        .addComponent(jRadioButton88)
                        .addGap(11, 11, 11)
                        .addComponent(jRadioButton89)
                        .addGap(11, 11, 11)
                        .addComponent(jRadioButton90)
                        .addGap(11, 11, 11)
                        .addComponent(jRadioButton91)))
                .addGap(18, 18, 18)
                .addComponent(buttonAction2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout valoracion_nutricionalLayout = new javax.swing.GroupLayout(valoracion_nutricional);
        valoracion_nutricional.setLayout(valoracion_nutricionalLayout);
        valoracion_nutricionalLayout.setHorizontalGroup(
            valoracion_nutricionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(valoracion_nutricionalLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(valoracion_nutricionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21)
                    .addComponent(jLabel23)
                    .addComponent(jLabel22)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27)
                    .addComponent(jLabel29)
                    .addComponent(jLabel30))
                .addGap(18, 18, 18)
                .addComponent(panel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        valoracion_nutricionalLayout.setVerticalGroup(
            valoracion_nutricionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(valoracion_nutricionalLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabel18)
                .addGap(15, 15, 15)
                .addComponent(jLabel19)
                .addGap(14, 14, 14)
                .addComponent(jLabel20)
                .addGap(14, 14, 14)
                .addComponent(jLabel21)
                .addGap(15, 15, 15)
                .addComponent(jLabel23)
                .addGap(15, 15, 15)
                .addComponent(jLabel22)
                .addGap(15, 15, 15)
                .addComponent(jLabel24)
                .addGap(15, 15, 15)
                .addComponent(jLabel25)
                .addGap(15, 15, 15)
                .addComponent(jLabel26)
                .addGap(15, 15, 15)
                .addComponent(jLabel27)
                .addGap(15, 15, 15)
                .addComponent(jLabel28)
                .addGap(15, 15, 15)
                .addComponent(jLabel29)
                .addGap(15, 15, 15)
                .addComponent(jLabel30)
                .addContainerGap(65, Short.MAX_VALUE))
            .addComponent(panel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panel15.setColorPrimario(new java.awt.Color(255, 255, 255));
        panel15.setColorSecundario(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout panel15Layout = new javax.swing.GroupLayout(panel15);
        panel15.setLayout(panel15Layout);
        panel15Layout.setHorizontalGroup(
            panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 548, Short.MAX_VALUE)
        );
        panel15Layout.setVerticalGroup(
            panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel13Layout = new javax.swing.GroupLayout(panel13);
        panel13.setLayout(panel13Layout);
        panel13Layout.setHorizontalGroup(
            panel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel13Layout.createSequentialGroup()
                .addComponent(valoracion_nutricional, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel13Layout.setVerticalGroup(
            panel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(valoracion_nutricional, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tabbedSelector21.addTab("Valoracion Nutricional", panel13);

        panel26.setColorPrimario(new java.awt.Color(255, 255, 255));
        panel26.setColorSecundario(new java.awt.Color(204, 204, 204));

        jLabel63.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel63.setText("Fecha:");

        jLabel64.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel64.setText("Responsable:");

        Responsable_Registro1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        buscarClinica.setEditable(true);
        buscarClinica.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        buscarClinica.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel66.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel66.setText("Historia Clinica");

        buttonAction5.setText("Ver listado de Histoias ");
        buttonAction5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAction5ActionPerformed(evt);
            }
        });

        buttonAction6.setText("Registrar");
        buttonAction6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAction6ActionPerformed(evt);
            }
        });

        fechaRegistro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        buttonAction7.setText("Nuevo");
        buttonAction7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAction7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel26Layout = new javax.swing.GroupLayout(panel26);
        panel26.setLayout(panel26Layout);
        panel26Layout.setHorizontalGroup(
            panel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel26Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel26Layout.createSequentialGroup()
                        .addGroup(panel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(buttonAction5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panel26Layout.createSequentialGroup()
                                .addComponent(jLabel66)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buscarClinica, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel26Layout.createSequentialGroup()
                        .addComponent(buttonAction7, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonAction6, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel26Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel64)
                    .addComponent(jLabel63))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(fechaRegistro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Responsable_Registro1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        panel26Layout.setVerticalGroup(
            panel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel26Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarClinica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel66))
                .addGap(18, 18, 18)
                .addComponent(buttonAction5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel63)
                    .addComponent(fechaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel64)
                    .addComponent(Responsable_Registro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(370, 370, 370)
                .addGroup(panel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAction6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAction7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addComponent(panel26, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tabbedSelector21, javax.swing.GroupLayout.PREFERRED_SIZE, 1124, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabbedSelector21, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(panel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        tabbedPaneRound1.addTab("Registro", panel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPaneRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPaneRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Recinto_N_EXHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Recinto_N_EXHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Recinto_N_EXHActionPerformed

    private void ChipMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChipMouseClicked
       if(Chip.isSelected()){
           Te_Chip.setEnabled(true);
       }else{
            Te_Chip.setEnabled(false);
       }
    }//GEN-LAST:event_ChipMouseClicked

    private void AretaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AretaMouseClicked
       if(Areta.isSelected()){
           Te_Areta.setEnabled(true);
       }else{
           Te_Areta.setEnabled(false);
       }
    }//GEN-LAST:event_AretaMouseClicked

    private void CorteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CorteMouseClicked
        if(Corte.isSelected()){
            Te_Corte.setEnabled(true);
        }else{
            Te_Corte.setEnabled(false);
        }
    }//GEN-LAST:event_CorteMouseClicked

    private void TatooMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TatooMouseClicked
        if(Tatoo.isSelected()){
            Te_Tatoo.setEnabled(true);
        }else{
            Te_Tatoo.setEnabled(false);
        }
    }//GEN-LAST:event_TatooMouseClicked

    private void PlacaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PlacaMouseClicked
        if(Placa.isSelected()){
            Te_Placa.setEnabled(true);
        }else{
            Te_Placa.setEnabled(false);
        }
    }//GEN-LAST:event_PlacaMouseClicked

    private void marcaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_marcaMouseClicked
        if(marca.isSelected()){
            Te_Placa.setEnabled(true);
        }
        else{
            Te_Placa.setEnabled(false);
        }
    }//GEN-LAST:event_marcaMouseClicked

    private void buttonAction4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAction4ActionPerformed
        ArrayList<String>  campos = CapturaCamposHistoraClinica();
      //  String[] contenidoCamposAnimal = contenidoCamposAnimal();
        boolean guardoExitoso = aceptar(panel21,null,"historia_clinica",campos);
        if (guardoExitoso) {
            System.out.println("exitoso");
        }
        else{
            System.out.println("negativo");
        }
        for (int i = 0; i < campos.size(); i++) {
            System.out.println(campos.get(i));   
        }
        
    }//GEN-LAST:event_buttonAction4ActionPerformed

    private void buttonAction5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAction5ActionPerformed
       ListadoDeHistorias historias = new ListadoDeHistorias();
       historias.setVisible(true);
       historias.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_buttonAction5ActionPerformed

    private void buttonAction6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAction6ActionPerformed
        ArrayList <String> campos = CapturarCamposRegistro();
        ControlSQL control = new ControlSQL();
        boolean datosCorrectos = control.InsertarDatos(campos, "registro");
        if(datosCorrectos){
            tabbedSelector21.setVisible(true);
            habilitarDesabilitaCamposRewgistro(false);
        }
    }//GEN-LAST:event_buttonAction6ActionPerformed

    private void tabbedPaneRound1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabbedPaneRound1MouseClicked
      
    }//GEN-LAST:event_tabbedPaneRound1MouseClicked

    private void buttonAction7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAction7ActionPerformed
        tabbedSelector21.setVisible(false);
        borrarCamposRegistro();
        habilitarDesabilitaCamposRewgistro(true);
        
    }//GEN-LAST:event_buttonAction7ActionPerformed

    private void tabbedSelector21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabbedSelector21MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_tabbedSelector21MouseClicked

    private void buttonAction12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAction12ActionPerformed
        ArrayList <String> campos =CapturaCamposDiagnosticos();
        System.out.println(campos);
        ControlSQL control = new ControlSQL();
        boolean datosCorrectos = control.InsertarDatos(campos, "diagnostico");
        if(datosCorrectos){
            llamarPanel(panel29,"diagnostico");
        }
    }//GEN-LAST:event_buttonAction12ActionPerformed

    private void buttonAction11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAction11ActionPerformed
        ArrayList <String> campos = CapturarCamposConstantesFisiologicas();
        //System.out.println(campos);
        ControlSQL control = new ControlSQL();
        boolean datosCorrectos = control.InsertarDatos(campos, "constantes_fisiologicas");
        if(datosCorrectos){
            llamarPanel(panel12,"constantes_fisiologicas");
        }
    }//GEN-LAST:event_buttonAction11ActionPerformed

    private void buttonAction1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAction1ActionPerformed

        ArrayList <String> campos =  CapturaCamposAvesMamiferos();
        //System.out.println(campos);
        ControlSQL control = new ControlSQL();
        boolean datosCorrectos = control.InsertarDatos(campos, "entidad_8_aves_mamiferos");
        if(datosCorrectos){
            llamarPanel(panel10, "entidad_8_aves_mamiferos");
        }
    }//GEN-LAST:event_buttonAction1ActionPerformed

    private void buttonAction10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAction10ActionPerformed
        ControlSQL control = new ControlSQL();
        ArrayList <String> capturar =CapturaCamposExamenesSolicitados();
        //Captura.add((String)control.SiguienteID("examen_solicitado")); // id automatico

        for (int i = 0; i < capturar.size(); i++) {
            Object busqueda = control.ejecutarConsulta("SELECT nombre from examen where nombre = '"+capturar.get(i)+"'");
            if(busqueda == null){
                //genera un nuevo tipo de examen con su propio id y lo encapsula en un arraylist, lo inserta
                ArrayList <String>  campos = new ArrayList<>();
                campos.add((String)control.SiguienteID("examen")); // id automatico
                campos.add(capturar.get(i));
                control.InsertarDatos(campos, "examen");
                System.out.println(campos);
                // insertar datos en la tabla examen_solicitado2
                ArrayList <String>  campos2 = new ArrayList<>();
                campos2.add(campos.get(0));
                campos2.add(N_Registro1.getText());
                control.InsertarDatos(campos2, "examen_solicitado2");
                System.out.println(campos2);
            }
            else{
                Object id_examen = control.ejecutarConsulta("SELECT id_examen FROM examen WHERE nombre = '"+busqueda+"'");
                ArrayList <String>  campos3 = new ArrayList<>();
                System.out.println(id_examen);
                campos3.add(id_examen+"");
                campos3.add(N_Registro1.getText());
                control.InsertarDatos(campos3, "examen_solicitado2");
                System.out.println(campos3);
            }
            //          ArrayList <String>  campos = new ArrayList<>();
            //          campos.add((String)control.SiguienteID("examen_solicitado")); // id automatico
            //          campos.add(capturar.get(i));
            //          campos.add((String)N_Registro1.getText());//llave Foranea
            //            System.out.println(campos);
        }

        llamarPanel(panel25, "examen_solicitado2");
    }//GEN-LAST:event_buttonAction10ActionPerformed

    private void jCheckBox12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox12ActionPerformed

    private void jCheckBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox7ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void Recinto_N_EXH1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Recinto_N_EXH1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Recinto_N_EXH1ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void Tatoo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tatoo1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Tatoo1MouseClicked

    private void Tatoo2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tatoo2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Tatoo2MouseClicked

    private void buttonAction2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAction2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAction2ActionPerformed

    
     
   
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Antecedentes;
    private javax.swing.JCheckBox Areta;
    private org.edisoncor.gui.panel.Panel Aves_Mamiferos;
    private javax.swing.JCheckBox Chip;
    private org.edisoncor.gui.panel.Panel Constantes_Fisiologicas;
    private javax.swing.JCheckBox Corte;
    private javax.swing.JComboBox EDB;
    private javax.swing.JComboBox Especie;
    private com.toedter.calendar.JDateChooser Fecha_De_Ingreso;
    private com.toedter.calendar.JDateChooser Fecha_Historia_Clinica;
    private org.edisoncor.gui.textField.TextField Ficha_De_Ingreso;
    private org.edisoncor.gui.panel.Panel Historia_Clinica;
    private org.edisoncor.gui.textField.TextField Nit;
    private org.edisoncor.gui.textField.TextField Nombre_Comun;
    private javax.swing.JComboBox Origen;
    private javax.swing.JCheckBox Placa;
    private org.edisoncor.gui.textField.TextField Recinto_N_EXH;
    private org.edisoncor.gui.textField.TextField Recinto_N_EXH1;
    private org.edisoncor.gui.textField.TextField Responsable_Registro1;
    private javax.swing.JComboBox Sexo;
    private javax.swing.JCheckBox Tatoo;
    private javax.swing.JCheckBox Tatoo1;
    private javax.swing.JCheckBox Tatoo2;
    private org.edisoncor.gui.textField.TextField Te_Areta;
    private org.edisoncor.gui.textField.TextField Te_Chip;
    private org.edisoncor.gui.textField.TextField Te_Corte;
    private org.edisoncor.gui.textField.TextField Te_Historia_Clinica;
    private org.edisoncor.gui.textField.TextField Te_Marca;
    private org.edisoncor.gui.textField.TextField Te_Placa;
    private org.edisoncor.gui.textField.TextField Te_Tatoo;
    private org.edisoncor.gui.textField.TextField Te_Tatoo1;
    private org.edisoncor.gui.textField.TextField Te_Tatoo2;
    private javax.swing.ButtonGroup bocaCr;
    private javax.swing.JComboBox buscarClinica;
    private org.edisoncor.gui.button.ButtonAction buttonAction1;
    private org.edisoncor.gui.button.ButtonAction buttonAction10;
    private org.edisoncor.gui.button.ButtonAction buttonAction11;
    private org.edisoncor.gui.button.ButtonAction buttonAction12;
    private org.edisoncor.gui.button.ButtonAction buttonAction2;
    private org.edisoncor.gui.button.ButtonAction buttonAction4;
    private org.edisoncor.gui.button.ButtonAction buttonAction5;
    private org.edisoncor.gui.button.ButtonAction buttonAction6;
    private org.edisoncor.gui.button.ButtonAction buttonAction7;
    private javax.swing.ButtonGroup cabezaCr;
    private javax.swing.ButtonGroup cabezaCu;
    private javax.swing.ButtonGroup caparazonCu;
    private javax.swing.JCheckBox chekChip;
    private javax.swing.ButtonGroup comportamiento;
    private javax.swing.ButtonGroup cuelloCr;
    private org.edisoncor.gui.panel.Panel entidad_5;
    private org.edisoncor.gui.panel.Panel entidad_6;
    private org.edisoncor.gui.panel.Panel entidad_7;
    private javax.swing.ButtonGroup estadoGeneral;
    private javax.swing.ButtonGroup estadoGeneralCr;
    private javax.swing.ButtonGroup estadoGeneralCu;
    private com.toedter.calendar.JDateChooser fechaRegistro;
    private javax.swing.ButtonGroup hidratacion;
    private javax.swing.ButtonGroup hidratacionCr;
    private javax.swing.ButtonGroup hidratacionCu;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox14;
    private javax.swing.JCheckBox jCheckBox15;
    private javax.swing.JCheckBox jCheckBox16;
    private javax.swing.JCheckBox jCheckBox17;
    private javax.swing.JCheckBox jCheckBox18;
    private javax.swing.JCheckBox jCheckBox19;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox20;
    private javax.swing.JCheckBox jCheckBox21;
    private javax.swing.JCheckBox jCheckBox22;
    private javax.swing.JCheckBox jCheckBox23;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton14;
    private javax.swing.JRadioButton jRadioButton15;
    private javax.swing.JRadioButton jRadioButton16;
    private javax.swing.JRadioButton jRadioButton17;
    private javax.swing.JRadioButton jRadioButton18;
    private javax.swing.JRadioButton jRadioButton19;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton20;
    private javax.swing.JRadioButton jRadioButton21;
    private javax.swing.JRadioButton jRadioButton22;
    private javax.swing.JRadioButton jRadioButton23;
    private javax.swing.JRadioButton jRadioButton24;
    private javax.swing.JRadioButton jRadioButton25;
    private javax.swing.JRadioButton jRadioButton26;
    private javax.swing.JRadioButton jRadioButton27;
    private javax.swing.JRadioButton jRadioButton28;
    private javax.swing.JRadioButton jRadioButton29;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton30;
    private javax.swing.JRadioButton jRadioButton31;
    private javax.swing.JRadioButton jRadioButton32;
    private javax.swing.JRadioButton jRadioButton33;
    private javax.swing.JRadioButton jRadioButton34;
    private javax.swing.JRadioButton jRadioButton35;
    private javax.swing.JRadioButton jRadioButton36;
    private javax.swing.JRadioButton jRadioButton37;
    private javax.swing.JRadioButton jRadioButton38;
    private javax.swing.JRadioButton jRadioButton39;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton40;
    private javax.swing.JRadioButton jRadioButton41;
    private javax.swing.JRadioButton jRadioButton42;
    private javax.swing.JRadioButton jRadioButton43;
    private javax.swing.JRadioButton jRadioButton44;
    private javax.swing.JRadioButton jRadioButton45;
    private javax.swing.JRadioButton jRadioButton46;
    private javax.swing.JRadioButton jRadioButton47;
    private javax.swing.JRadioButton jRadioButton48;
    private javax.swing.JRadioButton jRadioButton49;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton50;
    private javax.swing.JRadioButton jRadioButton51;
    private javax.swing.JRadioButton jRadioButton52;
    private javax.swing.JRadioButton jRadioButton53;
    private javax.swing.JRadioButton jRadioButton54;
    private javax.swing.JRadioButton jRadioButton55;
    private javax.swing.JRadioButton jRadioButton56;
    private javax.swing.JRadioButton jRadioButton57;
    private javax.swing.JRadioButton jRadioButton58;
    private javax.swing.JRadioButton jRadioButton59;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton60;
    private javax.swing.JRadioButton jRadioButton61;
    private javax.swing.JRadioButton jRadioButton62;
    private javax.swing.JRadioButton jRadioButton63;
    private javax.swing.JRadioButton jRadioButton64;
    private javax.swing.JRadioButton jRadioButton65;
    private javax.swing.JRadioButton jRadioButton66;
    private javax.swing.JRadioButton jRadioButton67;
    private javax.swing.JRadioButton jRadioButton68;
    private javax.swing.JRadioButton jRadioButton69;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton70;
    private javax.swing.JRadioButton jRadioButton71;
    private javax.swing.JRadioButton jRadioButton72;
    private javax.swing.JRadioButton jRadioButton73;
    private javax.swing.JRadioButton jRadioButton74;
    private javax.swing.JRadioButton jRadioButton75;
    private javax.swing.JRadioButton jRadioButton76;
    private javax.swing.JRadioButton jRadioButton77;
    private javax.swing.JRadioButton jRadioButton78;
    private javax.swing.JRadioButton jRadioButton79;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton80;
    private javax.swing.JRadioButton jRadioButton81;
    private javax.swing.JRadioButton jRadioButton82;
    private javax.swing.JRadioButton jRadioButton83;
    private javax.swing.JRadioButton jRadioButton84;
    private javax.swing.JRadioButton jRadioButton85;
    private javax.swing.JRadioButton jRadioButton86;
    private javax.swing.JRadioButton jRadioButton87;
    private javax.swing.JRadioButton jRadioButton88;
    private javax.swing.JRadioButton jRadioButton89;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JRadioButton jRadioButton90;
    private javax.swing.JRadioButton jRadioButton91;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private org.edisoncor.gui.label.LabelCustom labelCustom1;
    private org.edisoncor.gui.label.LabelCustom labelCustom10;
    private org.edisoncor.gui.label.LabelCustom labelCustom11;
    private org.edisoncor.gui.label.LabelCustom labelCustom12;
    private org.edisoncor.gui.label.LabelCustom labelCustom13;
    private org.edisoncor.gui.label.LabelCustom labelCustom14;
    private org.edisoncor.gui.label.LabelCustom labelCustom15;
    private org.edisoncor.gui.label.LabelCustom labelCustom16;
    private org.edisoncor.gui.label.LabelCustom labelCustom2;
    private org.edisoncor.gui.label.LabelCustom labelCustom4;
    private org.edisoncor.gui.label.LabelCustom labelCustom5;
    private org.edisoncor.gui.label.LabelCustom labelCustom6;
    private org.edisoncor.gui.label.LabelCustom labelCustom7;
    private org.edisoncor.gui.label.LabelCustom labelCustom8;
    private javax.swing.JCheckBox marca;
    private javax.swing.ButtonGroup maxilaresCr;
    private javax.swing.ButtonGroup muscosas;
    private javax.swing.ButtonGroup organosDeLosSentidos;
    private javax.swing.ButtonGroup organosDeLosSentidosCR;
    private javax.swing.ButtonGroup organosDeLosSentidosCu;
    private org.edisoncor.gui.panel.Panel panel1;
    private org.edisoncor.gui.panel.Panel panel10;
    private org.edisoncor.gui.panel.Panel panel11;
    private org.edisoncor.gui.panel.Panel panel12;
    private org.edisoncor.gui.panel.Panel panel13;
    private org.edisoncor.gui.panel.Panel panel14;
    private org.edisoncor.gui.panel.Panel panel15;
    private org.edisoncor.gui.panel.Panel panel16;
    private org.edisoncor.gui.panel.Panel panel17;
    private org.edisoncor.gui.panel.Panel panel18;
    private org.edisoncor.gui.panel.Panel panel2;
    private org.edisoncor.gui.panel.Panel panel21;
    private org.edisoncor.gui.panel.Panel panel22;
    private org.edisoncor.gui.panel.Panel panel23;
    private org.edisoncor.gui.panel.Panel panel24;
    private org.edisoncor.gui.panel.Panel panel25;
    private org.edisoncor.gui.panel.Panel panel26;
    private org.edisoncor.gui.panel.Panel panel27;
    private org.edisoncor.gui.panel.Panel panel28;
    private org.edisoncor.gui.panel.Panel panel29;
    private org.edisoncor.gui.panel.Panel panel3;
    private org.edisoncor.gui.panel.Panel panel33;
    private org.edisoncor.gui.panel.Panel panel34;
    private org.edisoncor.gui.panel.Panel panel35;
    private org.edisoncor.gui.panel.Panel panel5;
    private org.edisoncor.gui.panel.Panel panel8;
    private org.edisoncor.gui.panel.Panel panel9;
    private javax.swing.ButtonGroup piscoCu;
    private javax.swing.ButtonGroup plastronCu;
    private javax.swing.ButtonGroup regionCaudalCr;
    private javax.swing.ButtonGroup regionDorsalCr;
    private javax.swing.ButtonGroup sistemaCardioPulmunarCu;
    private javax.swing.ButtonGroup sistemaCardiopulmunar;
    private javax.swing.ButtonGroup sistemaCardiopulmunarCr;
    private javax.swing.ButtonGroup sistemaLinfatico;
    private javax.swing.ButtonGroup sistemaMuscular;
    private javax.swing.ButtonGroup sistemaMuscularCr;
    private javax.swing.ButtonGroup sistemaMuscularCu;
    private javax.swing.ButtonGroup sistemaNervioso;
    private javax.swing.ButtonGroup sistemaOseo;
    private javax.swing.ButtonGroup sistemaOseoCr;
    private javax.swing.ButtonGroup sistemaOseoCu;
    private javax.swing.ButtonGroup sistemaUrogenital;
    private javax.swing.ButtonGroup sistemaUrogenitalCr;
    private javax.swing.ButtonGroup sistemaUrogenitalCu;
    private org.edisoncor.gui.tabbedPane.TabbedPaneRound tabbedPaneRound1;
    private org.edisoncor.gui.tabbedPane.TabbedSelector2 tabbedSelector21;
    private org.edisoncor.gui.tabbedPane.TabbedSelector2 tabbedSelector22;
    private javax.swing.ButtonGroup tegumento;
    private org.edisoncor.gui.textField.TextField textField1;
    private org.edisoncor.gui.textField.TextField textField14;
    private org.edisoncor.gui.textField.TextField textField15;
    private org.edisoncor.gui.textField.TextField textField16;
    private org.edisoncor.gui.textField.TextField textField17;
    private org.edisoncor.gui.textField.TextField textField18;
    private org.edisoncor.gui.textField.TextField textField19;
    private org.edisoncor.gui.textField.TextField textField20;
    private org.edisoncor.gui.textField.TextField textField21;
    private javax.swing.ButtonGroup tractoGastroIntestinal;
    private org.edisoncor.gui.panel.Panel valoracion_nutricional;
    // End of variables declaration//GEN-END:variables
}
