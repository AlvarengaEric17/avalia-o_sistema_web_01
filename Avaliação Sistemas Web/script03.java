import java.util.Scanner;

public class script03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int valorDigitado;

        System.out.print("Digite um numero de 1 a 7 e veja qual dia da semana ele representa: ");
        valorDigitado = input.nextInt();

        if (valorDigitado == 1) {
            System.out.print("DOMINGO");
        }

        else if (valorDigitado == 2) {
            System.out.print("SEGUNDA-FEIRA");
        }

        else if (valorDigitado == 3) {
            System.out.print("TERÇA-FEIRA");
        }

        else if (valorDigitado == 4) {
            System.out.print("QUARTA-FEIRA");
        }

        else if (valorDigitado == 5) {
            System.out.print("QUINTA-FEIRA");
        }

        else if (valorDigitado == 6) {
            System.out.print("SEXTA-FEIRA");
        }

        else if (valorDigitado == 7) {
            System.out.print("SABADO");
        }

        else {
            System.out.print("!ERRO! Dia da semana não existente");
        }

    }
}
