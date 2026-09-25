package br.com.fiap.AutoEscola3ESPA.endereco;

public record EnderecoDTO(
        String logradouro,
        String numero,
        String complemento,
        String bairro,
        String cidade,
        String uf,
        String cep) {
}
