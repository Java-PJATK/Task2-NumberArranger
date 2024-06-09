# Task2-NumberArranger  

https://github.com/Java-PJATK/Task2-NumberArranger/blob/main/ppj02E.pdf  

March 17, 2024

Deadline: Mar 29 (inclusive)

## Task 2

Write a program which reads three integers (say, `a`, `b` and `c`), then prints these three numbers

```java
System.out.println(a + " " + b + " " + c);

```
and then rearranges the values in these variables in such a way that `a` contains the smallest of the three numbers, `b` — the middle one, and `c` — the largest. Print again

```java
System.out.println(a + " " + b + " " + c);
```

and you shoud sce the same three numbers, but in ascending order.

Any two (or all three) numbers may be equal. **Do not use arrays or `String`s!**

```java
import java.util.Scanner;

public class NumberArranger {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three integers (separated by spaces or new line): ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
      

        System.out.println("Original order: " + a + " " + b + " " + c);
        

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (b > c) {
            int temp = b;
            b = c;
            c = temp;
        }
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        System.out.println("Ascending order: " + a + " " + b + " " + c);
    }
}
```
