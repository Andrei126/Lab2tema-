package com.company;

import javax.swing.*;

public class Main {
    public static String user;
    public static String standName;
    public static String standPower;
    public static Integer age;
    public static float height;

    public static void main(String[] args) {
        Integer nrUsers = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter number of stand users :"));
        Stando stando[] = new Stando[nrUsers];

        for(int i=0; i<nrUsers; i++){
            user = JOptionPane.showInputDialog(null,"Enter stand user :");
            standName = JOptionPane.showInputDialog(null , "Enter the stand name :");
            standPower = JOptionPane.showInputDialog(null , "Enter the stand's power");
            age  = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the users age :"));
            height = Float.parseFloat(JOptionPane.showInputDialog(null , "Enter the user's height :"));
            stando[i] = new Stando(user , standName, standPower, age, height);



        }
        for(int i =0 ; i<nrUsers; i++){
            JOptionPane.showMessageDialog(null,stando[i].toString());
        }
        JOptionPane.showMessageDialog(null, "Yess this is a jojo reference :");




    }
}
