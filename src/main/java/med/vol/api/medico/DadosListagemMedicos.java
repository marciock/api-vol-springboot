package med.vol.api.medico;

public record DadosListagemMedicos(

        Long id,
        String nome,
        String email,
        String crm,
        Especialidade especialidade
)
{
    public DadosListagemMedicos(Medico medico){
        this(medico.getId(), medico.getNome(), medico.getCrm(), medico.getEmail(), medico.getEspecialidade());
    }
}
