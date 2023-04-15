package org.example;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Filme filme = new Filme("The Batman", "heroi");
        Filme filme1 = new Filme("The Batman2", "heroi");
        Filme filme2 = new Filme("The flash", "heroi");
        Filme filme3 = new Filme("VF", "açao");
        Filme filme4 = new Filme("VF2", "açao");
        Filme filme5 = new Filme("VF3", "açao");
        ArrayList<Filme> netflix = new ArrayList<Filme>();


        netflix.add(filme);
        netflix.add(filme1);
        netflix.add(filme2);
        netflix.add(filme3);
        netflix.add(filme4);
        netflix.add(filme5);
        System.out.println("Escolha um filme");
        for (int i = 0; i < netflix.size(); i++) {
            System.out.println(i + " " +netflix.get(i).getName());
        }
        int op = sc.nextInt();

        Filme escolhido = netflix.get(op);
        System.out.println("indicações: ");
        for (int i = 0; i < netflix.size(); i++) {
            if(escolhido.getGenero() == netflix.get(i).getGenero()){
                System.out.println(i + " " +netflix.get(i).getName());
            }
        }
    }
}