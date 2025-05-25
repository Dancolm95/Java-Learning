package oop04;

public class CuentaBancaria {
  private int saldo;

public CuentaBancaria(int saldo) {
  this.saldo = saldo;
  }
public int depositar(int monto) {
  saldo = monto + saldo;
  return saldo;
}
public int retirar (int monto) {
  if (monto <= saldo) {
    saldo = saldo - monto;
  } else {
     System.out.println("No cuentas con saldo suficiente");
  }
  
  return saldo;
}

public void consultarSaldo() {
  System.out.println("Tu saldo actual es: " + saldo);
}

public int getSaldo() {
  return saldo;
}

}
