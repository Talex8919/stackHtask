package kg.megacome.course;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Stack<String>brandOfCarsLike= new Stack<>();
        brandOfCarsLike.add ("Subaru Forester");
        brandOfCarsLike.add ("Subaru Lancaster");
        brandOfCarsLike.add ("Acura RSX");
        brandOfCarsLike.add ("Toyota Highlander");
        brandOfCarsLike.add ("Subaru Subaru");
        System.out.println("______________ print  all");
        brandOfCarsLike.forEach(System.out::println);
        System.out.println("______________ remove top and print");
        brandOfCarsLike.pop();
        brandOfCarsLike.forEach(System.out::println);
        System.out.println("______________ print only top");
        System.out.println( brandOfCarsLike.lastElement());
        System.out.println("_______________Find First Position and print  out");
        int i = brandOfCarsLike.search("Subaru Forester");
        System.out.println(i);






    }
}
