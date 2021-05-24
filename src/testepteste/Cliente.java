package testepteste;

import pteste.Construtor;

import java.util.LinkedList;
import java.util.List;

public class Cliente {
    public static void main (String args[]){

        //Chamada de construtor vasio / teste;
        Construtor teste = new Construtor();
        System.out.println(" Isso é um teste mostrando construtor vasio:  " + teste);
        System.out.println();

        Construtor cadastro1 = new Construtor("Vanderlei",062,"Duster",790);
        Construtor cadastro2 = new Construtor("José", 061, "Sandero", 560);

        List<Construtor> listaCadastro = new LinkedList<>();

        listaCadastro.add(cadastro1);
        listaCadastro.add(cadastro2);

        for (Construtor cadastrados : listaCadastro){
            System.out.println(cadastrados);
        }

    }
}
