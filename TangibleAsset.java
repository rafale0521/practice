public class DynamicColorTurtleIsland {
    public static void main(String[] args) {
        
        Island island = new Island();
        Window win = new Window(island);
        
        DynamicColorTurtle t1 = new DynamicColorTurtle();
        island.addTurtle(t1);
        t1.setColor(Color.GRAY);
        t1.jumpTo(10, 150);
        t1.penDown();
        t1.walk(100);
        t1.turn(90);
        t1.walk(100);
        t1.turn(90);
        t1.walk(100);
        t1.turn(90);
        t1.walk(100);
        t1.print("Rectangle");

        DynamicColorTurtle t2 = new DynamicColorTurtle();
        island.addTurtle(t2);
        t2.setColor(Color.PINK);
        t2.jumpTo(320, 250);
        t2.penDown();
        t2.walk(-100);
        t2.turn(120);
        t2.walk(-100);
        t2.turn(120);
        t2.walk(-100);
        t2.print("Triangle");

        DynamicColorTurtle t3 = new DynamicColorTurtle();
        island.addTurtle(t3);
        t3.setSpeed("fast");
        t3.setColor(Color.ORANGE);
        t3.jumpTo(180, 150);
        t3.penDown();
        for (int i = 0; i < 360; i += 6) {
            if (t3.isPenDown()) {
                t3.penUp();
            }
            else {
                t3.penDown();
            }
            t3.walk(6);
            t3.turn(6);
        }
        t3.print("Circle");

        DynamicColorTurtle t4 = new DynamicColorTurtle();
        island.addTurtle(t4);
        t4.setColor(Color.GREEN);
        t4.jumpTo(280, 150);
        t4.penDown();
        for (int i = 0; i < 6; ++i) {
            t4.walk(60);
            t4.turn(60);
        }
        t4.print("Hexagon");

        DynamicColorTurtle t5 = new DynamicColorTurtle();
        island.addTurtle(t5);
        t5.setColor(Color.BLUE);
        t5.setSpeed("fast");
        t5.jumpTo(10, 300);
        t5.penDown();
        t5.turn(45);
        for (double d = 90; d > 4; d *= 0.9) {
            t5.walk(d);
            t5.turn(-90);
        }
        t5.print("Spiral");

        DynamicColorTurtle t6 = new DynamicColorTurtle();
        island.addTurtle(t6);
        t6.setSpeed("very_fast");
        t6.setColor(Color.RED);
        t6.jumpTo(160, 320);
        tree(t6, 90, 80);
        t6.print("Fractal_Tree");
    }

    public static void tree(DynamicColorTurtle a, double angle, double dist) {
        if (dist < 4.0) {
            return;
        }
        a.penDown();
        a.turn(angle);
        a.walk(dist);
        tree(a, 50, dist * 0.6);
        tree(a, -30, dist * 0.8);
        a.penUp();
        a.walk(-dist);
        a.turn(-angle);
    }
}
