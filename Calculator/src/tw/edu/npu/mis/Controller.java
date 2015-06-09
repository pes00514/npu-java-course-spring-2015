/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tw.edu.npu.mis;

/**
 *
 * @author user
 */
public class Controller {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculator mModel = new Calculator();
        new CalculatorView("view1", mModel).setVisible(true);
        new CalculatorView("view2", mModel).setVisible(true);
    }
}
