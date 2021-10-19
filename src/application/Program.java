package application;

import entities.Validator;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu CPF (apenas números): ");
        String preCpf = sc.nextLine();

        if (Validator.isCpf(preCpf) == true) {
            System.out.println("O CPF " + Validator.cpfFinal(preCpf) + " é válido!");
        } else {
            System.out.println("Erro: CPF inválido!");
        }

    }
}
