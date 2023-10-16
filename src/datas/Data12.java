package datas;

public class Data12 {
	private int dia;
	private int mes;
	private int ano;

	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public int getAno() {
		return ano;
	}

	
	public Data12(int dia, int mes, int ano){
		verificaData(dia, mes, ano);
	}
	
	public Data12(){
		verificaData(01, 01, 1900);
	}
	
	
	private void verificaData(int dia, int mes, int ano) {
		int quantidadeDiasMes[] = {31,28,31,30,31,30,31,31,30,31,30};

		if (ano < 1) {
			throw new RuntimeException("Ano invalido");
		}
		this.ano= ano;

		if (mes < 1 || mes > 12) {
			throw new RuntimeException("Mes invalido");
		}
		this.mes = mes;
		if (anoBissexto()) {
		   quantidadeDiasMes[1]  = 29;
		}
		if (dia < 1 || dia > quantidadeDiasMes[mes - 1]) {
			throw new RuntimeException("Dia invalido");
		}
		this.dia = dia;
	}
	
	public 
	
	
	
	boolean anoBissexto() {
		if ((ano % 4 == 0) && (ano % 100 != 0)) {
			if (ano % 400 == 0) {
				return false;
			} 
			return true;
		}
		
		return false;
	}
	
}
