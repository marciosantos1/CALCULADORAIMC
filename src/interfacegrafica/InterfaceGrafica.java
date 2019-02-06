
package interfacegrafica;

//CALCULO IMC...


import javax.swing.JFrame;
import telas.PainelPrincipal;

public class InterfaceGrafica {

    
    public static void main(String[] args) {
        
        JFrame janela = new JFrame("Calculadora de IMC");
        PainelPrincipal painel = new PainelPrincipal();
        
      //define atributos da tela...
       janela.setDefaultCloseOperation(janela.EXIT_ON_CLOSE);
        janela.setSize(500, 500);
         janela.add(painel);
          janela.setVisible(true);
          
          
        
    }
    
}
