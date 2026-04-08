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

        int opcion;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\nSaldo actual: C$" + cuenta.consultarSaldo());
                    System.out.println(cuenta.mostrarDatos());
                    break;

                case 2:
                    System.out.print("Ingrese el monto a depositar: ");
                    double deposito = scanner.nextDouble();
                    cuenta.depositar(deposito);
                    break;

                case 3:
                    System.out.print("Ingrese el monto a retirar: ");
                    double retiro = scanner.nextDouble();
                    cuenta.retirar(retiro);
                    break;

                case 4:
                    System.out.println("Gracias por utilizar el sistema bancario, tenga un buen dia...");
                    break;

                default:
                    System.out.println("Opcion invalida. Intenta nuevamente.");
            }

        } while (opcion != 4);

        scanner.close();
    }
}