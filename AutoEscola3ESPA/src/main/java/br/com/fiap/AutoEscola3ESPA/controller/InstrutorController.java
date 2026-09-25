package br.com.fiap.AutoEscola3ESPA.controller;

import br.com.fiap.AutoEscola3ESPA.instrutor.Instrutor;
import br.com.fiap.AutoEscola3ESPA.instrutor.InstrutorDTO;
import br.com.fiap.AutoEscola3ESPA.instrutor.InstrutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/instrutor")
public class InstrutorController {
    @Autowired
    private InstrutorRepository repository;


    @PostMapping
    public void cadastrarInstrutor(@RequestBody InstrutorDTO corpo){
        Instrutor instrutor = new Instrutor(corpo);
        repository.save(instrutor);
    }
}
