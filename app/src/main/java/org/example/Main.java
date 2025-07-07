import bala.Window;

public class Main {
    public static void main(String[] args) {
        Window window = Window.get(); // singleton - one instance that can be accessed globally, one game window
        window.run();
    }
}