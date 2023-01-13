package ss10_dsa_stack_queue.thuc_hanh.bai1;

import ss04_oop_class_object.bai_tap.quadraticequation.QuadraticEquation;

import javax.imageio.plugins.tiff.TIFFImageReadParam;
import java.util.*;

public class Palindrome {
    public static void main(String[] args) {

        String stringWord = "Able was I ere I saw Elba";
        String word = stringWord.toLowerCase();
        //System.out.println(word);
        Queue<String> queue = new LinkedList<>();
        String[] arrayChar = word.split("");
        String[] arrayChar2 = word.split("");
        for (int i = 0; i < arrayChar.length; i++) {
            queue.add(arrayChar[i]);
        }
        for (int i = 0; i < arrayChar.length; i++) {
            arrayChar[i] = queue.poll();
        }
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < arrayChar2.length; i++) {
            stack.push(arrayChar2[i]);
        }
        for (int i = 0; i < arrayChar2.length; i++) {
            arrayChar2[i] = stack.pop();
        }
        for (int i = 0; i < arrayChar2.length; i++) {
            if (arrayChar[i] !== arrayChar2[i]){
                return "false";
            }
            return "true";

        }


    }
}
