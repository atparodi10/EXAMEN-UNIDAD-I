package Caso2;

public class Cuenta {
    private String numeroCuenta;
    private Cliente cliente;
    private double saldo;

    public Cuenta(String numeroCuenta, Cliente cliente, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public double consultarSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Deposito realizado correctamente.");
        } else {
            System.out.println("Error: el monto a depositar debe ser mayor que 0.");
        }
    }

    public double retirar(double monto) {
        if (monto <= 0) {
            System.out.println("Error: el monto a retirar debe ser mayor que 0.");
            return saldo;
        }

        if (monto > saldo) {
            System.out.println("Error: fondos insuficientes.");
            return saldo;
        }

        saldo -= monto;
        System.out.println("Retiro realizado correctamente.");
        return saldo;
    }

    public String mostrarDatos() {
        return "Datos de la cuenta:\n" +
                "Cliente: " + cliente.getNombres() + " " + cliente.getApellidos() + "\n" +
                "Identificacion: " + cliente.getIdentificacion() + "\n" +
                "Numero de cuenta: " + numeroCuenta + "\n" +
                "Saldo actual: C$" + saldo;
    }
}