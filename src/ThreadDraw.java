public class ThreadDraw extends Thread {
    private Turtle sea;
    private int steps;

    public ThreadDraw(int steps, double x, double y, String color) {
        this.steps = steps;
        this.sea = new Turtle(x, y);
        this.sea.penColor(color);
        sea.speed(1);
        sea.hide();
    }

    @Override
    public void run() {
        if (steps == 0) {
            drawSnowman();
        } else if (steps == 1) {
            drawTree();
        } else if (steps == 2) {
            drawStar();
        } else if (steps == 3) {
            drawSnowflake();
        } else if (steps == 4) {
            drawGround();
        }
    }

    private void drawGround() {
        // Ground
        sea.penColor("white");
        sea.width(100);
        sea.down();
        sea.forward(480);
        sea.up();
    }

    private void drawSnowman() {
        // Body
        sea.penColor("white");
        sea.up();
        sea.down();
        sea.dot("white", 120.0);
        sea.up();

        // Head
        sea.setPosition(120,-30);
        sea.down();
        sea.dot("white", 80.0);
        sea.up();

        // Eyes
        sea.setPosition(105,-25);
        sea.down();
        sea.dot("black", 8.0);
        sea.up();

        sea.setPosition(133,-25);
        sea.down();
        sea.dot("black", 8.0);
        sea.up();

        // Nose
        sea.setPosition(119,-35);
        sea.down();
        sea.dot("orange", 15.0);
        sea.up();

        // Scarf
        sea.penColor("red");
        sea.up();
        sea.setPosition(85, -55);
        sea.width(10);
        sea.down();
        sea.forward(70);
        sea.up();
    }

    private void drawTree() {
        // Trunk
        sea.right(90);
        sea.penColor("brown");
        sea.width(10);
        sea.down();
        sea.forward(60);
        sea.left(90);
        sea.forward(45);
        sea.left(90);
        sea.forward(60);
        sea.left(90);
        sea.forward(45);
        sea.left(90);

        sea.setPosition(-100, -110);
        sea.width(30);
        sea.forward(34);
        sea.setPosition(-115, -110);
        sea.width(30);
        sea.forward(34);
        sea.up();

        // Leaves
        sea.penColor("green");
        sea.width(40);
        sea.left(90);
        sea.up();

        sea.setPosition(-150, 60);
        sea.down();
        sea.forward(80);
        sea.left(130);
        sea.forward(60);
        sea.left(98);
        sea.forward(60);
        sea.up();

        sea.setPosition(-110, 75);
        sea.down();
        sea.forward(100);
        sea.left(132);
        sea.forward(130);
        sea.left(130);
        sea.forward(95);
        sea.up();

        sea.setPosition(-8, -100);
        sea.down();
        sea.forward(160);
        sea.left(100);
        sea.forward(160);
        sea.left(130);
        sea.forward(205);
        sea.up();

        sea.setPosition(-160, -70);
        sea.width(50);
        sea.down();
        sea.forward(90);
        sea.left(130);
        sea.forward(40);
        sea.left(50);
        sea.forward(25);
        sea.up();
    }

    private void drawStar() {
        // Star
        sea.width(10);
        sea.penColor("yellow");
        sea.down();

        for (int i = 0; i < 5; i++) {
            sea.forward(30);
            sea.right(144);
        }
        sea.up();
    }

    private void drawSnowflake() {
        // Snowflakes
        sea.dot("white", 10);
        sea.up();

        sea.setPosition(-200, 170);
        sea.dot("white", 10);
        sea.up();

        sea.setPosition(205, 25);
        sea.dot("white", 10);
        sea.up();

        sea.setPosition(130, 120);
        sea.dot("white", 10);
        sea.up();

        sea.setPosition(-190, 60);
        sea.dot("white", 10);
        sea.up();

        sea.setPosition(225, -100);
        sea.dot("white", 10);
        sea.up();

        sea.setPosition(80, 60);
        sea.dot("white", 10);
        sea.up();

        sea.setPosition(20, 130);
        sea.dot("white", 10);
        sea.up();

        sea.setPosition(180, 180);
        sea.dot("white", 10);
        sea.up();

        sea.setPosition(-100, 200);
        sea.dot("white", 10);
        sea.up();

        sea.setPosition(50, 200);
        sea.dot("white", 10);
        sea.up();
    }
}