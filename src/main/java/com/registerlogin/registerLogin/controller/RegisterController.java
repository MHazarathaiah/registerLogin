package com.registerlogin.registerLogin.controller;

import com.registerlogin.registerLogin.model.Register;
import com.registerlogin.registerLogin.repository.RegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@CrossOrigin(origins = "http://localhost:4200")
public class RegisterController {

    @Autowired
    private RegisterRepository registerRepository;

    @GetMapping (value="/v1/healthCheck")
    public String getHealthCheck(){
        return "Service is Up";
    }

    @PostMapping ("/register")
    public ResponseEntity<Register> registerUserInfo(@RequestBody Register register) {
        System.out.println("Calling registerUserInfo:-->");
        return ResponseEntity.ok(registerRepository.save(register));
    }

    @GetMapping ("/register")
    public ResponseEntity<List<Register>> getUserInfo() {
        System.out.println("Calling getUserInfo:-->");
        return ResponseEntity.ok(registerRepository.findAll());
    }

}
