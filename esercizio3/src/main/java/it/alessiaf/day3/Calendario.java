package it.alessiaf.day3;

import java.util.ArrayList;
import java.util.List;

public class Calendario {
	
	private String nome;
	private String decrizione;
	private List<Evento> eventi = new ArrayList<Evento>();
	
	public Calendario() {
	
	}

	public Calendario(String nome, String decrizione, List<Evento> eventi) {
		this.nome = nome;
		this.decrizione = decrizione;
		this.eventi = eventi;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDecrizione() {
		return decrizione;
	}

	public void setDecrizione(String decrizione) {
		this.decrizione = decrizione;
	}

	public List<Evento> getEventi() {
		return eventi;
	}

	public void setEventi(List<Evento> eventi) {
		this.eventi = eventi;
	}
	
	public void addEvento(Evento e) {
		eventi.add(e);
	}
	
	public void removeEvento(Evento e) {
		for (int i = 0; i<eventi.size()-1; i++) {
			if (e.getNome() == eventi.get(i).getNome() && 
					e.getGiorno() == eventi.get(i).getGiorno() &&
					e.getMese() == eventi.get(i).getMese() &&
					e.getAnno() == eventi.get(i).getAnno()) {
				eventi.remove(e);
			}
		}
		
	}
	
	public void vediEventi() {
		for (int i = 0; i<eventi.size(); i++) {
			System.out.println("Nome dell'evento: "+eventi.get(i).getNome()+
					'\n'+"Descrizione dell'evento: "+eventi.get(i).getDescrizione()+
					'\n'+"Giorno dell'evento: "+eventi.get(i).getGiorno()+
					'\n'+"Mese dell'evento: "+eventi.get(i).getMese()+
					'\n'+"Anno dell'evento: "+eventi.get(i).getAnno());
		}
		
	}
}
