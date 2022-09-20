/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.operators;

/**
 *
 * @author micro
 */
public class TestConditional {

    public static void main(String args[]) {
        int a, b;
        a = 10;
        b = (a == 1) ? 20 : 30;
        System.out.println("Value of b is : " + b);
        b = (a == 10) ? 20 : 30;
        System.out.println("Value of b is : " + b);
    }
}
