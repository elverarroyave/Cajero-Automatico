package view;
import javax.swing.JOptionPane;

public class interfaceCajero {
    public static void main(String arg[]){
        char option;
        option = panelChar();

        switch (option){
            case '1':
                JOptionPane.showMessageDialog(null,"Seleccionaste consultar saldo");
                break;
            case '2':
                JOptionPane.showMessageDialog(null, "selecionaste retirar dinero");
                break;
            case '3':
                JOptionPane.showMessageDialog(null, "selecionaste depositar dinero");
                break;
            case '4':
                break;
            default: JOptionPane.showMessageDialog(null,"Error del sistema", "Error xxxxxxxxx", JOptionPane.ERROR_MESSAGE);
        }

    }
    public static char panelChar(){
    String dato = JOptionPane.showInputDialog(null, "Por favor ingrese una opción:\n" +
               "   1. Consulta de saldo.\n" +
               "   2. Retiro de efectivo.\n" +
               "   3. Deposito de efectivo\n" +
               "   4. Salir.", "Cajero Automatico", JOptionPane.INFORMATION_MESSAGE);
    char caracter = '*';
    try {
        caracter = dato.charAt(0);
    } catch (StringIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Este error se presenta por que no seleccionaste nada en el campo" , "ERROR AL DIGITAR", JOptionPane.ERROR_MESSAGE);
            panelChar();
    }
        return(caracter);
    }

}

