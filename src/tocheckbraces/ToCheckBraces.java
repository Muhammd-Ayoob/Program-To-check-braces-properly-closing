/**
 *
 * @author Muhammad Ayoob
 */


package tocheckbraces;
import java.util.*;
public class ToCheckBraces{

    public static void main(String args[]) {
    @SuppressWarnings("resource")

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a bracess series");
        String string= scanner.nextLine();


        char array[]= string.toCharArray();
        Stack<Character> stack = new Stack<>();
        boolean b=false;
        //(())()
        for(int i=0;i<array.length;i++) {
        if(array[i]== '(') {
        stack.push('(');
        }
        else if(i!=0 && array[i] == ')')
        {
        if(!stack.isEmpty() && stack.get(stack.size()-1) == '(') {
        stack.pop();
        b=true;
        }
        else {b=false;break;}
        }

    }

        if(b && stack.isEmpty()) {
        System.out.println("BRACKETS ARE PROPERLY OPENED AND CLOSED. . .!");
        }
        else
        System.out.println("BRACKETS ARE NOT PROPERLY OPENED AND CLOSED. . .!");


  }
}
