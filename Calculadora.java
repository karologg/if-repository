import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        Calculadora calc = new Calculadora();
        
        int resultado = 0;
        System.out.println ("Bem-vindo à calculadora de karolo!");
        System.out.println (" ");
        
        System.out.println ("Defina a operação desejada (adicao, multiplicacao ou divisao)");
        String operation = myObj.nextLine();
        
        System.out.println ("Digite o número: ");
        int p1 = myObj.nextInt();
        
        System.out.println ("Digite o segundo número: ");
        int p2 = myObj.nextInt();
        
        if (operation.equals("adicao")) {
            resultado = calc.adic(p1, p2);
        } else if (operation.equals("multiplicacao")) {
            resultado = calc.mult(p1, p2);
        } else if (operation.equals("divisao")) {
            resultado = calc.div(p1, p2);
        } else {
            System.out.println ("houve algum erro no input.");
            resultado = 0;
        }
        
        System.out.println ("   ");
        System.out.println ("O resultado da "+operation+" dos números "+p1+" e "+p2+" é "+resultado);
    }
}

public class Calculadora {
    
    public int adic(int p1, int p2) {
        return p1 + p2;
    }
    
    public int mult(int p1, int p2) {
        return p1 * p2;
    }
    
    public int div(int p1, int p2) {
        if (p2 == 0) {
            System.out.println ("não é possível dividir por 0.");
            return 0;
        }
        else {
            return p1 / p2;
        }
    }
}
