/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package helloworld;

/**
 *Date: Jan 10 2024
 * @author My Personal Computer
 */

import java.util.Scanner;
import java.util.ArrayList;

public class HelloWorld_backup
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        
        Scanner kb          = new Scanner(System.in);
        String input        = kb.nextLine();
     
//        String chineseGod = "TianWang";
        
//        ArrayList<>characters = new ArrayList<>();
//        characters.add("3");
        
//        for (Integer x: chineseGod)
//        {
//            characters.add(x);
//        }

//        System.out.println(characters[0]);
        
//          for (var i = 0; i < input.length(); i++)
//          {
//              characters.add(input[i]);
//          }
        char [] characters = new char[input.length()];
        
        for (var i = 0; i < input.length(); i++)
        {
//            characters.add(input.charAt(i));
            characters[i] = input.charAt(i);
        }
        
        //Doesn't print in reverse
//        for (char c : characters)
//        {
//            System.out.println(c);
//        }
//        for  (var j = characters.length(); j > characters.length(); j--)
//        {
//            System.out.println(characters[j]);
//        }
        for  (var j = characters.length - 1; j >= 0; j--)
        {
            System.out.println(characters[j]);
        }
    }
    
}
