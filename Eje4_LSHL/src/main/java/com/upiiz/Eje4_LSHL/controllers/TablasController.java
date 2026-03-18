package com.upiiz.Eje4_LSHL.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TablasController {

    @GetMapping("/tecweb-4cm2/departamental1/Eje_LSHL_04")
    public String mostrarTablas()
    {
        return "Eje_LSHL_04";
    }
}