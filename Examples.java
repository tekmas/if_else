package day10_switch_StringManipulation;

import java.util.Scanner;

public class Examples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir kelime girin");
        String word = scan.next();

        Scanner scan2 = new Scanner(System.in);
        System.out.println("bir cümle girin");
        String yazi = scan2.nextLine();

        int deger=yazi.indexOf(word);
           int deger2=yazi.indexOf(word,deger+1);
        if (deger<=-1){
            System.out.println("girilen kelime cümlede kullanılmamış");
        }
        else if (deger2==-1){
            System.out.println("girilen kelime cümlede bir kez kullanılmış");
        }
        else {
            System.out.println("girilen kelime cümlede birden çok kullanılmış");
        }

    }
}
