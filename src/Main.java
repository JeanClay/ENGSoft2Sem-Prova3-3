import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> numeros = new ArrayList<>();
        List<Integer> valores = new ArrayList<>();
        int i, soma = 0, maior = -1, menor = 100;
        Double media;
        //popula lista de string
        for (i = 0; i < 10 ; i++ ){
            numeros.add(i, Integer.toString(i));
        }
        //apresenta lista inicial
        System.out.println(numeros);
        //popula lista de inteiro
        for (i = 0; i < numeros.size(); i++){
            valores.add(i, Integer.parseInt(numeros.get(i)));
        }
        //apresenta lista de inteiros
        System.out.println(valores);
        //calcula media
        for (i = 0; i < valores.size(); i++){
            soma = soma + valores.get(i);
        }
        media = (double) soma /i;
        //apresenta media do valor
        System.out.println(media);
        //apresenta maior valor
        for (i = 0; i < valores.size(); i++){
            if (valores.get(i) > maior){
                maior = valores.get(i);
            }
        }
        System.out.println(maior);
        //apresenta menor valor
        for (i = 0; i < valores.size(); i++){
            if (valores.get(i) < menor){
                menor = valores.get(i);
            }
        }
        System.out.println(menor);
    }
}
