import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Digite o primeiro salário: ");
        String salario01 = sc.next().replace(",",".");

        System.out.println("Digite o segundo salário: ");
        String salario02 = sc.next().replace(",",".");

        System.out.println("Digite o terceiro salário: ");
        String salario03 = sc.next().replace(",",".");

        double valor01 = Double.parseDouble(salario01);
        double valor02 = Double.parseDouble(salario02);
        double valor03 = Double.parseDouble(salario03);

        double conta = (valor01 + valor02 + valor03) / 3;

        System.out.println("Sua média salarial baseada nos seus 3 últimos salários é:" + conta);

        sc.close();

    }
}