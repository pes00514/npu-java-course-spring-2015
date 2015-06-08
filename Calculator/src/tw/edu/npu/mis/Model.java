/*
 * Copyright (c) 2015, Samael Wang <freesamael@gmail.com>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * * Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 * * Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */
package tw.edu.npu.mis;

/**
 * The domain model.
 *
 * @author Samael Wang <freesamael@gmail.com>
 */
public class Model extends Subject{
int operator=0;
    double operand1;
    double operand2;
    double result;

    public void setOperand(String opr) {
        if(!opr.equals("")){
            if(operator==0){
                operand1=Double.valueOf(opr);
            }else{
                operand2=Double.valueOf(opr);
            }
        }
    }

    public void setOperator(int operator) {
        this.operator = operator;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double hasil) {
        this.result = hasil;
    }
   
    public void process(){
        switch (operator){
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
                result = 1/operand1;
                break;
        }
        operand1=result;
    }

  

}
