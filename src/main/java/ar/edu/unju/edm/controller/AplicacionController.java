package ar.edu.unju.edm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AplicacionController {
	@GetMapping("/home")
	public String iniciarAplicacion() {
		return "index";
	}
	@GetMapping("/fixture")
	public String iniciarFixture() {
		return "fixture";
	}
	@GetMapping("/teams")
	public String iniciarEquipos() {
		return "equipos";
	}
}
