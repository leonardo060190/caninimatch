package com.example.caninimatch.Controller;

import org.springframework.web.bind.annotation.GetMapping;

import ch.qos.logback.core.model.Model;

public class RelatorioController {
    @GetMapping("/relatorio")
    public String index(Model model) {
        model.addAttribute("name", "leonardo");
        
}
