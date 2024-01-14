import java.util.HashSet;
import java.util.Set;
public class set {
                public static void main(String[] args) {
                    Set<Integer> num = new HashSet<>();
                    num.add(5);
                    num.add(10);
                    num.add(15);
                    System.out.println(num);
                    num.add(10);
                    System.out.println(num);
                    num.add(20);
                    System.out.println(num);
                    num.remove(5);
                    System.out.println(num);
                    num.remove(25);
                    System.out.println(num);
                    System.out.println(num.contains(10));
                    System.out.println(num.contains(20));
                    System.out.println(num.size());

                }
}