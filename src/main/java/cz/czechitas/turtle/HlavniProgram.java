package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import javax.swing.*;

public class HlavniProgram {
    private Turtle zofka = new Turtle();


    //Cast 1

    public void start() {
        zofka.setLocation(450, 300);
        nakresliTrojuhelnik(200);
        zofka.setLocation(250, 200);
        nakresliCtverec(90);
        zofka.setLocation(450, 150);
        nakresliObdelnik(180, 100);
        zofka.setLocation(800, 200);
        nakresliKolecko(15);
    }

    private void nakresliTrojuhelnik(double velikostStrany) {
        zofka.turnRight(90);
        zofka.move(velikostStrany);
        zofka.turnRight(120);
        zofka.move(velikostStrany);
        zofka.turnRight(120);
        zofka.move(velikostStrany);
        zofka.turnRight(120);
    }

    private void nakresliCtverec (double delkaStrany) {
        for (int i = 0; i<4; i++){
            zofka.move(delkaStrany);
            zofka.turnRight(90);
        }
    }

    private void nakresliObdelnik (double delkaStrany, double delkaStrany2) {
        for (int i = 0; i<2; i++){
            zofka.move(delkaStrany);
            zofka.turnLeft(90);
            zofka.move(delkaStrany2);
            zofka.turnLeft(90);
        }
    }

    private void nakresliKolecko(double delka) {
        for (var i = 0; i < 40; i++) {
            zofka.turnLeft(10);
            zofka.move (delka);
        }
    }


    // Cast 2

    /*
    // Zmrzlina
    public void start() {
        zofka.setLocation(450,300);
        nakresliTrojuhelnik(200);
        zofka.setLocation(560,370);
        nakresliKolecko(20);
    }

    private void nakresliTrojuhelnik(double velikostStrany) {
        zofka.turnRight(90);
        zofka.move(velikostStrany);
        zofka.turnRight(120);
        zofka.move(velikostStrany);
        zofka.turnRight(120);
        zofka.move(velikostStrany);
        zofka.turnRight(120);
    }

    private void nakresliKolecko(double delka) {
        for (var i = 0; i < 40; i++) {
            zofka.turnLeft(10);
            zofka.move (delka);
        }
    }
    */

    /*
    // Snehulak
    public void start() {
        zofka.setLocation(550,240);
        nakresliKolecko(12);
        zofka.setLocation(510,100);
        nakresliKolecko(8);
        zofka.setLocation(500,320);
        nakresliKolecko(16);
        zofka.setLocation(380,180);
        nakresliKolecko(5);
        zofka.setLocation(535,190);
        nakresliKolecko(5);
    }

    private void nakresliKolecko(double delka) {
        for (var i = 0; i < 40; i++) {
            zofka.turnLeft(10);
            zofka.move(delka);
        }
    }
    */

    /*
    // Masinka
    public void start() {
        zofka.setLocation(550, 350);
        nakresliObdelnik(150, 250);
        zofka.setLocation(550, 350);
        zofka.turnRight(90);
        nakresliObdelnik(150, 250);
        zofka.setLocation(700, 350);
        zofka.turnLeft(90);
        nakresliKolecko(13);
        zofka.setLocation(500, 365);
        nakresliKolecko(7);
        zofka.setLocation(360, 355);
        nakresliKolecko(7);
        zofka.setLocation(170, 275);
        zofka.turnLeft(270);
        nakresliTrojuhelnik(150);
    }

    private void nakresliObdelnik (double delkaStrany, double delkaStrany2) {
        for (int i = 0; i<2; i++){
            zofka.move(delkaStrany);
            zofka.turnLeft(90);
            zofka.move(delkaStrany2);
            zofka.turnLeft(90);
        }
    }

    private void nakresliKolecko(double delka) {
        for (var i = 0; i < 40; i++) {
            zofka.turnLeft(10);
            zofka.move(delka);
        }
    }

    private void nakresliTrojuhelnik(double velikostStrany) {
        zofka.turnRight(90);
        zofka.move(velikostStrany);
        zofka.turnRight(120);
        zofka.move(velikostStrany);
        zofka.turnRight(120);
        zofka.move(velikostStrany);
        zofka.turnRight(120);
    }
    */


    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
