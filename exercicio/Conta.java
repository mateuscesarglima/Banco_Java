package exercicio;
import cidadao.Pessoa;
public class Conta {
	
	private double saldo;
	private String num_conta;
	private String tipo;
	
	public Conta() {
		this.saldo = 0;
	}
	public void depositar(double dinheiro) throws DepositoNegativoErro {
		if(dinheiro <= 0) {
			throw new DepositoNegativoErro();
		}
		this.saldo += dinheiro;
	}
	public void sacar(double dinheiro) throws SaldoInsuficienteErro, SaqueErro {
		if(dinheiro < 0) {
			throw new  SaqueErro();
		}
		if(dinheiro > this.saldo) {
			throw new SaldoInsuficienteErro();
		}
		this.saldo -= dinheiro;
	}
	public double getSaldo() {
		return this.saldo;
	}
	public String getNum_conta() {
		return num_conta;
	}
	public void setNum_conta(String num_conta) {
		this.num_conta = num_conta;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
