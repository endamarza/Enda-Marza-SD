/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasstrukturdata;

import java.util.Stack;

/**
 *
 * @author EndaMarza
 */
public class Tugasstrukturdata {

    public static void main(String[] args) {
        //creating an empty stack
        Stack<Integer> STACK = new Stack<Integer>();
        
        STACK.push(10);
        STACK.push(15);
        STACK.push(30);
        STACK.push(20);
        STACK.push(5);
        
        //displaying the stack
        System.out.println("Stack Awal:" +STACK);
        
        //removing elements using pop() method
        System.out.println("Pop Element: " +STACK.pop());
        System.out.println("Pop Element: " +STACK.pop());
        
        //displaying the stack after pop operation
        System.out.println("Update Stack " +STACK);
    }
    
}
