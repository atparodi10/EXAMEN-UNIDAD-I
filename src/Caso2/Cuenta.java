package Caso2;

public class Cuenta {
    private String numeroCuenta;
    private Cliente cliente;
    private double saldo;

    public Cuenta(String numeroCuenta, Cliente cliente, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.cliente = cliente;
        this.saldo = saldoInicial;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getSaldo() {
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

    public boolean retirar(double monto) {
        if (monto <= 0) {
            System.out.println("Error: el monto a retirar debe ser mayor que 0.");
            return false;
        }

        if (monto > saldo) {
            System.out.println("Error: No tienes fondos suficientes.");
            return false;
        }

        saldo -= monto;
        System.out.println("Operacion de retiro completada correctamente.");
        return true;
    }

    public void consultarSaldo() {
        System.out.println("Datos de la cuenta:");
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Numero de cuenta: " + numeroCuenta);
        System.out.println("Saldo actual: C$" + saldo);
    }
}

