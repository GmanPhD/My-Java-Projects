/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gmanprojects;

/**
 *
 *  program that determines the max integer in each row of an array
 */

public class GmanProjects {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] integers = {{3, 4, 6, 78}, {23,45, 78, 90}, {12, 34, 78, 45}};
    for (int i = 0; i < 3; i++) {
    int max = integers[i][0];
    for (int j = 0; j < 4; j++) 
    max = (integers[i][j] > max) ? integers[i][j] : max;
System.out.println("The max of row " + (i+1) + " is " + max);
  }
  }
}

