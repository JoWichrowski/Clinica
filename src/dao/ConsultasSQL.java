package dao;

public class ConsultasSQL {
	
	public static String insert(String tabela, String ... campos){
		String consulta = "INSERT INTO " + tabela + " (";
		String valores = "(";
		for(int i = 0; i< campos.length; i++){
			consulta += campos[i];
			valores += "?";
			
			if(i <= campos.length - 2){
				consulta += ", ";
				valores  += ", "; 
			}
			
		}
		
		valores += ")";
		
		consulta += ")";
		consulta += " VALUES " + valores;
		
		return consulta;		
	}

}
