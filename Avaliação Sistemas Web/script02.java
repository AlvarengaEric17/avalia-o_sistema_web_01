import java.util.Scanner;

public class script02 {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int idade1, idade2;
        String nome1, nome2;

        System.out.print("1° pessoa: Digite seu nome: ");
        nome1 = input.next();

        System.out.print("1° pessoa: Digite a sua idade: ");
        idade1 = input.nextInt();

        System.out.print("2° pessoa: Digite o seu nome: ");
        nome2 = input.next();

        System.out.print("2° pessoa: Digite a sua idade: ");
        idade2 = input.nextInt();

        if (idade1 > idade2){
            System.out.print(nome1 + " é mais velho que " + nome2);
        }

        else if (idade1 < idade2){
            System.out.print(nome2 + " é mais velho que " +nome1);
        }

        else if(idade1 == idade2){
            System.out.print(nome1 + " e " + nome2 + " tem a mesma idade");
        }

        else{
            System.out.print("ERRO");
        }

    }
}
