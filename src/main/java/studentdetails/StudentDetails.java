/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentdetails;

/**
 *
 * @author HP
 */
public class StudentDetails {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Student s1 = new Student ();
        s1.setName("Peter");
        s1.setAge(21);
        Student s2 =new Student();
        s2.setName("nitika");
        s2.setAge(18);
        Student s3 =new Student();
        s3.setName("kiran");
        s3.setAge(19);
        
        Student[] list = new Student[3];
        list[0]=s1;
        list[1]=s2;
        list[2]=s3;
        for(int i=0;i<list.length;i++) //for loop to print every user
        System.out.println(list[i].getName()+" "+list[i].getAge());
    }
    
}