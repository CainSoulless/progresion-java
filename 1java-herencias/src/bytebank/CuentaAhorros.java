package bytebank;

public class CuentaAhorros extends AbstractCuenta {
	
	public CuentaAhorros(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}

}
