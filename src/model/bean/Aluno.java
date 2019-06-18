package model.bean;

public class Aluno {
	
	private int id;
    private String nome;
    private double notaum;
    private double notadois;

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNotaum() {
		return notaum;
	}

	public void setNotaum(double notaum) {
		this.notaum = notaum;
	}

	public double getNotadois() {
		return notadois;
	}

	public void setNotadois(double notadois) {
		this.notadois = notadois;
	}

}
