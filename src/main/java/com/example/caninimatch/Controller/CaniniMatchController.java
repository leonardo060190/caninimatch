package com.example.caninimatch.Controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")

public class CaniniMatchController {
    @GetMapping("/hello")
    public boolean HelloWorld(){
        //executa o código
        return true;
    }

    @GetMapping("/abacate")
    public ArrayList<String> abacate() {
        ArrayList<String> list = new ArrayList<String>();
       
        list.add("Oi");
        list.add("Olá");
        
        return list;

}
}
