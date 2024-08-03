package javabasic.bien;

public class Biencucbo {
    public void sayHello() {
        int n = 10;                     // Đây là biến local
        System.out.println("Gia tri cua n la: " + n);
    }

    public static void main(String[] args) {
        String name = "Phuong";  // biến cục bộ ( local )
        System.out.println("Name: " + name);
        Biencucbo bienLocal = new Biencucbo();
        bienLocal.sayHello();
    }
}
