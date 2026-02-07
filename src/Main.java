void main() {
    Turtle sea = new Turtle();
    sea.bgcolor("light blue");
    sea.hide();

    ThreadDraw ground = new ThreadDraw(4, -240, -212, "white");
    ThreadDraw snowman = new ThreadDraw(0, 120, -110, "white");
    ThreadDraw tree = new ThreadDraw(1, -130, -100, "green");
    ThreadDraw star = new ThreadDraw(2, -123, 145, "yellow");
    ThreadDraw snowflakes = new ThreadDraw(3, 10, 0, "white");

    snowman.start();
    tree.start();
    star.start();
    snowflakes.start();
    ground.start();
}