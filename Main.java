package com.get.calcengine;

// Using method overloading functions

public class Main {

    public static void main(String[] args) {
        // write your code here
        /*MathEquation testEquation = new MathEquation();
        testEquation.execute();
        System.out.println(testEquation.getResult());*/

        MathEquation [] equations = new MathEquation[4];
//        equations[0] = create(100.d,50.0d,'a');
//        equations[1] = create(100.d,50.0d,'m');
//        equations[2] = create(100.d,50.0d,'s');
//        equations[3] = create(100.d,50.0d,'d');


        equations[0] =  new MathEquation('a',100.d,50.0d);
        equations[1] = new MathEquation('m',100.d,50.0d);
        equations[2] = new MathEquation('s',100.d,50.0d);
        equations[3] = new MathEquation('d',100.d,50.0d);
        for (MathEquation equation : equations){
            equation.execute();
            System.out.print("result wit No overload =");
            // System.out.println(equation.result);
            System.out.println(equation.getResult());
        }
        //* using method overload
        System.out.println();
        System.out.println("Using Overloads");
        System.out.println();

        double leftDouble = 9;
        double rightDouble = 4;
        int leftInt = 9; /* Type conversion example */
        int rightInt =4; /* Type conversion example */

        MathEquation equationOverload = new MathEquation('d');
        equationOverload.exectute(leftDouble,rightDouble);
        System.out.println("results with overload using double");
        System.out.println(equationOverload.getResult());

        equationOverload.exectute(leftInt,rightInt);
        System.out.println("results with overload using int");
        System.out.println(equationOverload.getResult());

        //* using type conversion





    }



//    public static MathEquation create(double leftVal, double rightVal, char opCode){
//
//        MathEquation equation = new MathEquation();
//        equation.setLeftVal(leftVal);
//        equation.setRightVal(rightVal);
//        equation.setOpCode(opCode);
//
//        return equation;
//
//    }


}

