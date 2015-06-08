/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tw.edu.npu.mis;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Controller {
    private final Model mModel;
/**
 * Controller Constructors
 *  let Controller know Model method and attribute
     * @param model 傳入Model類別
 */
    public Controller(Model model) {
        mModel = model;
    }

    /**
     * Read input and update model accordingly.
     */
    public void readInput() {
        new CalculatorView().setVisible(true);
    }
}
