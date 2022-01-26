package classroom;

public class Calculator {

    private String name;
    private boolean isScientific;

    public Calculator(String name) {
        this.name = name;
    }

    public Calculator(String name, boolean isScientific) {
        this.name = name;
        this.isScientific = isScientific;
    }

    public Calculator() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // + - / *

    // default
    // public
    // private
    // protected

    public int addition(int x, int y) {
        return x + y;
    }

    public int addition(int x, int y, int z) {
        return x + y + z;
    }

    public int subtract(int x, int y) {
        return x - y;
    }

    public int divide(int x, int y) {
        return x / y;
    }

    public int multiply(int x, int y) {
        return x * y;
    }

    public void printResult(double number) {
        System.out.println(number);
    }

}