/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Introduction_to_OOP_class_and_methods;

/**
 *
 * @author zzsha
 */
public class test {
    public static void main(String[] args) {
        
        
        Teacher teacher1=new Teacher();
        
        teacher1.name="Aziz Safin";
        teacher1.gender="male";
        teacher1.number=1234567;
        
        teacher1.displayinformation();
        System.out.println("");
        Teacher teacher2=new Teacher();
        
        teacher2.name="faria";
        teacher2.gender="female";
        teacher2.number=1213414;
        
       teacher2.displayinformation();
    }
    
}
