
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author confuzo (Abraão Dantas)
 * @title Main class to execute tests 
 */

public class Main {
   public static void main(String [] args){
    List<Integer> list = new List<>();
    
    list.push_back(0);
    list.push_back(1);
    list.push_back(2);
    list.push_back(-1);
    list.pop_back();
    list.pop_front();
    list.printall();
    
   }
}
