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
    double result;//放結果

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
     *
     * @param opr 0-9和點
     */
    public void appendDigit(String opr) {
        if (!opr.equals("")) {//是否為""
            if (operator == 0) {//判斷是否有運算符號
                operand1 = Double.valueOf(opr);//沒有則放第一個數字
            } else {
                operand2 = Double.valueOf(opr);//有則放第二個數字
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
     *
     * @param operator 運算符號的代表號碼
     */
    public void performOperation(int operator) {
        this.operator = operator;
    }

    /**
     * 取得顯示畫面的資訊
     *
     * @return 畫面上的數字
     */
    public double getDisplay() {
        return result;
    }

    /**
     * 設定顯示
     *
     * @param hasil 預設定的值
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
            case 1://做加法
                result = operand1 + operand2;
                break;
            case 2://減法
                result = operand1 - operand2;
                break;
            case 3://乘法
                result = operand1 * operand2;
                break;
            case 4://除法
                result = operand1 / operand2;
                break;
            case 5://算餘數
                result = operand1 % operand2;
                break;
            case 6://算1/x
                result = 1 / operand1;
                break;
            case 7://開根號
                result = Math.sqrt(operand1);
                break;
            case 8://正負號
                result = -operand1;
                break;
        }
        operand1 = result;//將計算結果放到第一個數字
    }

}
