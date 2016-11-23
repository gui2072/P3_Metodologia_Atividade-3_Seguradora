package seguradora;

public class ContratoResidencial{
    private PessoaFisica cliente;
    private String endereco;
    private int zona = 1; // 1-urbana 2-suburbana 3-rural
    private boolean tipo; // true - apartamento  false - casa
    private double valorImovel = 0;
    private double valorSeguro = 0;

    public void printContrato(){
        Console.clear();
        System.out.printf("\n  Contrato residencial\n\n  Nome do cliente: %s\n  Cpf do cliente: %s\n  Endereço do imovel: %s\n", this.cliente.getNome(), this.cliente.getCpf(), this.endereco);

        if (this.zona == 1) {
            System.out.print("  Zona: Urbana   ");
        } else if (this.zona == 2) {
            System.out.print("  Zona: Suburbana");
        } else {
            System.out.print("  Zona: Rural    ");
        }

        if (this.tipo) {
            System.out.print("  Tipo: Apartamento");
        } else {
            System.out.print("  Tipo: Casa       ");
        }
        System.out.printf("\n  Valor do imovel: %10.2f  Valor do Seguro: %10.2f", this.valorImovel, this.valorSeguro);
    }

    public void cadastrar(){
        this.cliente = new PessoaFisica();
        this.cliente.cadastrar();
        this.endereco = Input.stringLettersLimited("Contrato residencial", "Tente novamente, utilize apenas letras", "Digite a rua que o imovel se encontra", 50);
        do {
            this.zona = Input.intPrint("Contrato residencial\n\n  Selecione a zona que o imovel se encontra:\n\n  1 - Urbana\n  2 - Suburbana\n  3 - Rural", "Tente novamente,opção invalida", "Digite uma opção", this.zona);
            if (this.zona < 1 || this.zona > 3) {
                this.zona = -666;
            }
        } while (this.zona < 1 || this.zona > 3);
        this.tipo = Input.confirmacaoBoolean("Contrato residencial", "Apartamento", "Casa", true);
        this.valorImovel = Input.doublePrint("Contrato residencial", "Tente novamente", "Digite o valor do imovel");
        calculadorValorSeguro();
    }

    public void calculadorValorSeguro() {
        this.valorSeguro += this.valorImovel * 0.02;
        if (this.zona == 1) {
            this.valorSeguro += this.valorImovel * 0.01;
        } else if (this.zona == 2) {
            this.valorSeguro += this.valorImovel * 0.005;
        }
        if (!this.tipo) {
            this.valorSeguro += this.valorImovel * 0.005;
        }
    }

	/**
	* Returns value of cliente
	* @return
	*/
	public PessoaFisica getCliente() {
		return cliente;
	}

	/**
	* Sets new value of cliente
	* @param
	*/
	public void setCliente(PessoaFisica cliente) {
		this.cliente = cliente;
	}

	/**
	* Returns value of endereco
	* @return
	*/
	public String getEndereco() {
		return endereco;
	}

	/**
	* Sets new value of endereco
	* @param
	*/
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	/**
	* Returns value of zona
	* @return
	*/
	public int getZona() {
		return zona;
	}

	/**
	* Sets new value of zona
	* @param
	*/
	public void setZona(int zona) {
		this.zona = zona;
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
	* Returns value of tipo
	* @return
	*/
	public boolean isTipo() {
		return tipo;
	}

	/**
	* Sets new value of tipo
	* @param
	*/
	public void setTipo(boolean tipo) {
		this.tipo = tipo;
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
