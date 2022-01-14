package br.com.alexandre.mercado.controller;

import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.alexandre.mercado.model.Login;
import br.com.alexandre.mercado.repository.LoginRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
public class LoginController {
    private final LoginRepository loginRepository;

    @GetMapping("api/Login")
    public List<Login> getAllPlaylist() {
        return loginRepository.findAll();
    }


    @PostMapping(value = "api/logar")
    public String postMethod(@RequestBody Login entity) {
        return "/login";
    }

}
