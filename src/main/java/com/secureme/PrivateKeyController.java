package com.secureme;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/metadata/private-key")
public class PrivateKeyController {

    @GetMapping
    public ResponseEntity<String> getPrivateKey(@RequestHeader("x-auth-user-name") String username){
        return new ResponseEntity<>("I am Authorized", HttpStatus.OK);
    }
}
