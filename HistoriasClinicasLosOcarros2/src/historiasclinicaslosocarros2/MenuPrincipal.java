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
        labelCustom9 = new org.edisoncor.gui.label.LabelCustom();
        Recinto_N_CTNA = new org.edisoncor.gui.textField.TextField();
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
        Edad_Aproximada = new com.toedter.calendar.JDateChooser();
        Especie = new javax.swing.JComboBox();
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
        jCheckBox10 = new javax.swing.JCheckBox();
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
        jScrollPane2 = new javax.swing.JScrollPane();
        Observaciones_Diagnosticos = new javax.swing.JTextArea();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        Presuntivo_Diagnosticos = new org.edisoncor.gui.textField.TextField();
        Diferencial_Diagnosticos = new org.edisoncor.gui.textField.TextField();
        Pronostico_Diagnosticos = new org.edisoncor.gui.textField.TextField();
        buttonAction12 = new org.edisoncor.gui.button.ButtonAction();
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
        panel26 = new org.edisoncor.gui.panel.Panel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        N_Registro1 = new org.edisoncor.gui.textField.TextField();
        Responsable_Registro1 = new org.edisoncor.gui.textField.TextField();
        Clinico_Registro1 = new org.edisoncor.gui.textField.TextField();
        buscarClinica = new javax.swing.JComboBox();
        jLabel66 = new javax.swing.JLabel();
        buttonAction5 = new org.edisoncor.gui.button.ButtonAction();
        buttonAction6 = new org.edisoncor.gui.button.ButtonAction();
        fechaRegistro = new com.toedter.calendar.JDateChooser();
        buttonAction7 = new org.edisoncor.gui.button.ButtonAction();
        buttonAction8 = new org.edisoncor.gui.button.ButtonAction();
        buttonAction9 = new org.edisoncor.gui.button.ButtonAction();

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel23Layout.setVerticalGroup(
            panel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCustom15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Chip)
                    .addComponent(Te_Chip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tatoo)
                    .addComponent(Te_Tatoo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Areta)
                    .addComponent(Te_Areta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Placa)
                    .addComponent(Te_Placa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        labelCustom4.setText("Especie:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Origen :");

        Origen.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Origen.setPreferredSize(new java.awt.Dimension(81, 20));

        labelCustom5.setBackground(new java.awt.Color(0, 0, 51));
        labelCustom5.setText("Ficha De Ingreso:");

        labelCustom6.setBackground(new java.awt.Color(0, 0, 51));
        labelCustom6.setText("Fecha Historia Clinica:");

        labelCustom7.setBackground(new java.awt.Color(0, 0, 51));
        labelCustom7.setText("Historia Clinica:");

        Te_Historia_Clinica.setPreferredSize(new java.awt.Dimension(81, 20));

        labelCustom9.setBackground(new java.awt.Color(0, 0, 51));
        labelCustom9.setText("Recinto N° CTNA:");

        Recinto_N_CTNA.setPreferredSize(new java.awt.Dimension(81, 20));

        labelCustom8.setBackground(new java.awt.Color(0, 0, 51));
        labelCustom8.setText("Nit/Chip :");

        Nit.setPreferredSize(new java.awt.Dimension(81, 20));

        labelCustom11.setBackground(new java.awt.Color(0, 0, 51));
        labelCustom11.setText("Sexo:");

        Sexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Macho", "Hembra", "Indefinido" }));
        Sexo.setPreferredSize(new java.awt.Dimension(81, 20));

        labelCustom13.setBackground(new java.awt.Color(0, 0, 51));
        labelCustom13.setText("EDB :");

        EDB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "N", "J", "SA", "A", "AN" }));
        EDB.setPreferredSize(new java.awt.Dimension(81, 20));

        labelCustom10.setBackground(new java.awt.Color(0, 0, 51));
        labelCustom10.setText("Recinto N° EXH :");

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
                        .addComponent(Edad_Aproximada, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(panel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
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
                                    .addComponent(Especie, 0, 160, Short.MAX_VALUE))))
                        .addGroup(panel24Layout.createSequentialGroup()
                            .addComponent(labelCustom10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(37, 37, 37)
                            .addComponent(Recinto_N_EXH, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                        .addComponent(labelCustom9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Recinto_N_CTNA, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel24Layout.createSequentialGroup()
                        .addComponent(labelCustom6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Fecha_Historia_Clinica, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel24Layout.setVerticalGroup(
            panel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel24Layout.createSequentialGroup()
                .addContainerGap()
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
                    .addComponent(Origen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCustom9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Recinto_N_CTNA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCustom7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Te_Historia_Clinica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCustom11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCustom8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCustom13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EDB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCustom10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Recinto_N_EXH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCustom12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nombre_Comun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(panel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCustom14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Edad_Aproximada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(69, Short.MAX_VALUE))
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

        jCheckBox10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox10.setText("jCheckBox1");

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel5Layout.createSequentialGroup()
                .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel5Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
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
                            .addComponent(jCheckBox10)
                            .addComponent(jCheckBox11)
                            .addComponent(jCheckBox2)
                            .addComponent(jCheckBox7)
                            .addComponent(jCheckBox3)
                            .addComponent(jCheckBox12)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel5Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonAction10, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panel5Layout.setVerticalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel5Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel55)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                    .addComponent(jCheckBox10))
                .addGap(30, 30, 30)
                .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox15)
                    .addComponent(jCheckBox11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
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
                .addComponent(panel5, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tabbedSelector21.addTab("Solicitar Examenes", panel1);

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

        tabbedSelector21.addTab("General", panel8);

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
        jLabel56.setText("Diagnostico Presuntivo:");

        Observaciones_Diagnosticos.setColumns(20);
        Observaciones_Diagnosticos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Observaciones_Diagnosticos.setRows(5);
        jScrollPane2.setViewportView(Observaciones_Diagnosticos);

        jLabel57.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel57.setText("Observaciones Clinicas:");

        jLabel58.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel58.setText("Diagnostico Diferencial:");

        jLabel59.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel59.setText("Pronostico:");

        Presuntivo_Diagnosticos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        Diferencial_Diagnosticos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        Pronostico_Diagnosticos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        buttonAction12.setText("Registrar");
        buttonAction12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAction12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel28Layout = new javax.swing.GroupLayout(panel28);
        panel28.setLayout(panel28Layout);
        panel28Layout.setHorizontalGroup(
            panel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel28Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(panel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel28Layout.createSequentialGroup()
                        .addComponent(jLabel56)
                        .addGap(27, 27, 27)
                        .addComponent(Presuntivo_Diagnosticos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panel28Layout.createSequentialGroup()
                        .addGroup(panel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel58)
                            .addComponent(jLabel59))
                        .addGap(30, 30, 30)
                        .addGroup(panel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Diferencial_Diagnosticos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Pronostico_Diagnosticos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(panel28Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jLabel57)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel28Layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel28Layout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addComponent(buttonAction12, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel28Layout.setVerticalGroup(
            panel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel28Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel57)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56)
                    .addComponent(Presuntivo_Diagnosticos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58)
                    .addComponent(Diferencial_Diagnosticos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(panel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel59)
                    .addComponent(Pronostico_Diagnosticos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 255, Short.MAX_VALUE)
                .addComponent(buttonAction12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        panel26.setColorPrimario(new java.awt.Color(255, 255, 255));
        panel26.setColorSecundario(new java.awt.Color(204, 204, 204));

        jLabel62.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel62.setText("N° Registro:");

        jLabel63.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel63.setText("Fecha:");

        jLabel64.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel64.setText("Responsable:");

        jLabel65.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel65.setText("Clinico:");

        N_Registro1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        Responsable_Registro1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        Clinico_Registro1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

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

        buttonAction8.setText("buttonAction8");
        buttonAction8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAction8ActionPerformed(evt);
            }
        });

        buttonAction9.setText("buttonAction9");
        buttonAction9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAction9ActionPerformed(evt);
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
                    .addGroup(panel26Layout.createSequentialGroup()
                        .addGroup(panel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel26Layout.createSequentialGroup()
                                .addGroup(panel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel64)
                                    .addComponent(jLabel65)
                                    .addComponent(jLabel63))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(panel26Layout.createSequentialGroup()
                                .addComponent(jLabel62)
                                .addGap(11, 11, 11)))
                        .addGroup(panel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(N_Registro1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fechaRegistro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                            .addComponent(Clinico_Registro1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Responsable_Registro1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(5, 5, 5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel26Layout.createSequentialGroup()
                        .addGroup(panel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonAction8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel26Layout.createSequentialGroup()
                                .addComponent(buttonAction7, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonAction6, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(buttonAction9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
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
                .addGroup(panel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel62)
                    .addComponent(N_Registro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(panel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel63)
                    .addComponent(fechaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel64)
                    .addComponent(Responsable_Registro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel65)
                    .addComponent(Clinico_Registro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(200, 200, 200)
                .addComponent(buttonAction9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonAction8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
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

    private void buttonAction8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAction8ActionPerformed
        panel17.setVisible(true);
        Reptiles_Crocodylus.setVisible(true);
    }//GEN-LAST:event_buttonAction8ActionPerformed

    private void buttonAction9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAction9ActionPerformed
        panel17.setVisible(false);
        Reptiles_Crocodylus.setVisible(false);
    }//GEN-LAST:event_buttonAction9ActionPerformed

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
    private org.edisoncor.gui.textField.TextField Clinico_Registro1;
    private org.edisoncor.gui.panel.Panel Constantes_Fisiologicas;
    private javax.swing.JCheckBox Corte;
    private org.edisoncor.gui.textField.TextField Diferencial_Diagnosticos;
    private javax.swing.JComboBox EDB;
    private com.toedter.calendar.JDateChooser Edad_Aproximada;
    private javax.swing.JComboBox Especie;
    private com.toedter.calendar.JDateChooser Fecha_De_Ingreso;
    private com.toedter.calendar.JDateChooser Fecha_Historia_Clinica;
    private org.edisoncor.gui.textField.TextField Ficha_De_Ingreso;
    private org.edisoncor.gui.panel.Panel Historia_Clinica;
    private org.edisoncor.gui.textField.TextField N_Registro1;
    private org.edisoncor.gui.textField.TextField Nit;
    private org.edisoncor.gui.textField.TextField Nombre_Comun;
    private javax.swing.JTextArea Observaciones_Diagnosticos;
    private javax.swing.JComboBox Origen;
    private javax.swing.JCheckBox Placa;
    private org.edisoncor.gui.textField.TextField Presuntivo_Diagnosticos;
    private org.edisoncor.gui.textField.TextField Pronostico_Diagnosticos;
    private org.edisoncor.gui.textField.TextField Recinto_N_CTNA;
    private org.edisoncor.gui.textField.TextField Recinto_N_EXH;
    private org.edisoncor.gui.textField.TextField Responsable_Registro1;
    private javax.swing.JComboBox Sexo;
    private javax.swing.JCheckBox Tatoo;
    private org.edisoncor.gui.textField.TextField Te_Areta;
    private org.edisoncor.gui.textField.TextField Te_Chip;
    private org.edisoncor.gui.textField.TextField Te_Corte;
    private org.edisoncor.gui.textField.TextField Te_Historia_Clinica;
    private org.edisoncor.gui.textField.TextField Te_Marca;
    private org.edisoncor.gui.textField.TextField Te_Placa;
    private org.edisoncor.gui.textField.TextField Te_Tatoo;
    private javax.swing.ButtonGroup bocaCr;
    private javax.swing.JComboBox buscarClinica;
    private org.edisoncor.gui.button.ButtonAction buttonAction1;
    private org.edisoncor.gui.button.ButtonAction buttonAction10;
    private org.edisoncor.gui.button.ButtonAction buttonAction11;
    private org.edisoncor.gui.button.ButtonAction buttonAction12;
    private org.edisoncor.gui.button.ButtonAction buttonAction4;
    private org.edisoncor.gui.button.ButtonAction buttonAction5;
    private org.edisoncor.gui.button.ButtonAction buttonAction6;
    private org.edisoncor.gui.button.ButtonAction buttonAction7;
    private org.edisoncor.gui.button.ButtonAction buttonAction8;
    private org.edisoncor.gui.button.ButtonAction buttonAction9;
    private javax.swing.ButtonGroup cabezaCr;
    private javax.swing.ButtonGroup cabezaCu;
    private javax.swing.ButtonGroup caparazonCu;
    private javax.swing.JCheckBox chekChip;
    private javax.swing.ButtonGroup comportamiento;
    private javax.swing.ButtonGroup cuelloCr;
    private org.edisoncor.gui.panel.Panel entidad_5;
    private org.edisoncor.gui.panel.Panel entidad_6;
    private javax.swing.ButtonGroup estadoGeneral;
    private javax.swing.ButtonGroup estadoGeneralCr;
    private javax.swing.ButtonGroup estadoGeneralCu;
    private com.toedter.calendar.JDateChooser fechaRegistro;
    private javax.swing.ButtonGroup hidratacion;
    private javax.swing.ButtonGroup hidratacionCr;
    private javax.swing.ButtonGroup hidratacionCu;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
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
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
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
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
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
    private org.edisoncor.gui.label.LabelCustom labelCustom9;
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
    private org.edisoncor.gui.panel.Panel panel16;
    private org.edisoncor.gui.panel.Panel panel17;
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
    // End of variables declaration//GEN-END:variables
}
