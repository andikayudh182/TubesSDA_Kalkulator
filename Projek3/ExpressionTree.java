//JuHyun Lee
package Projek3;

import java.util.Stack;
import java.util.StringTokenizer;

public class ExpressionTree {

    private static class TreeNode {

        public boolean leaf;//does not work as private 
        private char op;
        private double value;
        private TreeNode left, right;

        //basic tree node variables.
        private TreeNode(boolean leaf, char op, double value) {
            this.leaf = leaf;
            this.op = op;
            this.value = value;
            this.left = null;
            this.right = null;
        }//end of TreeNode.

        //Separate toString method to use when converting to string.
        public String toString() {
            if (leaf == true) {
                return Double.toString(value);
            } else {
                return Character.toString(op);
            }
        }//end of tostring method.
    }//end of treenode. 

    //initialized root with null.
    TreeNode root = null;

    //if is prefix the expression tree has to do extra work.
    boolean isPrefix = false;

    //method without isPrefix parameter.
    public ExpressionTree(String input) {
        root = build(input);
    }//end of ExpressionTree

    /*
    * builder with bool condition for prefix input.
    * this will take a bool , unless its told true that it is
    * prefix, it will be same and method above.
     */
    public ExpressionTree(String input, boolean prefix) {
        if (prefix == true) {
            //reverse the input to match postfix outlook
            String inputfix = reverse(input);
            isPrefix = true;
            root = build(inputfix);
        } else {
            root = build(input);
        }
    }//end of ExpressionTree with bool condition.

    //to shorten the if statement to see if the char is operator
    //create string of list that need use the indexof
    String List = "+-*/";

    //build tree from postfix using stack.
    private TreeNode build(String input) {
        Stack<TreeNode> operands = new Stack<TreeNode>();
        StringTokenizer st = new StringTokenizer(input, " ");
        double val;
        TreeNode node;

        try {
            while (st.hasMoreTokens()) {
                String temp = st.nextToken();
                //if string is Operator.
                if (List.indexOf(temp) >= 0) {
                    node = new TreeNode(false, temp.charAt(0), 0);
                    //if prefix then pop left to right.
                    if (isPrefix == true) {
                        node.left = operands.pop();
                        node.right = operands.pop();
                    } else {
                        node.right = operands.pop();
                        node.left = operands.pop();
                    }
                    operands.push(node);
                } //if number than push.
                else {
                    val = Double.parseDouble(temp);
                    TreeNode num = new TreeNode(true, '\0', val);
                    operands.push(num);
                }
            }// end of while
        }// end of try
        //will catch anything that are not operator or number.
        catch (NumberFormatException e) {
            System.out.println("invalid");
            System.exit(0);
        }//end of catch.
        return operands.pop();//pop & return it to root 
    }//end of build in postfix.

    //initial string to return for writing.
    String dum = "";

    // prefix without any parameters
    public String PreFix() {
        dum = "";
        return PreFix(root);
    }//end of prefix without any parameters.

    //prefix with node parameters
    //uses recursion to build string for writing.
    private String PreFix(TreeNode node) {
        while (node != null) {
            dum += (node + " ");
            PreFix(node.left);
            node = node.right;
        }
        return dum;
    }//end of prefix with node parameter.

    //infix without parameters.
    public String InFix() {
        dum = "";
        return InFix(root);
    }//end of infix without parameters.

    //infix with node parameters
    //uses recursion to build string for writing.
    private String InFix(TreeNode node) {
        if (node != null) {
            if (!node.leaf) {
                dum += "( ";
            }
            InFix(node.left);
            dum += node + " ";
            InFix(node.right);
            if (!node.leaf) {
                dum += ") ";
            }
        }
        return dum;
    }//end of infix with node parameter.

    //postfix without parameters
    public String PostFix() {
        dum = "";
        return PostFix(root);
    }//end of postfix without parameters.

    //convert postfix with node parameters
    //uses recursion to build string for writing.
    private String PostFix(TreeNode node) {
        if (node != null) {
            PostFix(node.left);
            PostFix(node.right);
            dum += node + " ";
        }
        return dum;
    }//end of postfix with node parameter.

    //evaluate without parameter.
    public double evaluate() {
        if (root == null) {
            return 0.0;
        } else {
            return evaluate(root);
        }
    }//end of evaluate without parameters.

    //evaluate with node parameter.
    //uses recursion to do the calculation.
    private double evaluate(TreeNode node) {
        double result = 0;

        //if its a node then it is a operand.
        if (node.leaf) {
            result = node.value;
        } else {
            double left, right;
            char oper = node.op;

            left = evaluate(node.left);
            right = evaluate(node.right);

            switch (oper) {
                case '+':
                    result = left + right;
                    break;
                case '-':
                    result = left - right;
                    break;
                case '*':
                    result = left * right;
                    break;
                case '/':
                    result = left / right;
                    break;
            }//end of switch.
        }//end of else.
        return result;
    }//end if evaluate.

    //reverse the prefix to postfix like structure.
    public static String reverse(String pref) {
        StringTokenizer st = new StringTokenizer(pref);
        String RevStr = "";
        while (st.hasMoreTokens()) {
            RevStr = st.nextToken() + " " + RevStr;
        }
        return RevStr;
    }//end of reverse.

}//end of expression tree class.
