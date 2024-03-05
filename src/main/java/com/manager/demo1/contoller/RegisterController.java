package com.manager.demo1.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manager.demo1.exception.ResourceNotFoundException;
import com.manager.demo1.modal.Member;
import com.manager.demo1.modal.Register;
import com.manager.demo1.repository.Registerrepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class RegisterController {

    @Autowired
    private Registerrepository registerRepository;
    @GetMapping("/User")
    public ResponseEntity<List<Register>> getUser() {
        List<Register> users = registerRepository.findAll();
        return ResponseEntity.ok(users);
    }

    @PostMapping("/User/create")
    public ResponseEntity<Register> CreateUser(@RequestBody Register register) {
        System.out.println("Data being posted: " + register);
        
        // Save the new Register entity
        Register savedRegister = registerRepository.save(register);
        
        return new ResponseEntity<>(savedRegister, HttpStatus.CREATED);
    }

}



