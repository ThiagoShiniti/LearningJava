import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("| Calculadora de IMC |");
    Scanner sc = new Scanner(System.in);    

System.out.print("Insira seu peso: ");
    double peso = sc.nextDouble();

System.out.print("Insira sua altura: ");
    double altura = sc.nextDouble();

    double imc = peso/Math.pow(altura,2);

    System.out.printf("Seu IMC é %.2f\n",imc);
    if(imc < 18.5){
    System.out.println("Você está abaixo do peso.");
    }

    else if (imc >= 18.5 && imc <= 24.9){
        System.out.println("Você está no seu peso normal.");
    }

    else if (imc >= 25 && imc <=29.9){
        System.out.println("Você está em sobrepeso.");
    }

    else if (imc >= 30 && imc <= 34.9){
        System.out.println("Você está em Obesidade Grau I.");
  }
    else if (imc >= 35 && imc <= 39.9){
        System.out.println("Você está em Obesidade Grau II.");
  }
    else if (imc >= 40){
        System.out.println("Você está em Obesidade Grau III ou Mórbida.");
  }


    sc.close();

  }}