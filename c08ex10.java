package src.conteudo8;

import java.util.Scanner;

public class c08ex10 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("informe o número de insumos: ");
        int numInsumos = teclado.nextInt();
        String nomeInsumoMaisCaro = "";
        double precoUnitarioMaisCaro = 0;
        double custoTotal = 0;

        for(int cont = 1; cont <=numInsumos; cont++) {
            System.out.println("Insumo #" + cont + ":");
            System.out.print("Nome: ");
            String nomeInsumo = teclado.next();
            System.out.print("Preço unitário: ");
            double precoUnitario = teclado.nextDouble();
            System.out.print("Quantidade: ");
            double quantidade = teclado.nextDouble();

            double custoParcial = precoUnitario * quantidade;
            custoTotal += custoParcial;

            System.out.println("Custo parcial: "+ custoParcial);

            if (custoParcial > precoUnitarioMaisCaro) {
                nomeInsumoMaisCaro = nomeInsumo;
                precoUnitarioMaisCaro = custoParcial;
            }
        }

        double mediaCustosParciais = custoTotal / numInsumos;

        System.out.println("Custo total: "+ custoTotal);
        System.out.println("Média dos custos parciais: "+ mediaCustosParciais);
        System.out.println("Insumo de maior custo parcial: "+ nomeInsumoMaisCaro);

        teclado.close();
    }
}
