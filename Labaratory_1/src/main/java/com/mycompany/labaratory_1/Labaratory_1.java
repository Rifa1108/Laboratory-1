/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.labaratory_1;

import controller.Coordination;
import model.*;

/**
 *
 * @author rifa1
 */
public class Labaratory_1 {

    public static void main(String[] args) {
        Coordination c = new Coordination();
        c.Import("C:\\Users\\rifa1\\Downloads\\Labaratory_1_example.xlsx", 0);
        System.out.println(c.geometric_mean());

    }
}
