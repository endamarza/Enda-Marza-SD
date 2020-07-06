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
public class tugas6 {

    public static void main(String args[])
{
    // Creating an empty Stack
    Stack<Integer> STACK = new Stack<Integer>();
    // Use push() to add elements into the Stack
    STACK.push(10);
    STACK.push(15);
    STACK.push(30);
    STACK.push(20);
    STACK.push(5);
    // Displaying the Stack
    System.out.println("Stack Awal: " + STACK);
    // Pushing elements into the Stack
    STACK.push(1254);
    STACK.push(4521);
    // Displaying the final Stack
    System.out.println("Update Stack: " + STACK);
    }
}
