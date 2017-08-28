package br.com.pasp.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import br.com.pasp.model.RegAgenda;

@Component
public class Arquivo {

	private static String url = System.getProperty("user.home") + "/arquivo.csv";	
	
	public Arquivo() {}	
	

	public void gravarCSV(RegAgenda agenda){

		try {	
			BufferedWriter saida = new BufferedWriter(new FileWriter(getUrl(), true));			
			saida.write(agenda.getNome() + "\t");
			saida.write(agenda.getEnd() + "\t");
			saida.write(agenda.getTel() + "\t");
			saida.write(agenda.getEmail());
			saida.newLine();
			saida.flush();
			saida.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<RegAgenda> lerCSV() {
		try {			
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(getUrl())));
			String linha = br.readLine();
			List<RegAgenda> lista = new ArrayList<RegAgenda>();
			while(linha != null) {
				
				String [] agendar = linha.split("\t");
				lista.add(new RegAgenda(agendar[0],agendar[1],  agendar[2],  agendar[3]));				
				linha = br.readLine();
			}
			br.close();	
			return lista;
					
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;	
		
	}

	public String getUrl() {
		return url;
	}
	
}
