package med.vol.api.DTO;

import jakarta.persistence.Embeddable;


@Embeddable
public class CadastroEnderecoDTO {
    private Long id;
    private String  logradouro;
    private String    bairro;
    private String   cep;
    private String   cidade;
    private String   uf;
   private Integer  numero;
    private String  complemento;

}
