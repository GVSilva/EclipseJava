package atividades;

import java.util.Calendar;

public class Tempo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Calendar entrada =  Calendar.getInstance();
	int hora = entrada.get(Calendar.HOUR_OF_DAY);
	int min = entrada.get(Calendar.MINUTE);
	int sec = entrada.get(Calendar.SECOND);
	
	System.out.println("Hora: "+ hora + " Minutos: " + min + " Segundos: " + sec );
	
	int hoje = entrada.get(Calendar.DATE);
	int mes = entrada.get(Calendar.MONTH);
	int ano = entrada.get(Calendar.YEAR);
	
	System.out.println("Hoje: " +  hoje + " Mês: " + mes + " Ano: " + ano);
	
	}

}
