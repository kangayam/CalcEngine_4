package com.get.calcengine;

public class MathEquation {
    private double leftVal;
    private double rightVal;
    public char opCode ;
    public double result;

    public MathEquation(){}

    public MathEquation (char opCode){
        this.opCode = opCode;

    }
    public MathEquation(char opCode, double leftVal, double rightVal){
        this(opCode);
        this.leftVal=leftVal;
        this.rightVal=rightVal;
    }




    public double getLeftVal(){
        return leftVal;
    }
    public void setLeftVal(double leftVal){
        this.leftVal = leftVal;
    }
    public double getRightVal(){
        return rightVal;
    }
    public void setRightVal(double rightVal){
        this.rightVal = rightVal;
    }
    public char getOpCode(){
        return opCode;
    }

    public void setOpCode(char opCode){
        this.opCode = opCode;
    }

    public double getResult(){
        return result;

    }

   /* public double leftVal;
    public double rightVal;
    public char opCode;
    public double result;*/

public void exectute(double leftVal, double rightVal){
    this.leftVal=leftVal;
    this.rightVal=rightVal;
    execute();

}
    public void exectute(int leftVal, int rightVal){
        this.leftVal=leftVal;
        this.rightVal=rightVal;
        execute();
        result=(int)result;

    }

    public void execute(){
        switch (opCode){
            case 'a':
                result = leftVal + rightVal;
                break;

            case 's':
                result = leftVal - rightVal;
                break;

            case 'm':
                result = leftVal * rightVal;
                break;
            case 'd':
                result = (leftVal / rightVal);
                break;
            default:
                System.out.println("Error - invalid opcode");
                break;

        }




    }



}



