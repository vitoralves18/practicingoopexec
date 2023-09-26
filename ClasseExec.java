package Desafios;

import java.util.Scanner;

public class ClasseExec {
    public static void main(String[] args) {
        int rp, k, k2;
        String [] br = new String[15]; // apesar de ser br a array é p todos países
        Scanner scanner = new Scanner(System.in);
        Classemãe c1 = new Classemãe();
        ClasseBr c2 = new ClasseBr("Grande", "sei la", "pequeno", "democracia");
        ClasseEsp c3 = new ClasseEsp("Grande", "normal", "normal", "democracia");
        ClasseJp c4 = new ClasseJp("Pequena", "pequeno", "grande", "democracia");

        do {
            System.out.println("|  --FUNCIONALIDADES--   |");
            System.out.println("|                        |");
            System.out.println("|  1) Func. Brasil       |");
            System.out.println("|  2) Func. Japão        |");
            System.out.println("|  3) Func. Espanha      |");
            System.out.println("| Quais você deseja ver? |");
            rp = scanner.nextInt();
        } while(rp<1 || rp>3);

        if(rp==1){
            c2.bossanova();
        }
        else if(rp==2){
            c4.mostravet();
        }
        else if(rp==3){
            c3.colonizador();
        }

        do {
            System.out.println("|  --VISUALIZAÇÃO DE ATRIBUTOS--  |");
            System.out.println("|                                 |");
            System.out.println("|  1) Atrib Brasil                |");
            System.out.println("|  2) Atrib Japão                 |");
            System.out.println("|  3) Atrib Espanha               |");
            System.out.println("|  Quais você deseja ver?         |");
            k = scanner.nextInt();
        } while(k<1 || k>3);

        if(k==1){
            System.out.println("ATRIBUTOS PADRÃO BRASIL");
            System.out.println("A população é: " + c2.getPopulação());
            System.out.println("O território é: " + c2.getTerritório());
            System.out.printf("O regime é:" + c2.getRegime());
        }
        else if(k==2){
            System.out.println("ATRIBUTOS PADRÃO JAPÃO");
            System.out.println("A população é: " + c4.getPopulação());
            System.out.println("O território é: " + c4.getTerritório());
            System.out.printf("O regime é:" + c4.getRegime());
        }
        else if(k==3){
            System.out.println("ATRIBUTOS PADRÃO ESPANHA");
            System.out.println("A população é: " + c3.getPopulação());
            System.out.println("O território é: " + c3.getTerritório());
            System.out.printf("O regime é:" + c3.getRegime());
        }

        do {
            System.out.println();
            System.out.println("|  --MODIFICAÇÃO DE ATRIBUTOS--   |");
            System.out.println("|                                 |");
            System.out.println("|  1) Atrib Brasil                |");
            System.out.println("|  2) Atrib Japão                 |");
            System.out.println("|  3) Atrib Espanha               |");
            System.out.println("|  Quais você deseja alterar?     |");
            k2 = scanner.nextInt();
        } while(k2<1 || k2>3);

        if(k2==1){
            System.out.print("Você quer definir a população do brasil como?: ");
            br[0] = scanner.nextLine();
            c2.setPopulação(br[0]);
            System.out.println("");
            br[9] = scanner.nextLine();
            c2.setPopulação(br[9]);
            System.out.println("Você quer definir o território do brasil como?: ");
            br[1] = scanner.nextLine();
            c2.setTerritório(br[1]);
            System.out.println("Você quer definir o regime como?: ");
            br[2] = scanner.nextLine();
            c2.setRegime(br[2]);
            System.out.println("Resultado final");
            System.out.println("A população do brasil é:" + c2.getPopulação());
            System.out.println("O território do brasil é:" + c2.getTerritório());
            System.out.println("O regime do Brasil é:" + c2.getRegime());
        }
        else if(k2==2){
            System.out.print("Você quer definir a população do Japão como?: ");
            br[3] = scanner.nextLine();
            c4.setPopulação(br[3]);
            System.out.println("");
            br[10] = scanner.nextLine();
            c4.setPopulação(br[10]);
            System.out.println("Você quer definir o território do Japão como?: ");
            br[4] = scanner.nextLine();
            c4.setTerritório(br[4]);
            System.out.println("Você quer definir o regime como?: ");
            br[5] = scanner.nextLine();
            c4.setRegime(br[5]);
            System.out.println("Resultado final");
            System.out.println("A população do Japão é:" + c4.getPopulação());
            System.out.println("O território do Japão é:" + c4.getTerritório());
            System.out.println("O regime do Japão é:" + c4.getRegime());
        }
        else if(k2==3){
            System.out.print("Você quer definir a população da Espanha como?: ");
            br[6] = scanner.nextLine();
            c3.setPopulação(br[6]);
            System.out.println("");
            br[11] = scanner.nextLine();
            c3.setPopulação(br[11]);
            System.out.println("Você quer definir o território da Espanha como?: ");
            br[7] = scanner.nextLine();
            c3.setTerritório(br[7]);
            System.out.println("Você quer definir o regime como?: ");
            br[8] = scanner.nextLine();
            c3.setRegime(br[8]);
            System.out.println("Resultado final");
            System.out.println("A população da Espanha é:" + c3.getPopulação());
            System.out.println("O território do Espanha é:" + c3.getTerritório());
            System.out.println("O regime do Espanha é:" + c3.getRegime());
        }
    }



}