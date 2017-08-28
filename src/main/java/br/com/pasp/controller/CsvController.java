package br.com.pasp.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.pasp.model.RegAgenda;
import br.com.pasp.util.Arquivo;

@Controller
public class CsvController {

	@Autowired
	private Arquivo arquivo;

	@RequestMapping("/")
	public String home() {
		return "redirect:/csv";
	}

	@RequestMapping("/csv")
	public String listaEventos(Model model, HttpServletRequest request) throws IOException {

		List<RegAgenda> lista = new Arquivo().lerCSV();

		model.addAttribute("csv", lista);
		return "home";
	}

	@RequestMapping(value = "inserir", method = RequestMethod.POST)
	public String addUsuario(HttpServletRequest request)
			throws IOException {	
		
		arquivo = new Arquivo();
		arquivo.gravarCSV(new RegAgenda(request.getParameter("nome"), request.getParameter("end"),
			request.getParameter("tel"), request.getParameter("email")));

		return "redirect:/";

	}

}
