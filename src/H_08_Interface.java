// Interface

interface A {
    int a = 10;
    int sum(int n1, int n2);
}
interface B {
    int subtract(int n1, int n2);
}

class Calculator implements A {
    @Override
    public int sum(int n1, int n2){
        return n1 + n2;
    }

    @Override
    public int subtract(int n1, int n2){
        return n1 - n2;
    }

}

public class H_08_Interface {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(10, 20)); // ans: 30
        System.out.println(calculator.subtract(30, 15)); // ans: 15
        System.out.println(calculator.a); // shown access value of 'a'
    }
}
