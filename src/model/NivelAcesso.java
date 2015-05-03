package model;

public enum NivelAcesso {
	
	ADMINISTRADOR(1),
	MEDICO(2),
	SECRETARIA(3);
	
	private int nivel;
	
	private NivelAcesso(int nivel){
		this.nivel = nivel;
	}
	
	public int getNumeroNivelAcesso(){
		return nivel;
	}
	
	public static NivelAcesso getNivelPorNumero(int numero){
		for(NivelAcesso nivel : NivelAcesso.values()){
			if(numero == nivel.getNumeroNivelAcesso()){
				return nivel;
			}
		}
		
		throw new IllegalArgumentException();
	}

}
