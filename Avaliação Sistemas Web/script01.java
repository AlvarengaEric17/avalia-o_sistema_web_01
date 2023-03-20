import java.util.Scanner;

public class script01 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        float valor, resultado;

        System.out.print("Digite a quantidade de metros para converter:");
        valor = input.nextFloat();

        resultado = valor * 100;

        System.out.print(valor + " metros equivale a " + resultado + " centimetros");


    }

    
}