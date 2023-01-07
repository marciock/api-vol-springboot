package med.vol.api.medico;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.vol.api.endereco.Endereco;

@Table(name= "medicos")
@Entity(name= "Medico")
@Getter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Medico {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(insertable=false, updatable=false)
    private Long id;
    private String nome;
    private String email;

    private String telefone;
    private String crm;
    @Enumerated(EnumType.STRING)
    private Especialidade especialidade;

    @Embedded
    private Endereco endereco;

    public Medico(DadosCadastroMedico dto) {
        this.nome = dto.nome();
        this.email = dto.email();
        this.telefone= dto.telefone();
        this.crm = dto.crm();
        this.endereco = new Endereco(dto.endereco());
        this.especialidade = dto.especialidade();
    }

    public void atualizarInformacoes(DadosAtualizacaoMedico dto) {
       if(dto.nome() != null) {
           this.nome = dto.nome();
       }
        if(dto.telefone() != null) {
            this.telefone = dto.telefone();
        }

    }
}
