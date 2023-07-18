public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.sing();
        Pelican pelican = new Pelican();
        pelican.sing();
        bird.sing(5);
    }
}