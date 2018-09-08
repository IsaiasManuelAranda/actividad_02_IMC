package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import views.ViewIMC;
import models.ModelIMC;

public class ControllerIMC implements ActionListener {

    private final ModelIMC modelIMC;
    private final ViewIMC viewIMC;    
    
    public ControllerIMC(ModelIMC modelIMC, ViewIMC viewIMC) {
        this.viewIMC = viewIMC;
        this.modelIMC = modelIMC;
        viewIMC.jb_calcular.addActionListener(this);
        initComponents();
        
    }
    
    @Override
    
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == viewIMC.jb_calcular){
            jb_calcularActionPerformed();
        }
    }
    
    private void jb_calcularActionPerformed()
    {
        modelIMC.setAltura(Integer.parseInt(viewIMC.jtf_altura.getText()));
        modelIMC.setPeso(Float.parseFloat(viewIMC.jtf_peso.getText()));
        modelIMC.getResult();
        double res = modelIMC.resultado();
        JOptionPane.showMessageDialog(null, "Tu Índice de Masa Corporal es de: " + res);
        
        if ( res <= 16){
            viewIMC.jtf_result.setText(String.valueOf("Peso Bajo"));
        }
        else if ( res > 16 || res < 18){
            viewIMC.jtf_result.setText(String.valueOf("Peso Bajo-Moderado"));     
        }
        else if ( res > 18 || res < 20){
            viewIMC.jtf_result.setText(String.valueOf("Peso Moderado"));     
        }
        else if ( res > 20 || res < 23){
            viewIMC.jtf_result.setText(String.valueOf("Peso Alto-Moderado"));     
        }
        else if ( res > 23 || res < 24){
            viewIMC.jtf_result.setText(String.valueOf("Peso Alto"));     
        }
        else {
            viewIMC.jtf_result.setText(String.valueOf("No existe Valoracion"));
      }
    }
    
    private void initComponents(){
        viewIMC.setTitle("IMC");
        viewIMC.setResizable(false);
        viewIMC.setLocationRelativeTo(null);
        viewIMC.setVisible(true);
    }
    
}
