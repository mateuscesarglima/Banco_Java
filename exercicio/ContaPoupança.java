package exercicio;

public class ContaPoupança extends Conta {
	  private static double porcentagemSelic;
	  private double saldo;
	  public void calcularRendimento() {
	    //Conta Poupança tem rendimento de 2% a.a. se a Selic for maior que 10% a.a., ou 10% da Selic caso contrário.

	    double saldoAtual = getSaldo();  
	    double rendimento;

	    if (porcentagemSelic > 10) {
	      rendimento = saldoAtual * (0.02/12);
	    }
	    else {
	      rendimento = porcentagemSelic * 0.10;
	    }

	    setSaldo(saldoAtual + rendimento);
	  }
		public ContaPoupança() {
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
	    return "Conta Poupanca";
	  }

	  public static double getSelic() {
	    return porcentagemSelic;
	  }

	  public static void setSelic(double selic) {
	    porcentagemSelic = selic;
	  }
	  
		public double getSaldo() {
			return saldo;
		}
		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}
	  

}
