package calculadora;

import javax.swing.JOptionPane;

public class Calculadora {

    public static void main(String[] args) {
        //Utilizando método estático somar da classe "Operacoes"
        Operacoes.somar(10, 20);
        
        //Imprimindo a tabuada de um número
        String valor = JOptionPane.showInputDialog(null, "Informe um número: ");
        int numero = Integer.parseInt(valor);
        int tabuada = 0;
        
        while(tabuada <= 10){
            Operacoes.multiplicar(numero, tabuada);
            tabuada++;
        }
        
        for(int i=0; i<=10; i++){
            Operacoes.dividir(numero, i);
        }
    }
    
}
