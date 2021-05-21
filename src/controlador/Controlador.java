
package controlador;
import static com.sun.java.accessibility.util.AWTEventMonitor.addActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JTable;
import modelo.Persona;
import modelo.PersonaDAO;
import vista.Vista;
import modelo.PersonaDAO;
import modelo.PersonaDAO;

        


public class Controlador implements ActionListener{

  PersonaDAO dao= new PersonaDAO();
  Persona p = new Persona();
  Vista vista = new Vista();  
  DefaulTableModel modelo = new DefaulTableModel();
  
  public Controlador(Vista v ){
  
  this.vista= v;
  this.vista.addActionListener(this);addActionListener();

  
  
  }

    @Override
    public void actionPerformed(ActionEvent e) {
    
        if (e.getSource()==vista.btnListar) {
            lista(vista.tabla);
        }
    }

    private void listar (Jtable tabla){
    modelo=tabla.getModel();
    List<Persona>lista=dao.listar();
    Object []object = new Object [4];
        for (int i = 0; i <lista.size() ; i++) {
        object [0]= lista.get(i).getId(); 
        object [1]= lista.get(i).getNombre();
        object [2]= lista.get(i).getCorreo();
        object [3]= lista.get(i).getTel();
        modelo.addRow(object);
           
        }
    
    
    }

    private void addActionListener() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void lista(JTable tabla) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class Jtable {

        public Jtable() {
        }

        private DefaulTableModel getModel() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    private static class DefaulTableModel {

        public DefaulTableModel() {
        }

        private void addRow() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void addRow(Object[] object) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

 
    }
        
    

   
    

    

