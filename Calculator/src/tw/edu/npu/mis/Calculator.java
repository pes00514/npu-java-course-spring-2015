/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tw.edu.npu.mis;

/**
 * The model class of the calculator application.
 */
public class Calculator {

    int operator = 0;//數字
    double operand1;//運算的第一個數字
    double operand2;//運算的第二個數字
    double result;

    /**
     * The available operators of the calculator.
     */
    public enum Operator {

        CLEAR, // C
        CLEAR_ENTRY, // CE
        BACKSPACE, // ←
        EQUAL, // =
        PLUS, // +
        MINUS, // -
        TIMES, // ×
        OVER, //÷
        PLUS_MINUS, // ±
        RECIPROCAL, // 1/x
        PERCENT, // %
        SQRT, // √
        MEM_CLEAR, // MC
        MEM_SET, // MS
        MEM_PLUS, // M+
        MEM_MINUS, // M-
        MEM_RECALL   // MR
    }

    /**
     * 輸入數字
     * @param opr 0-9和點
     */
    public void appendDigit(String opr) {
        if (!opr.equals("")) {
            if (operator == 0) {
                operand1 = Double.valueOf(opr);
            } else {
                operand2 = Double.valueOf(opr);
            }
        }
    }

/**
 * 輸入點號
 */
    public void appendDot() {
        // TODO code application logic here
    }

    
/**
 * 選擇運算符號
 * @param operator 運算符號的代表號碼 
 */
    public void performOperation(int operator) {
        this.operator = operator;
    }

    
/**
 * 取得顯示畫面的資訊
 * @return 畫面上的數字
 */
    public double getDisplay() {
        return result;
    }

    
/**
 * 設定顯示
 * @param hasil 
 */
    public void setDisplay(double hasil) {
        this.result = hasil;
    }

    //
/**
 * 選擇運算方法
 */
    public void process() {
        switch (operator) {
            case 1:
                result = operand1 + operand2;
                break;
            case 2:
                result = operand1 - operand2;
                break;
            case 3:
                result = operand1 * operand2;
                break;
            case 4:
                result = operand1 / operand2;
                break;
            case 5:
                result = operand1 % operand2;
                break;
            case 6:
                result = 1 / operand1;
                break;
            case 7:
                result = Math.sqrt(operand1);
                break;
            case 8:
                result = -operand1;
                break;
        }
        operand1 = result;
    }

}
