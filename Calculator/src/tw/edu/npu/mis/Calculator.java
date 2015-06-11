/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tw.edu.npu.mis;

import java.util.Observable;

/**
 * The model class of the calculator application.
 */
public class Calculator extends Observable {
    private static final int INITIAL_VALUE = 0;
    private Operator mOperator = Operator.NULL;//運算
    private double mOperand1;//運算的第一個數字
    private double mOperand2;//運算的第二個數字
    private double mResult;//放畫面顯示的數字
    private double mMemorize;//記憶

    /**
     * The available mOperators of the calculator.
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
        MEM_RECALL, // MR
        MOD, //mod
        NULL //沒有運算符號
    }

    /**
     * 輸入數字
     *
     * @param opr 0-9和點
     */
    public void appendDigit(String opr) {
        if (!opr.equals("")) {//是否為""
            if (mOperator == Operator.NULL) {//判斷是否有運算符號
                mOperand1 = Double.valueOf(opr);//沒有則放第一個數字
                mResult = mOperand1;
            } else {
                mOperand2 = Double.valueOf(opr);//有則放第二個數字
                mResult = mOperand2;
            }
            setChanged();
            notifyObservers();
        }

    }

    /**
     * 選擇運算符號
     *
     * @param Operator 運算符號的名稱
     */
    public void performOperation(Operator Operator) {
        this.mOperator = Operator;

    }

    /**
     * 取得顯示畫面的資訊
     *
     * @return 畫面上的數字
     */
    public double getDisplay() {
        return mResult;
    }
    /**
     * 取得記憶的值
     * @return 記憶的值
     */
public double getMemorize(){
    return mMemorize;
}
    /**
     * 按下按鍵%後，以第一個數字的百分比做第二個數字
     */
    public void setPercentage() {
        mOperand2 = mOperand1 * (mOperand2 / 100);
    }

    /**
     * 設定顯示
     *
     * @param hasil 預設定的值
     */
    public void setDisplay(double hasil) {
        this.mResult = hasil;
        setChanged();
        notifyObservers();
    }

    //
    /**
     * 選擇運算方法
     */
    public void process() {
        switch (mOperator) {
            case PLUS://做加法
                mResult = mOperand1 + mOperand2;
                break;
            case MINUS://減法
                mResult = mOperand1 - mOperand2;
                break;
            case TIMES://乘法
                mResult = mOperand1 * mOperand2;
                break;
            case OVER://除法
                mResult = mOperand1 / mOperand2;
                break;
            case MOD://算餘數
                mResult = mOperand1 % mOperand2;
                break;
            case RECIPROCAL://算1/x
                mResult = 1 / mOperand1;
                break;
            case SQRT://開根號
                mResult = Math.sqrt(mOperand1);
                break;
            case PLUS_MINUS://正負號
                mResult = -mOperand1;
                break;
        }
        mOperand1 = mResult;//將計算結果放到第一個數字
        setChanged();
        notifyObservers();
    }
/**
 * 選擇M類該做的事
 */
    public void memorize() {
        switch (mOperator) {
            case MEM_CLEAR:// MC
                mMemorize = INITIAL_VALUE;
                break;
            case MEM_SET: // MS
                mMemorize = mResult;
                break;
            case MEM_PLUS: // M+
                mMemorize += mResult;
                break;
            case MEM_MINUS: // M-
                mMemorize -= mResult;
                break;
            case MEM_RECALL://MR
                mResult=mMemorize;
                break;
        }
        mOperand1 = mResult;//將顯示數字放到第一個數字
        if(mOperator != Operator.MEM_RECALL)//不是MR則不用清除顯示
            mResult=INITIAL_VALUE;
        setChanged();
        notifyObservers();
    }
}
