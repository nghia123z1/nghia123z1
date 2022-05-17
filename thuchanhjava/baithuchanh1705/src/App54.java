import java.util.HashSet;
import java.util.Scanner;
 public class App54 {
     public static void main(String[] args) {
         int number;
         HashSet<Integer> HashSetInteger = new HashSet<>();
         Scanner scanner = new Scanner(System.in);
         HashSetInteger.add(0);
         HashSetInteger.add(3);
         HashSetInteger.add(1);
         HashSetInteger.add(4);
         HashSetInteger.add(2);
         HashSetInteger.add(8);

    System.out.println("Cac phan tu trong hashSetInteger: ");
    System.out.println(HashSetInteger);
    System.out.print("Nhap phan tu can them: ");
    number = scanner.nextInt();
    scanner.close();
    if (!HashSetInteger.contains(number) ){
        HashSetInteger.add(number);
        System.out.println("them thanh cong! ");
        System.out.println("Cac phan tu trong hasshSetInteger");
         } else{
             System.out.println("phan tu" + number + "da ton tai");
    }
   
     }
 }