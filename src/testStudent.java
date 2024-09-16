/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cluel
 */
public class testStudent {
    public static void main (String []args){
        StudentDemo [] s1 = new StudentDemo[5];
        for (int i=0; i<5;i++)
        {
            s1[i]=new StudentDemo();
        }
        
        String [] names = {"abc", "def", "ghi", "jkl", "mno"};
        for (int i=0; i<5;i++)
        {
            s1[i].setName(names[i]);
        }
        
        System.out.println("Names are: ");
        for(int i=0;i<5;i++)
        {
            System.out.println(s1[i].getName()); //Prints out names
        }
    }
    
}
