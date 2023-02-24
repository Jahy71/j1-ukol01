package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.*;

public class HlavniProgram {

    private Turtle zofka = new Turtle();

    public void nakresliPrasatko() {

        for (int i = 0; i < 2; i++) {
            zofka.move(50);
            zofka.turnRight(90);
            zofka.move(100);
            zofka.turnRight(90);
        }
        zofka.turnLeft(45);
        zofka.move(35);
        zofka.turnRight(90);
        zofka.move(35);
        zofka.penUp();
        zofka.turnRight(135);
        zofka.penDown();
        zofka.move(50);
        zofka.turnRight(25);
        zofka.move(20);
        zofka.turnLeft(180);
        zofka.move(20);
        zofka.turnRight(130);
        zofka.move(20);
        zofka.turnLeft(180);
        zofka.move(20);
        zofka.penUp();
        zofka.turnRight(115);
        zofka.move(100);
        zofka.turnRight(65);
        zofka.penDown();
        zofka.move(20);
        zofka.turnRight(180);
        zofka.move(20);
        zofka.turnLeft(140);
        zofka.move(20);
    }

    public void nakresliPrvniDomecek() {
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(150);
        zofka.penDown();

        for (int i = 0; i < 4; i++) {
            zofka.turnRight(90);
            zofka.move(50);
        }
        zofka.turnRight(90);
        zofka.move(50);
        zofka.turnRight(45);
        zofka.move(35);
        zofka.turnRight(90);
        zofka.move(35);
    }

    public void nakresliDruhyDomecek() {
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(100);
        zofka.turnRight(90);
        zofka.move(150);
        zofka.penDown();

        for (int i = 0; i < 4; i++) {
            zofka.turnLeft(90);
            zofka.move(50);
        }
        zofka.turnLeft(45);
        zofka.move(35);
        zofka.turnLeft(90);
        zofka.move(35);
    }

    public void nakresliTretiDomecek() {
        zofka.penUp();
        zofka.move(150);
        zofka.penDown();

        for (int i = 0; i < 4; i++) {
            zofka.turnLeft(90);
            zofka.move(50);
        }
        zofka.turnLeft(45);
        zofka.move(35);
        zofka.turnLeft(90);
        zofka.move(35);
    }

    public void nakresliCtvrtyDomecek() {
        zofka.penUp();
        zofka.move(150);
        zofka.turnRight(90);
        zofka.move(50);
        zofka.penDown();

        for (int i = 0; i < 4; i++) {
            zofka.move(50);
            zofka.turnRight(90);
        }
        zofka.turnLeft(45);
        zofka.move(35);
        zofka.turnRight(90);
        zofka.move(35);
    }

    public void nakresliPatyDomecek() {
        zofka.penUp();
        zofka.move(150);
        zofka.turnRight(90);
        zofka.move(150);
        zofka.penDown();

        for (int i = 0; i < 4; i++) {
            zofka.move(50);
            zofka.turnRight(90);
        }
        zofka.turnLeft(45);
        zofka.move(35);
        zofka.turnRight(90);
        zofka.move(35);
    }

    public void nakresliSestyDomecek() {
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(150);
        zofka.penDown();

        for (int i = 0; i < 4; i++) {
            zofka.move(50);
            zofka.turnLeft(90);
        }
        zofka.turnLeft(90);
        zofka.move(50);
        zofka.turnRight(45);
        zofka.move(35);
        zofka.turnRight(90);
        zofka.move(35);
    }

    public void nakresliSlunicko() {
        zofka.penUp();
        zofka.move(200);
        zofka.turnLeft(90);
        zofka.move(300);
        zofka.penDown();

        for (int i = 0; i < 18; i++) {
            zofka.turnRight(90);
            zofka.move(25);
            zofka.turnRight(180);
            zofka.move(25);
            zofka.turnRight(90);
            zofka.move(20);
            zofka.turnLeft(20);
        }
    }

    public void jmeno() {
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(150);
        zofka.turnLeft(90);
        zofka.move(70);

        // pismeno "J"
        zofka.penDown();
        zofka.turnLeft(90);
        zofka.move(50);
        zofka.turnRight(90);
        zofka.move(80);
        for (int i = 0; i < 9; i++) {
            zofka.move(10);
            zofka.turnRight(20);
        }
        zofka.penUp();

        // pismeno "I"
        zofka.turnRight(90);
        zofka.move(100);
        zofka.penDown();
        zofka.turnLeft(90);
        zofka.move(90);
        zofka.turnLeft(180);
        zofka.move(115);
        zofka.penUp();

        // pismeno "R"
        zofka.turnLeft(90);
        zofka.move(70);
        zofka.turnLeft(90);
        zofka.penDown();
        zofka.move(115);
        zofka.turnRight(90);
        for (int i = 0; i < 9; i++) {
            zofka.move(10);
            zofka.turnRight(20);
        }
        zofka.turnLeft(135);
        zofka.move(80);

        // pismeno "K"
        zofka.penUp();
        zofka.turnLeft(45);
        zofka.move(55);
        zofka.turnLeft(90);
        zofka.penDown();
        zofka.move(110);
        zofka.turnLeft(180);
        zofka.move(55);
        zofka.turnLeft(45);
        zofka.move(75);
        zofka.turnLeft(180);
        zofka.move(75);
        zofka.turnRight(90);
        zofka.move(75);
        zofka.penUp();

        // pismeno "A"
        zofka.turnRight(45);
        zofka.move(80);
        zofka.turnRight(75);
        zofka.penDown();
        zofka.move(115);
        zofka.turnRight(180);
        zofka.move(115);
        zofka.turnLeft(150);
        zofka.move(115);
        zofka.turnLeft(180);
        zofka.move(45);
        zofka.turnRight(75);
        zofka.move(35);
    }

    public static void main(String[] args) {
        new HlavniProgram().nakresliPrasatko();
        new HlavniProgram().nakresliPrvniDomecek();
        new HlavniProgram().nakresliDruhyDomecek();
        new HlavniProgram().nakresliTretiDomecek();
        new HlavniProgram().nakresliCtvrtyDomecek();
        new HlavniProgram().nakresliPatyDomecek();
        new HlavniProgram().nakresliSestyDomecek();
        new HlavniProgram().nakresliSlunicko();
        new HlavniProgram().jmeno();
    }
}