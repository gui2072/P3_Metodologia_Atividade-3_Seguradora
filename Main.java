package seguradora;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<PessoaJuridica>  listPessoaJ  = new ArrayList<PessoaJuridica>();
        ArrayList<PessoaFisica>  listPessoaF  = new ArrayList<PessoaFisica>();
        ArrayList<ContratoResidencial>  listContratoR  = new ArrayList<ContratoResidencial>();
        ArrayList<ContratoEmpresarial>  listContratoE  = new ArrayList<ContratoEmpresarial>();


        int op = 0;
        do {
            op = Input.intPrint("Seguradora\n\n  1 - Cadastro de clientes\n  2 - Cadastro de contratos\n  3 - Lista de clientes\n  4 - Lista de contratos\n  5 - Cadastro de sinistro (data e porcentagem deperca)\n  6 - Lista de sinistro (agrupado por contrato)\n  7 - Lista de contratos sem sinistro\n  8 - Persistência com serialização\n\n  0 - Sair", "Opção invalida, tente novamente", "Digite uma opção", op);

            switch (op) {
                case 0:
                Console.clear();
                    break;
                case 1:
                    Console.clear();
                    if (Input.confirmacaoBoolean("Entre com o tipo de pessoa: ","Pessoa Juridica","Pessoa Fisica",true)) {
                      PessoaJuridica cliente = new PessoaJuridica();
                      cliente.cadastrar();
                      listPessoaJ.add(cliente);
                    }else {
                      PessoaFisica cliente = new PessoaFisica();
                      cliente.cadastrar();
                      listPessoaF.add(cliente);
                    }
                    break;
                case 2:
                    if (Input.confirmacaoBoolean("Entre com o tipo de pessoa: ","Residencial","Empresarial",true)){
                      ContratoResidencial contratoR = new ContratoResidencial();
                      contratoR.cadastrar();
                      contratoR.printContrato();
                      if(Input.confirmacaoBoolean("\n  Deseja confirmar o contrato:", "Sim", "Não", false)){
                        listContratoR.add(contratoR);
                      }
                    }else {
                      ContratoEmpresarial contratoE = new ContratoEmpresarial();
                      contratoE.cadastrar();
                      contratoE.printContrato();
                      if(Input.confirmacaoBoolean("\n  Deseja confirmar o contrato:", "Sim", "Não", false)){
                        listContratoE.add(contratoE);
                      }
                    }
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                  break;
                case 8:
                  break;


            }
        } while (op != 0);
    }
}
