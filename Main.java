import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("1\ta+b\n2\ta-b\n3\ta*b\n4\ta/b\n");
    int wyb = scan.nextInt();
    System.out.print("podaj a: ");
    float a = scan.nextFloat();
    System.out.print("podaj b: ");
    float b = scan.nextFloat();
    System.out.print("Wynik: ");
    switch(wyb){
      case 1:
        System.out.println(a+b);
        break;
      case 2:
        System.out.println(a-b);
        break;
      case 3:
        System.out.println(a*b);
        break;
      case 4:
        System.out.println(a/b);
        break;
      default:
        break;
    }
  }
}