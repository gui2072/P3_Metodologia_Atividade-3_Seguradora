package seguradora;

public class ContratoEmpresarial {
    private PessoaJuridica cliente;
    private int numeroFuncionarios;
    private int ramo;// 1- comércio, 2- indústria 3- agropecuária.
    private int numeroVisitas;
	private double valorImovel = 0;
	private double valorSeguro = 0;


    public void printContrato(){
        Console.clear();
        System.out.printf("\n  Contrato Juridico\n\n  Razão Social: %s\n  CNPJ da empresa: %s\n", this.cliente.getRazaoSocial(), this.cliente.getCnpj());

        if (this.ramo== 1) {
            System.out.print("  Ramo: Comércio");
        } else if (this.ramo == 2) {
            System.out.print("  Ramo: Indústrial");
        } else {
            System.out.print("  Ramo: Agropecuário");
        }

		System.out.printf("\n  Valor do imovel: %10.2f  Valor do Seguro: %10.2f", this.valorImovel, this.valorSeguro);
    }
    public void cadastrar(){
        this.cliente = new PessoaJuridica();
        this.cliente.cadastrar();
        //this.endereco = Input.stringLettersLimited("Contrato judicial","Tente novamente, utilize apenas letras","Digite a rua que o imovel se encontra", 50);
        do {
            this.ramo = Input.intPrint("Contrato judicial\n\n  Selecione o ramo que o imovel se encontra:\n\n  1 - Comercial\n  2 - Industrial\n  3 - Agropecuário", "Tente novamente,opção invalida", "Digite uma opção", this.ramo);
            if (this.ramo < 1 || this.ramo > 3) {
                this.ramo = -666;
            }
        } while (this.ramo < 1 || this.ramo > 3);
        this.valorImovel = Input.doublePrint("Contrato judicial", "Tente novamente", "Digite o valor do imovel");
        calculadorValorSeguro();
    }

    public void calculadorValorSeguro() {
        this.valorSeguro += this.valorImovel * 0.04;
        this.valorSeguro += this.valorImovel + (0.002 * (int)(this.numeroFuncionarios/10));
        this.valorSeguro += this.valorImovel + (0.003 * (int)(this.numeroVisitas/200));
        if(ramo == 2)this.valorSeguro += this.valorImovel * 0.01;
        else this.valorSeguro += this.valorImovel * 0.005;


    }

	/**
	* Returns value of cliente
	* @return
	*/
	public PessoaJuridica getCliente() {
		return cliente;
	}

	/**
	* Sets new value of cliente
	* @param
	*/
	public void setCliente(PessoaJuridica cliente) {
		this.cliente = cliente;
	}

	/**
	* Returns value of numeroFuncionarios
	* @return
	*/
	public int getNumeroFuncionarios() {
		return numeroFuncionarios;
	}

	/**
	* Sets new value of numeroFuncionarios
	* @param
	*/
	public void setNumeroFuncionarios(int numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}

	/**
	* Returns value of ramo
	* @return
	*/
	public int getRamo() {
		return ramo;
	}

	/**
	* Sets new value of ramo
	* @param
	*/
	public void setRamo(int ramo) {
		this.ramo = ramo;
	}

	/**
	* Returns value of numeroVisitas
	* @return
	*/
	public int getNumeroVisitas() {
		return numeroVisitas;
	}

	/**
	* Sets new value of numeroVisitas
	* @param
	*/
	public void setNumeroVisitas(int numeroVisitas) {
		this.numeroVisitas = numeroVisitas;
	}

	/**
	* Returns value of valorImovel
	* @return
	*/
	public double getValorImovel() {
		return valorImovel;
	}

	/**
	* Sets new value of valorImovel
	* @param
	*/
	public void setValorImovel(double valorImovel) {
		this.valorImovel = valorImovel;
	}

	/**
	* Returns value of valorSeguro
	* @return
	*/
	public double getValorSeguro() {
		return valorSeguro;
	}

	/**
	* Sets new value of valorSeguro
	* @param
	*/
	public void setValorSeguro(double valorSeguro) {
		this.valorSeguro = valorSeguro;
	}
}
