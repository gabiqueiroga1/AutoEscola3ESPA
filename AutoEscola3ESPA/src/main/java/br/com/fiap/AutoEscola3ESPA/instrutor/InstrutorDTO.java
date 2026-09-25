package br.com.fiap.AutoEscola3ESPA.instrutor;

import br.com.fiap.AutoEscola3ESPA.endereco.EnderecoDTO;

public record InstrutorDTO(
        String nome,
        String email,
        String telefone,
        String cnh,
        String especialidade,
        EnderecoDTO endereco) {
}
