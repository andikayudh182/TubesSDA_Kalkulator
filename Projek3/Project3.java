/* PROJECT 3 
 * 	JUHYUN LEE
 * 	
 */
package Projek3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Project3 {

    public static void main(String[] args) throws Exception {

        ExpressionTree calc;

        String[] arr = new String[4];
        int i = 0;
        String dummy = "";
        //uses filechooser to get txt file.
        JFileChooser chooser = new JFileChooser();
        BufferedWriter out = new BufferedWriter(new FileWriter("result.txt"));

        int returnVal = chooser.showOpenDialog(null);
        try {
            if (returnVal == JFileChooser.CANCEL_OPTION) {
                JOptionPane.showMessageDialog(null, "file not choosen \n end program");
                System.exit(0);
            }
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File f = chooser.getSelectedFile();
                String fname = f.getName();
                //only accepts the Expressions.txt and no other file.
                if (!fname.equals("Expressions.txt")) {
                    JOptionPane.showMessageDialog(null, "invalid file \n end program");
                    System.exit(0); //ends program.
                }
                BufferedReader br = new BufferedReader(new FileReader(f));
                String st = "";

                while ((st = br.readLine()) != null) {
                    arr[i] = st;
                    i++;
                }// get the line of strings from file and put them in the array.

                dummy = arr[0];
                calc = new ExpressionTree(dummy, true);
                out.write("in Prefix: " + dummy);
                out.newLine();
                out.write("in InFix: " + calc.InFix());
                out.newLine();
                out.write("in PostFix: " + calc.PostFix());
                out.newLine();
                out.write("value: " + calc.evaluate());
                out.newLine();
                out.newLine();

                dummy = "";
                dummy = InToPost(arr[1]);
                calc = new ExpressionTree(dummy);
                out.write("in Prefix: " + calc.PreFix());
                out.newLine();
                out.write("in InFix: " + arr[1]);
                out.newLine();
                out.write("in PostFix: " + dummy);
                out.newLine();
                out.write("value: " + calc.evaluate());
                out.newLine();
                out.newLine();

                dummy = "";
                dummy = arr[2];
                calc = new ExpressionTree(dummy);
                out.write("in Prefix: " + calc.PreFix());
                out.newLine();
                out.write("in InFix: " + calc.InFix());
                out.newLine();
                out.write("in PostFix: " + dummy);
                out.newLine();
                out.write("value: " + calc.evaluate());
                out.newLine();
                out.newLine();

                dummy = "";
                dummy = InToPost(arr[3]);
                calc = new ExpressionTree(dummy);
                out.write("in Prefix: " + calc.PreFix());
                out.newLine();
                out.write("in InFix: " + arr[3]);
                out.newLine();
                out.write("in PostFix: " + calc.PostFix());
                out.newLine();
                out.write("value: " + calc.evaluate());
                out.newLine();
                out.newLine();

                br.close();  //close opened file.
            }
            out.close(); // close written file.
            JOptionPane.showMessageDialog(null, "Results has been saved");
        }//end of try.
        catch (IOException e) {
            //throws exception of input or output to file is not done.
            System.out.println("Exception");
        }
    }//end of main.

    //uses try catch to determined if its operator 
    public static boolean isOperand(String s) {
        double temp = 0;
        try {
            temp = Double.parseDouble(s);
        }//try to covert to double
        catch (Exception ignore) {
            return false;
        }//catch and ignore
        return true;
    }//end of operand

    public static boolean isOperator(String s) {
        String List = "+-*/";
        return List.indexOf(s) >= 0;
    }//end of operator

    public static int precedence(String operator) {
        int precedence = 0;
        switch (operator) {
            case "-":
                precedence = 1;
                break;
            case "+":
                precedence = 1;
                break;
            case "*":
                precedence = 2;
                break;
            case "/":
                precedence = 2;
                break;
        }
        return precedence;
    }//end of precedence

    //cover infix to postfix using stack
    public static String InToPost(String infix) {
        Stack<String> stack = new Stack<String>();
        String postfix = "";
        StringTokenizer st = new StringTokenizer(infix);
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            if (isOperand(token)) {
                postfix += token + " ";
            }// if is operand append to string.
            else if (token.equals("(")) {
                stack.push(token);
            }//if its open paren push to stack.
            else if (isOperator(token)) {
                while (!stack.empty() && precedence(stack.peek()) >= precedence(token)) {
                    postfix += stack.pop() + " ";
                }//while loop til empty or find lower precedence
                stack.push(token);
                //if its operator, depending on the precedence decide to pop or push.  
            } else if (token.equals(")")) {
                while (!stack.peek().equals("(")) {
                    postfix += stack.pop() + " ";
                }//pop til reaching open paren
                stack.pop();  // pop and discard the left parenthesis
            }
        }
        while (!stack.empty()) {
            postfix += stack.pop() + " ";
        }//pop til the stack is empty.
        return postfix;
    }//end of converting infix to post fix.

}//end if project 3

