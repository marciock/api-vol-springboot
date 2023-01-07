package med.vol.api.DTO;

import lombok.Getter;

@Getter
public class CadastroMedicoDTO {

    private String nome;
    private String email;

    private String crm;

    private String especialidade;
    private CadastroEnderecoDTO endereco;

}
