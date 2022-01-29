package entidades;

import java.util.Objects;

public class Curso {
	private Integer codUsuario;

	public Curso(Integer codUsuario) {
		this.codUsuario = codUsuario;
	}

	public Integer getCodUsuario() {
		return codUsuario;
	}

	public void setCodUsuario(Integer codUsuario) {
		this.codUsuario = codUsuario;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codUsuario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Curso other = (Curso) obj;
		return Objects.equals(codUsuario, other.codUsuario);
	}
}
