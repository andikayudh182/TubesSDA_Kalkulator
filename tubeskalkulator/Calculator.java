/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubeskalkulator;

import java.util.Stack;
import java.util.StringTokenizer;
/**
 * @Name        : Calculator.java
 * @Author      : Andika Yudha Riyanto & Sanjaya Wisnu Ramadhan
 * @description : Calculator class (body for the main driver)
 * @IDE         : Apache NetBeans 11.2 
 * @Date        : 09-07-2020
 */
public class Calculator {

    private static final int EOL = 0;
    private static final int VALUE = 1;
    private static final int OPAREN = 2;
    private static final int CPAREN = 3;
    private static final int EXP = 4;
    private static final int MULT = 5;
    private static final int DIV = 6;
    private static final int PLUS = 7;
    private static final int MINUS = 8;
    private static final int MODULO = 9;
    

    private static class Precedence {

        public int inputSymbol;
        public int topOfStack;

        public Precedence(int inSymbol, int topSymbol) {
            inputSymbol = inSymbol;
            topOfStack = topSymbol;
        }
    }

    // precTable untuk Pencocokan enumerasi Token
    private static Precedence[] precTable = new Precedence[]{
        new Precedence(0, -1), // EOL
        new Precedence(0, 0), // VALUE
        new Precedence(100, 0), // OPAREN
        new Precedence(0, 99), // CPAREN
        new Precedence(7, 8), // EXP
        new Precedence(3, 4), // MULT
        new Precedence(3, 4), // DIV
        new Precedence(1, 2), // PLUS
        new Precedence(1, 2), // MINUS
        new Precedence(1, 2), //MODULO
    };

    private static class Token {

        public Token() {
            this(EOL);
        }

        public Token(int t) {
            this(t, 0);
        }

        public Token(int t, float v) {
            type = t;
            value = v;
        }

        public int getType() {
            return type;
        }

        public float getValue() {
            return value;
        }

        private int type = EOL;
        private float value = 0;
    }

    private static class EvalTokenizer {

        private StringTokenizer str;

        public EvalTokenizer(StringTokenizer is) {
            str = is;
        }

        /**
         * Mencari token selanjutnya, melewati blanks/spasi, return. untuk
         * Nilai, letakan value pada currentValue. Print pesan error jika ada
         * kesalahan.
         */
        public Token getToken() {
            float theValue;

            if (!str.hasMoreTokens()) {
                return new Token();
            }

            String s = str.nextToken();
            if (s.equals(" ")) {
                return getToken();
            }
            if (s.equals("^")) {
                return new Token(EXP);
            }
            if (s.equals("%")) {
                return new Token(MODULO);
            }
            if (s.equals("/")) {
                return new Token(DIV);
            }
            if (s.equals("*")) {
                return new Token(MULT);
            }
            if (s.equals("(")) {
                return new Token(OPAREN);
            }
            if (s.equals(")")) {
                return new Token(CPAREN);
            }
            if (s.equals("+")) {
                return new Token(PLUS);
            }
            if (s.equals("-")) {
                return new Token(MINUS);
            }

            try {
                theValue = Float.parseFloat(s);
            } catch (NumberFormatException e) {
                System.err.println("Parse error");
                return new Token();
            }

            return new Token(VALUE, theValue);
        }

    }

    /**
     * Construct an evaluator object.
     *
     * @param s the string containing the expression.
     */
    public Calculator(String s) {
        opStack = new Stack();
        postfixStack = new Stack();

        str = new StringTokenizer(s, "+*-/^()% ", true);

        opStack.push(EOL);
    }

    /**
     * melakukan evaluasi. Periksa postfix machine untuk melihat apakah ada satu
     * hasil yang tersisa dan jika demikian, kembalikan; sebaliknya print error.
     */
    public float getValue() {
        EvalTokenizer tok = new EvalTokenizer(str);
        Token lastToken;

        do {
            lastToken = tok.getToken();
            processToken(lastToken);
        } while (lastToken.getType() != EOL);

        if (postfixStack.isEmpty()) {
            //if Stack isEmpty, then return 0
            return 0;
        }

        float theResult = postFixTopAndPop();
        if (!postfixStack.isEmpty()) {
            //System.err.println("Warning: missing operators!");
            System.err.println("The result are in the text field");
        }

        return theResult;
    }
    private Stack opStack;       // Operator stack untuk konversi
    private Stack postfixStack;  // Stack untuk postfix machine
    private StringTokenizer str; // StringTokenizer stream

