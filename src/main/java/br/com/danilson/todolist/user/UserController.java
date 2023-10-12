package br.com.danilson.todolist.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // definição de tipo de requisição
@RequestMapping("/users") // definição de rota
public class UserController {
    
    @PostMapping("/") // definição de caminho post
    public void create(@RequestBody UserModel userModel) {
        
        System.out.println(userModel.name);
    }
}
