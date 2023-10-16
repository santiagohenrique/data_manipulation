package datas;

import java.util.Objects;

public class Data15 {
	private final int dia;
	private final int mes;
	private final int ano;
	private static int quantidadeDiasMes[] = {31,28,31,30,31,30,31,31,30,31,30,31};

	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public int getAno() {
		return ano;
	}

	
	public Data15(int dia, int mes, int ano){
		verificaData(dia, mes, ano);
		this.dia = dia;
		this.mes = mes;
		this.ano =ano;
	}
	
	public Data15(){
		int dia = 1;
	    int mes = 1;
	    int ano = 1900;
		verificaData(dia, mes, ano);
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	
	private void verificaData(int dia, int mes, int ano) {

		if (ano < 1) {
			throw new RuntimeException("Ano invalido");
		}

		if (mes < 1 || mes > 12) {
			throw new RuntimeException("Mes invalido");
		}
		if (anoBissexto()) {
		   Data15.quantidadeDiasMes[1]  = 29;
		}
		if (dia < 1 || dia > Data15.quantidadeDiasMes[mes - 1]) {
			throw new RuntimeException("Dia invalido");
		}
	}
		
	private boolean anoBissexto() {
		if ((ano % 4 == 0) && (ano % 100 != 0)) {
			if (ano % 400 == 0) {
				return false;
			} 
			return true;
		}
		
		return false;
	}

    @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Data15 other = (Data15) obj;
		return ano == other.ano && dia == other.dia && mes == other.mes;
	}
    
    public Data15 somarUmDia() {
    	int dia = this.dia;
    	int mes = this.mes;
    	int ano = this.ano;
    	if (dia + 1 > Data15.quantidadeDiasMes[mes - 1]) {
    		dia = 1;
    		if (mes + 1 > 12) {
    			mes = 1;
    			ano += 1;
    		} else {
    		  mes = mes + 1;	
    		}
    	} else {
    		dia += 1;
    	}
    	return new Data15(dia,mes,ano);
    }

}
