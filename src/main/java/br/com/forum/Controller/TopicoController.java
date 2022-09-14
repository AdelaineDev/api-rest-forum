package br.com.forum.Controller;



import br.com.forum.Controller.DTO.TopicoDto;
import br.com.forum.model.Curso;
import br.com.forum.model.Topico;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicoController {

    @RequestMapping ("/topicos")
    public List<TopicoDto> lista(){

        Topico topico = new Topico("Dúvida", "Duvida com String", new Curso("Spring", "Programação"));
        return TopicoDto.converter(Arrays.asList(topico, topico, topico));

    }
}
