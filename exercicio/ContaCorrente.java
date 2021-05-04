package exercicio;

public class ContaCorrente extends Conta {
	
		private double saldo;
		
	  public void calcularRendimento() {
		    double saldoAtual = getSaldo();
		    double rendimento = saldoAtual * 0.01;
		    setSaldo(saldoAtual + rendimento);
		  }
		public ContaCorrente() {
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
	  public String getTipo() {
		  
		  return "Conta Corrente";
		  
	  }

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	  
	  
	  
	  
}
