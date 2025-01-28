public class main {
    public static void main(String[] args) {
            Pessoa hs = new Pessoa ("Hinata Shoyo", 15, "masculino", 1.64f, 51.9f);
            Pessoa kt = new Pessoa ("Kageyama Tobio", 15, "masculino", 1.81f, 66.3f);
            Pessoa tk = new Pessoa ("Tsukishima Kei", 15, "masculino", 1.90f, 68.4f);
        
            hs.apresentar();
            kt.apresentar();
            tk.apresentar();
        
    }
}

public class Pessoa {
    private int idade;
    private String nome;
    private String sexo;
    private float altura;
    private float peso;
    
    public Pessoa(String nome, int idade, String sexo, float altura, float peso) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
    }
    
    public void setNome() {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setIdade() {
        this.idade = idade;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public void setSexo() {
        this.sexo = sexo;
    }
    
    public String getSexo() {
        return sexo;
    }
    
    public void setAltura() {
        this.altura = altura;
    }
    
    public float getAltura() {
        return altura;
    }
    
    public void setPeso() {
        this.peso = peso;
    }
    
    public float getPeso() {
        return peso;
    }
    
    
    public void apresentar() {
        System.out.println ("meu nome é "+getNome()+", tenho "+getIdade()+" anos, sou do sexo "+getSexo()+", tenho "+getAltura()+"m de altura e peso "+getPeso()+"kg.");
    }
    public static void main(String[] args) {
        Pessoa hs = new Pessoa ("Hinata Shoyo", 15, "masculino", 1.64f, 51.9f);
        Pessoa kt = new Pessoa ("Kageyama Tobio", 15, "masculino", 1.81f, 66.3f);
        Pessoa tk = new Pessoa ("Tsukishima Kei", 15, "masculino", 1.90f, 68.4f);
        
        hs.apresentar();
        kt.apresentar();
        tk.apresentar();
        
    }
}
