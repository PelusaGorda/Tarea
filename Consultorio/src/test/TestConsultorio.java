package test;

import consultorio.Médico;
import consultorio.Paciente;

public class TestConsultorio {

	public static void main(String[] args) {
		Médico medico1 = new Médico("Daniel", "López");
		
		Paciente paciente1 = new Paciente("José", "Pérez", 1.80f,85);
		Paciente paciente2 = new Paciente("Jorge", "Fernández", 1.60f,90);
		
		System.out.println("Visita 1:");
		System.out.println("Médico: " + medico1.traerNombreCompleto());
		System.out.println("Paciente: " + paciente1.traerNombreCompleto() + " IMC: " + medico1.calcularIMC(paciente1));
		System.out.println("Paciente: " + paciente2.traerNombreCompleto() + " IMC: " + medico1.calcularIMC(paciente2));
	}
}