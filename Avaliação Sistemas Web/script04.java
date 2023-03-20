import java.util.Scanner;

public class script04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double salario, novoSalario;

        System.out.print("Digite o seu salario: ");
        salario = input.nextDouble();

        if (salario >= 1000 && salario < 2000) {
            novoSalario = salario * 1.15;
            System.out.print("O seu salario tera um reajuste de 15%. Sendo assim você passa a receber " + novoSalario);
        }

        else if (salario >= 2000 && salario < 3000) {
            novoSalario = salario * 1.10;
            System.out.print("O seu salario tera um reajuste de 10%. Sendo assim você passa a receber " + novoSalario);
        }

        else if (salario >= 3000) {
            novoSalario = salario * 1.05;
            System.out.print("O seu salario tera um reajuste de 5%. Sendo assim você passa a receber " + novoSalario);
        }

        else {
            System.out.print("!ERRO!");
        }
    }
}
