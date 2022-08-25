package consultorio;

public class Médico {
	//atributos
	private String nombre;
	private String apellido;
	private String especialidad;
	
	//constructor
	public Médico(String nombre, String apellido) {
			this.nombre = nombre;
			this.apellido = apellido;;
	}
	
	public String traerNombreCompleto(){
		String resultado;
		resultado = nombre+" "+apellido;
		return resultado;
	}
	
	public double calcularIMC(Paciente paciente) {
		return paciente.getPeso()/(paciente.getEstatura()*paciente.getEstatura());
	}
	
	//setter y getter
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
}
