package javabasic.bien;

public class Bienmorong {

    // biến toàn cục

    String name = "Phương";
    int age = 22;
    String address = "Ninh Binh";

    public void getInfo1() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
    public void getInfo2() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }

    public static void main(String[] args) {
      Bienmorong bienmorong = new Bienmorong();
      System.out.println("Address: " + bienmorong.address);
    }
}
