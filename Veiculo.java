public class Veiculo {
    String tipo;

    public Veiculo() {
        System.out.println ("Veículo criado por construtor padrão.");
    }

    public Veiculo (String tipo) {
        this.tipo = tipo;
        System.out.println("Veículo do tipo: "+tipo+" criado.");
    }
}

public class Carro extends Veiculo {
    public Carro() {
        super();
        System.out.println ("Carro criado com construtor padrão.");
    }

    public Carro (String tipo) {
        super (tipo);
        System.out.println ("Carro do tipo: "+tipo+" criado.");
    }
}

public class Esportivo extends Carro {
    public Esportivo() {
        super();
        System.out.println ("Carro esportivo criado com construtor padrão.");
    }

    public Esportivo (String tipo) {
        super (tipo);
        System.out.println ("Carro esportivo do tipo: "+tipo+" criao.");
    }
}
