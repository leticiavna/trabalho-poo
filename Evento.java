import java.text.SimpleDateFormat;
import java.util.*;

public class Evento {
	private String nomeArtista;
	private String turne;
	private List<Data> datas = new ArrayList<>();
	private List<Local> locais = new ArrayList<>();
	private List<Ingresso> ingressos;

	// Construtor de Evento
	public Evento(String nomeArtista, String turne, List<Ingresso> ingressos){
		this.nomeArtista = nomeArtista;
		this.turne = turne;
		this.ingressos = ingressos;
	}

	// GETS para retornar os valores da classe
	public String getNomeArtista() {
		return nomeArtista;
	}

	public String getTurne(){
		return this.turne;
	}

	// Retorna todos os locais disponíveis.
	public void getLocais() {
		int tamanhoLista = this.locais.size();
		for(int i = 0; i < tamanhoLista; i++){
			System.out.println("Local: " + this.locais.get(i).getNome() + ", Data: " +
				this.datas.get(i).getData());
		}
		System.out.println("\n");
	}

	// Retorna um único local que é o selecionado
	public String getLocalEscolhido(int i){
		return ("Local: " + this.locais.get(i).getNome() + ", Data: " +
		this.datas.get(i).getData());
	}
	
	// Retorna informações do evento
	public String getInformacoes(){
		return ("Nome: " + getNomeArtista() + " - Turnê: " + getTurne() + ".");
	}

	// Retorna todos os ingressos disponíveis
	public void getIngressosAtuais(){
		for (Ingresso i : ingressos){
			System.out.println("Tipo: " + i.getTipoIngressonoBilhete() + ", valor: R$" + i.getValorIngressoNoBilhete());
		}
	}

	// Retorna um único ingresso que é o escolhido
	// *****************************************
	// EM PROGRESSO
	// *******************************************
	public String getIngressoEscolhido(Ingresso i){
		return ("Tipo: " + i.getTipoIngressonoBilhete() + ", valor: R$" + i.getValorIngressoNoBilhete());
	}

	// Função para adicionar locais e datas em um evento (usada na main)
	public void criaLocalData(int ano, int mes, int dia, String local){
		this.datas.add(new Data(dia, mes, ano));
		this.locais.add(new Local(local));
	}
}


