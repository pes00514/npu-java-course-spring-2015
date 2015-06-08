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

    private final Calculator mModel;

    /**
     * Controller Constructors let Controller know Model method and attribute
     *
     * @param model 傳入Model類別
     */
    public Controller(Calculator model) {
        mModel = model;
    }

    /**
     * Read input and update model accordingly.
     */
    public void readInput() {

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        new CalculatorView().setVisible(true);

    }
}
