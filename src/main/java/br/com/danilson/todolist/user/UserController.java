package br.com.danilson.todolist.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

<<<<<<< HEAD
import at.favre.lib.crypto.bcrypt.BCrypt;

=======
>>>>>>> 3957c9a1b6693768dd993c0bf4bb9766177e13d6
@RestController // definição de tipo de requisição
@RequestMapping("/users") // definição de rota
public class UserController {
    
    @Autowired
    private IUserRepository userRepository;

    @PostMapping("/") // definição de caminho post
    public ResponseEntity create(@RequestBody UserModel userModel) {
      var user = this.userRepository.findByUsername(userModel.getUsername());
      
      if(user != null){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("usuario já existe");
      }
<<<<<<< HEAD
      var passwordHashred = BCrypt.withDefaults().hashToString(12, userModel.getPassword().toCharArray());

      userModel.setPassword(passwordHashred);
=======
>>>>>>> 3957c9a1b6693768dd993c0bf4bb9766177e13d6
      
      var userCreated =  this.userRepository.save(userModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(userCreated);
    }
}
