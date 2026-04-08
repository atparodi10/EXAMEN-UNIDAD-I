package Caso2;

import Caso2.Cliente;
import Caso2.Cuenta;

import java.util.Scanner;

// CESAR

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sistema Bancario: ");

        System.out.print("Ingresa la identificacion del cliente: ");
        String identificacion = scanner.nextLine();

        System.out.print("Ingresa los nombres del cliente: ");
        String nombres = scanner.nextLine();

        System.out.print("Ingresa los apellidos del cliente: ");
        String apellidos = scanner.nextLine();

        System.out.print("Ingresa el numero de cuenta: ");
        String numeroCuenta = scanner.nextLine();

        double saldoInicial;
        do {
            System.out.print("Ingrese el saldo inicial:  ");
            saldoInicial = scanner.nextDouble();

            if (saldoInicial < 0) {
                System.out.println("Error: no es permitido saldos negativos.");
            }
        } while (saldoInicial < 0);

        Cliente cliente = new Cliente(identificacion, nombres, apellidos);
        Cuenta cuenta = new Cuenta(numeroCuenta, cliente, saldoInicial);
    }
}