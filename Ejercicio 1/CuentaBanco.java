import java.util.Scanner;

class CuentaBanco {
    private String titular;
    private double cantidad;

    // Constructores
    public CuentaBanco(String titular) {
        this.titular = titular;
    }

    public CuentaBanco(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    // Métodos get y set
    public String getTitular() {
        return titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    // Método para ingresar dinero
    public void ingresar(double cantidad) {
    	if (cantidad > 0) {
            if (cantidad <= this.cantidad) {
                this.cantidad -= cantidad;
            } else {
                System.out.println("No es posible retirar esa cantidad. Fondos insuficientes.");
            }
        } else {
            System.out.println("La cantidad a retirar debe ser un número positivo.");
        }
    }

    // Método para retirar dinero
    public void retirar(double cantidad) {
        if (this.cantidad - cantidad < 0) {
            this.cantidad = 0;
        } else {
            this.cantidad -= cantidad;
        }
    }

    // Método toString
    public String toString() {
        return "Titular: " + titular + ", Cantidad: " + cantidad;
    }
}