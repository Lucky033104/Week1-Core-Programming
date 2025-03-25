package Day5.Level1;

public class NullPointerExceptionDemo {
    public static void generateException() {
        String txt = null;
        System.out.println(txt.length());
    }
    public static void handleException() {
        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }
        handleException();
    }
}