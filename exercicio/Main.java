package exercicio;
import cidadao.CadastroPessoa;
import cidadao.Pessoa;
import cidade.Endereço;
import java.util.Scanner;
import java.util.Random;
public class Main {
	
	private static final String[] CONTAS = {"001","002", "003", "004", "005", "006","007","010","011","012","013","015","020","030"};
    private static final Random RANDOM = new Random();
	
	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		Scanner scanner = new Scanner(System.in);
		CadastroPessoa cadastro = new CadastroPessoa();
		
		int opc = 0;
		while(opc != 8) {
		System.out.println("\n" + "-------Seja bem vindo ao Dinheirus Bank--------" + "\n");
		System.out.println("==========  Informe a operação que deseja:  ==========" + "\n");
		System.out.println("	   [1] Criar conta bancária");
		System.out.println("	   [2] Ver saldo conta");
		System.out.println("	   [3] Ver dados cliente");
		System.out.println("	   [4] Depositar");
		System.out.println("	   [5] Sacar");
		System.out.println("	   [6] Transferir");
		System.out.println("	   [7] Encerrar Conta");
		System.out.println("	   [8] Sair" + "\n");
		System.out.println("Digite a opção que deseja: ");
		opc = scanner.nextInt();
		
		System.out.println("\n");
		
		if(opc == 1) {
			
			Pessoa pessoa = new Pessoa();
			Endereço endereço = new Endereço();
			ContaPoupança cp = new ContaPoupança();
			ContaCorrente cc = new ContaCorrente();
		
			System.out.println("============ Criar Conta Bancária ===========");
			System.out.println("Por favor, em vez de apertar o espaço no teclado, colocar o símbolo '_' como espaçamento. EXEMPLO: 'Mateus_Cesar'" + "\n\n");
			
			
			System.out.println("Informe o seu nome: ");
			String nome = scanner.next();
			pessoa.setNome(nome);
			
			
			System.out.println("Informe o seu CPF: ");
			String cpf = scanner.next();
			pessoa.setCpf(cpf);
			
			
			System.out.println("Informe sua data de nascimento");
			String data_nascimento = scanner.next();
			pessoa.setNascimento(data_nascimento);
			
			
			
			System.out.println("Informe a sua rua: ");
			String rua = scanner.next();
			endereço.setRua(rua);
			
			
		
			System.out.println("Informe o número da sua casa: ");
			int numero = scanner.nextInt();
			endereço.setNumero(numero);
			
			scanner.nextLine();
			
			System.out.println("Informe o seu cep: ");
			String cep = scanner.next();
			endereço.setCep(cep);
			
	
			System.out.println("Informe o tipo de conta que você deseja: " + "\n\n" + "[1] CONTA POUPANÇA" + "\n" + "[2] CONTA CORRENTE");
			
			int tipo = scanner.nextInt();
			
			if(tipo == 1) {
				System.out.println("===== CONTA POUPANÇA =======");
				
				System.out.println("Informe a senha da sua conta: ");
				String senha = scanner.next();
				cp.setSenha(senha);
				
			
				cp.setSelic(10);
				cp.setNum_conta(contaAleatoria());
				pessoa.setPoupança(cp);
				pessoa.setEndereço(endereço);
				cadastro.registrar(pessoa);
				
				System.out.println("O número da sua conta é: " + cp.getNum_conta());
				
			}else if(tipo == 2) {
				
				System.out.println("Informe a senha da sua conta: ");
				String senha = scanner.next();
				cc.setSenha(senha);
				
		
				
				cc.setNum_conta(contaAleatoria());
				pessoa.setCorrente(cc);
				pessoa.setEndereço(endereço);
				cadastro.registrar(pessoa);
				
				System.out.println("O número da sua conta é: " + cc.getNum_conta());
			}
			
			}else if(opc == 2){
				
				System.out.println("======== SALDO CONTA =======" + "\n");
				System.out.println("Digite" + "\n" + "[1] - CONTA POUPANÇA" + "\n" + "[2] - CONTA CORRENTE");
				int tipo = scanner.nextInt();
				System.out.println("Informe a conta que você deseja ver o saldo: ");
				String conta = scanner.next();
				System.out.println("Informe a sua senha: ");
				String senha = scanner.next();
				System.out.println("\n");
				
				for(Pessoa pessoa: cadastro.getPessoas()) {
					if(tipo == 1) {
						if(conta.equals(pessoa.getPoupança().getNum_conta()) ) {
							if(senha.equals(pessoa.getPoupança().getSenha())) {
								
								System.out.println("NOME: " + pessoa.getNome());
								System.out.println("SALDO: " + pessoa.getPoupança().getSaldo());
								
							}
						}
					}else if (tipo == 2) {
						if(conta.equals(pessoa.getCorrente().getNum_conta())){
							if(senha.equals(pessoa.getCorrente().getSenha())) {
								
								System.out.println("NOME: " + pessoa.getNome());
								System.out.println("SALDO: " + pessoa.getCorrente().getSaldo());
							}
						}
					}
				}
				
			}else if(opc == 3) {
				System.out.println("======= DADOS CLIENTE =======");
				System.out.println("Informe a conta que você deseja ver o saldo: ");
				String conta = scanner.next();
				System.out.println("Informe a senha da sua conta: " + "\n");
				String senha = scanner.next();
				System.out.println("Digite" + "\n" + "[1] - CONTA POUPANÇA" + "\n" + "[2] - CONTA CORRENTE" );
				int tipo = scanner.nextInt();

					for(Pessoa pessoa: cadastro.getPessoas()) {
						
						if(tipo == 1){
							if(conta.equals(pessoa.getPoupança().getNum_conta())) {
								if(senha.equals(pessoa.getPoupança().getSenha())) {
									System.out.println(pessoa.toString1());
								}
							}
						}else if(tipo == 2){
							if(conta.equals(pessoa.getCorrente().getNum_conta())) {
								if(senha.equals(pessoa.getCorrente().getSenha())) {
									System.out.println(pessoa.toString2());
								}
							}
						}
					}		
			}else if(opc == 4) {
				
				System.out.println("======= DEPOSITAR =======" + "\n");
				
				System.out.println("Digite" + "\n" + "[1] - CONTA POUPANÇA" + "\n" + "[2] - CONTA CORRENTE");
				int tipo = scanner.nextInt();
				
				System.out.println("Informe a conta em que você deseja depositar: ");
				String conta = scanner.next();
				
				System.out.println("Informe o valor a ser depositado: ");
				double valor = scanner.nextFloat(); 
				
				
				
				try {
					for(Pessoa pessoa: cadastro.getPessoas()) {
						if(tipo == 1) {
							if(conta.equals(pessoa.getPoupança().getNum_conta())) {
								pessoa.getPoupança().depositar(valor);
							}
						}else if(tipo == 2) {
							if(conta.equals(pessoa.getCorrente().getNum_conta())) {
								pessoa.getCorrente().depositar(valor);
							}
						}
					}
					
					System.out.println("Depósito realizado com sucesso!");
				}catch(Exception e) {
					System.out.println("Deu erro no depósito");
				}
				
			}else if(opc == 5) {
					System.out.println("======= SACAR =======" + "\n");
					System.out.println("Digite" + "\n" + "[1] - CONTA POUPANÇA" + "\n" + "[2] - CONTA CORRENTE");
					int tipo = scanner.nextInt();
					System.out.println("Informe a conta que você deseja sacar dinheiro: ");
					String conta = scanner.next();
					System.out.println("Informe o valor a ser sacado: ");
					double valor = scanner.nextFloat();
					System.out.println("Informe a sua senha para confirmar a operação: ");
					String senha = scanner.nextLine();
					try {
						for(Pessoa pessoa: cadastro.getPessoas()) {
							if(tipo == 1) {
								if(conta.equals(pessoa.getPoupança().getNum_conta())) {
									if(senha.equals(pessoa.getPoupança().getSenha())) {
										pessoa.getPoupança().sacar(valor);
									}else{
										System.out.println("Senha incorreta, tente novamente.");
									}
								}else {
									System.out.println("Dados incorretos, tente novamente.");
								}
							}else if(tipo == 2) {
								if(conta.equals(pessoa.getCorrente().getNum_conta())) {
									if(senha.equals(pessoa.getCorrente().getSenha())) {
										pessoa.getCorrente().sacar(valor);
									}
								}
							}
						}
					}catch (Exception e) {
						System.out.println("Erro no saque, favor verificar seu saldo");
				}
			}else if(opc == 6 ) {
				System.out.println("========== TRANSFERÊNCIA ==========");
					System.out.println("Informe o seu CPF");
					String cpf = scanner.next();
					System.out.println("Informe a sua conta: ");
					String conta = scanner.next();
					System.out.println("Informe a conta para qual você deseja transferir: ");
					String conta2 = scanner.next();
					System.out.println("Informe o valor a ser transferido: ");
					double valor = scanner.nextFloat();
					System.out.println("Informe sua senha para confirma a transação: ");
					String senha = scanner.next();
					
					try {
						for(Pessoa pessoa: cadastro.getPessoas()) {
							
							if(cpf.equals(pessoa.getCpf())) {
								if(senha.equals(pessoa.getPoupança().getSenha())) {
									pessoa.getPoupança().sacar(valor);
								}		
							}
								if(conta2.equals(pessoa.getCorrente().getNum_conta())) {
									pessoa.getCorrente().depositar(valor);
									System.out.println("Transferência realizada com sucesso!");
								
							}
						}
					}catch (Exception e) {
						System.out.println("Saldo insuficiente");
					}	
				}else if(opc == 7) {
					System.out.println("======= ENCERRAR CONTA ========");
					System.out.println("Digite" + "\n" + "[1] - CONTA POUPANÇA" + "\n" + "[2] - CONTA CORRENTE");
					int tipo = scanner.nextInt();
					System.out.println("Informe a conta que você deseja encerrar: ");
					String conta = scanner.next();
					System.out.println("Informe a senha da conta para confirmar a ação: ");
					String senha = scanner.next();
					
					for(Pessoa pessoa: cadastro.getPessoas()) {
						if(tipo == 1 ) {
							if(conta.equals(pessoa.getPoupança().getNum_conta())) {
								if(senha.equals(pessoa.getPoupança().getSenha())){
									cadastro.getPessoas().remove(pessoa);
									System.out.println("CONTA REMOVIDA COM SUCESSO!");
								}
							}
						}else if(tipo == 2) {
							if(conta.equals(pessoa.getCorrente().getNum_conta())) {
								if(senha.equals(pessoa.getCorrente().getSenha())){
									cadastro.getPessoas().remove(pessoa);
									System.out.println("CONTA REMOVIDA COM SUCESSO!");
								}
							}
						}
					}			
				}
			}
		}
		public static String contaAleatoria() {
			return CONTAS[RANDOM.nextInt(CONTAS.length)];
		}
	}


	
			
		
	

