import java.util.Scanner;

public class script05 {

    public void main(String[] args) {

        Scanner input = new Scanner(System.in);
        float peso, altura, imc;

        System.out.print("Digite a sua altura: ");
        altura = input.nextFloat();

        System.out.print("Digite o seu peso: ");
        peso = input.nextFloat();

        imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.print("Você esta abaixo do peso");

        }

        else if (imc <= 18.5 && imc > 24.9) {
            System.out.print("Peso normal");
        }

        else if (imc <= 24.9 && imc > 29.9) {
            System.out.print("Sobrepeso");
        }

        else if (imc <= 29.9 && imc > 34.9) {
            System.out.print("Obesidade grau 1");
        }

        else if (imc <= 34.9 && imc > 39.9) {
            System.out.print("Obesidade grau 2");

        }

        else if (imc > 40) {
            System.out.print("Obesidade grau 3, MÓRBIDA");

        }
    }
}