    /**
     * Internal method that hides type-casting.
     */
    private float postFixTopAndPop() {
        return ((Float) (postfixStack.pop()));
    }

    /**
     * Another internal method that hides type-casting.
     */
    private int opStackTop() {
        return ((Integer) (opStack.peek()));
    }

    /**
     * Setelah token dibaca, gunakan algoritma penguraian presedensi operator
     * untuk memprosesnya; missing opening parentheses are detected here.
     */
    private void processToken(Token lastToken) {
        int topOp;
        int lastType = lastToken.getType();

        switch (lastType) {
            case VALUE:
                postfixStack.push(lastToken.getValue());
                return;

            case CPAREN:
                while ((topOp = opStackTop()) != OPAREN && topOp != EOL) {
                    binaryOp(topOp);
                }
                if (topOp == OPAREN) {
                    opStack.pop();  // Get rid of opening parentheseis
                } else {
                    System.err.println("Missing open parenthesis");
                }
                break;

            default:    // General operator case
                while (precTable[lastType].inputSymbol <= precTable[topOp = opStackTop()].topOfStack) {
                    binaryOp(topOp);
                }
                if (lastType != EOL) {
                    opStack.push(lastType);
                }
                break;
        }
    }

    /*
     * topAndPop the postfix machine stack
     * return the result.
     * If the stack is empty, print an error message.
     */
    private float getTop() {
        if (postfixStack.isEmpty()) {
            System.err.println("Missing operand");
            return 0;
        }
        return postFixTopAndPop();
    }

    /**
     * Menghitung Exponen.
     */
    private static float pow(float x, float n) {
        if (x == 0) {
            if (n == 0) {
                System.err.println("0^0 is undefined");
            }
            return 0;
        }
        if (n < 0) {
            return 1 / pow(x, n * -1);
            //System.err.println("Negative exponent");
            //return 0;
        }
        if (n == 0) {
            return 1;
        }
        if (n % 2 == 0) {
            return pow(x * x, n / 2);
        } else {
            return x * pow(x, n - 1);
        }
    }

    /**
     * Proses operator dengan mengambil dua item dari postfix stack,
     * megaplikasikan operator, dan push result kembali; 
     * Print error jika kehilangan closing atau parenthesis
     */
    private void binaryOp(int topOp) {
        if (topOp == OPAREN) {
            System.err.println("Unbalanced parentheses");
            opStack.pop();
            return;
        }
        float right = getTop();
        float left = getTop();

        if (topOp == EXP) {
            if(right != 0){
                System.out.println(left + " ^ " + right + " = " + pow(left, right));
                postfixStack.push(pow(left, right));
            } else {
                postfixStack.push(pow(left, right));
            }
        } else if (topOp == PLUS) {
            System.out.println(left + " + " + right + " = " + (left + right));
            postfixStack.push(left + right);
        } else if (topOp == MINUS) {
            System.out.println(left + " - " + right + " = " + (left - right));
            postfixStack.push(left - right);
        } else if (topOp == MULT) {
            System.out.println(left + " * " + right + " = " + (left * right));
            postfixStack.push(left * right);
        } else if (topOp == MODULO) {
            System.out.println(left + " % " + right + " = " + (left % right));
            postfixStack.push(left % right);
        } else if (topOp == DIV) {
            if (right != 0) {
                System.out.println(left + " / " + right + " = " + (left / right));
                postfixStack.push(left / right);
            } else {
                System.out.println(pow(1000000000, 1000000000));
                postfixStack.push(pow(1000000, 1000000));
            }
        }
        opStack.pop();
    }
}
//∞ √ ∛  nitip simbol
