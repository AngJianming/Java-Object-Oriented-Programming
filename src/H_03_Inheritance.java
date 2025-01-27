// Inheritance

class testA{
    int a = 10;
    void addSum(int n1, int n2){
        System.out.println("Sum: " + (n1 + n2));
    }
}

// B is child
// A is parent
class testB extends testA {}



public class H_03_Inheritance {
    public static void main(String[] args) {
        testB testobjB = new testB();
        testobjB.addSum(20,10);
        System.out.println(testobjB.a);
    }
}
