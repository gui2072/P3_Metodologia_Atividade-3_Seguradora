package seguradora;

public class Format{
    static String cpf(String cpf) {
        return String.format("%s.%s.%s-%s", cpf.substring(0,3), cpf.substring(3,6), cpf.substring(6,9), cpf.substring(9,11));
    }

    static String cnpj(String cpf) {
        return String.format("%s.%s.%s/%s-%s", cpf.substring(0,2), cpf.substring(2,5), cpf.substring(5,8), cpf.substring(7,11), cpf.substring(12,14));
    }

    static String cep(String cep) {
        return String.format("%s-%s", cep.substring(0,5), cep.substring(5,8));
    }
}
