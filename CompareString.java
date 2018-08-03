/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git;

/**
 *
 * @author amallaltl
 */
public class CompareString {
    static int k = 0;
    public static void main(String[] args) {
    String first = "CAT";
    String second = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for(int i = 0; i<first.length(); i++){
            char firstAt = first.charAt(i);
            System.out.println("firstAt = " + firstAt);
            for(int j =0; j<second.length();j++){
                char secondAt = second.charAt(j);
                    if(firstAt == secondAt)
                        k=k+j;
            }
        }
    }
}
