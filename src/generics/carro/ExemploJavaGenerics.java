package generics.carro;

import generics.carro.Carro;
import generics.carro.Toyota;
import generics.carro.Honda;

import java.util.ArrayList;
import java.util.List;

public class ExemploJavaGenerics {

        public static void main(String args[]) {

        List<Carro> carros = new ArrayList<>();
        carros.add(new Honda());
        carros.add(new Toyota());
        imprimirCarros(carros);

}
    public static void imprimirCarros(List<? extends Carro> lista) {
        for (Carro carro : lista) {
            System.out.println(carro);
        }
    }
}
