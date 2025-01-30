public class Personagem {
  String nome;
  int nivel;
  int saude;

  public Personagem() {
    System.out.println ("Construtor padrão de Personagem chamado.");
    nome = "Desconhecido";
    nivel = 1;
    saude = 100;
  }

  public Personagem (String nome, int nivel, int saude) {
    System.out.println ("Construtor sobrecarregado de Personagem chamado.");
    this.nome = nome;
    this.nivel = nivel;
    this.saude = saude;
  }

  public void mostrarInfo() {
    System.out.println ("Nome: "+nome+ ", Nível: "+nivel+", Saúde: "+saude);
  }

public class Guerreiro extends Personagem {
  String arma;

  public Guerreiro() {
    super();
    arma = "Espada de Aço";
    System.out.println ("Construtor padrão de Guerreiro chamado.");
  }

  public Guerreiro (String nome, int nivel, int saude, String arma) {
    super(nome, nivel, saude);
    this.arma = arma;
    System.out.println ("Construtor sobreccarregado de Guerreiro chamado.");
  }

  public void mostrarInfo() {
    super.mostrarInfo();
    System.out.println ("Arma: "+arma);
  }
}

  public class Mago extends Personagem {
    String magia;

    public Mago() {
      super();
      magia = "Fogo";
    }

    public Mago (String nome, int nivel, int saude, String arma) {
      super(nome, nivel, saude);
      this.magia = magia;
    }

  public void mostrarInfo() {
    super.mostrarInfo();
    System.out.println ("Magia: "+magia);
  }
