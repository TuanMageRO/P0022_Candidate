/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.UI;
/**
 *
 * @author HP
 */
public class Run {
    private final UI ui = new UI();
    private final Management mn = new Management();
    public void run() {
        while(true) {
            int c = ui.menu();
            switch (c) {
                case 1:
                    mn.newCandidate(0);
                    break;
                case 2:
                    mn.newCandidate(1);
                    break;
                case 3:
                    mn.newCandidate(2);
                    break;
                case 4:
                    mn.searchCandidate();
                    break;
                case 5:
                    return;
            }
        }
    }
}
