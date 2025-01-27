// Multi Level Inheritance

class A {
    int xyz = 10;
    void printMsg(){
        System.out.println("Hello from class A.");
    }
}
// access the properties of A inside class B
class B extends A {
    void subtract(int n1, int n2){
        System.out.println(n1 - n2);
    }
}
//access the properties of B inside class C
class C extends B {
    void multiply(int n1, int n2){}
}

public class H_05_Multilevel_Inheritance {
    public static void main(String[] args) {
        C objC = new C();
        objC.subtract(20,5);
        objC.printMsg();
        System.out.println(objC.xyz);
    }
}
