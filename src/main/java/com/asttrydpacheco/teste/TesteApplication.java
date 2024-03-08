package com.asttrydpacheco.teste;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class TesteApplication {

	public static void main(String[] args) {
		SpringApplication.run(TesteApplication.class, args);
	}

}

@RestController
class HelloWorldController {
	
	@GetMapping("/hello")
	public String helloWorld() {
		return "Hello World!";
	}
}

@RestController
class BSMController {
	
	@GetMapping("/bsm")
	public List<String> getBSMs() {
		List<String> bsms = new ArrayList<>();
		bsms.add("Análise Comportamental");
		bsms.add("Definição de metas");
		bsms.add("Gestão de desempenho");
		bsms.add("Tomada de decisão baseada em dados");
		bsms.add("Melhoria Contínua");
		bsms.add("Liderança e Comunicação");
		bsms.add("Considerações éticas");
		bsms.add("Envolvimento e capacitação dos funcionários");
		
		return bsms;
	}
}

@RestController
class LearningGoalsController {
	
	@GetMapping("/learning-goals")
	public List<String> getLearningGoals() {
		List<String> learningGoals = new ArrayList<>();
		learningGoals.add("Aprender Spring Boot");
		learningGoals.add("Aprender a manejar minhas finanças");
		learningGoals.add("Aprender sobre SEO e Marketing Digital");
		
		return learningGoals;
	}
}
