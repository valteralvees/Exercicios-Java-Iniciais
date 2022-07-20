import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // #1
        System.out.println("Alô mundo! I'm back CARAI");

        // #2
        Scanner teclado = new Scanner(System.in);
        System.out.println("Por favor, digite um número entre 0 e 100");
        int numEscolhido = teclado.nextInt();
        System.out.println("O número escolhido foi " + numEscolhido);

        // #3
        System.out.println("Por favor, digite um número:");
        int num1 = teclado.nextInt();
        int num2 = teclado.nextInt();
        int somaNum = num1 + num2;
        System.out.println("A soma de " + num1 + " e " + num2 + " é " + somaNum);

        // #4
        System.out.println("Please, insert the grades of 1o bimester:");
        double firstGrade = teclado.nextInt();
        System.out.println("Now, insert the grade of 2o bimester:");
        double secondGrade = teclado.nextInt();
        System.out.println("Please insert the grade of 3o bimester");
        double thirdGrade = teclado.nextInt();
        System.out.println("Please insert the grade of 4o bimester");
        double fourthGrade = teclado.nextInt();
        double mediaOfSemester = (firstGrade + secondGrade + thirdGrade + fourthGrade) / 4;
        System.out.println("The media of semester are " + mediaOfSemester);
        // ADICIONAR TRATAMENTO ÀS NOTAS

    }
}
