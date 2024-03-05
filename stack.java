import java.util.Scanner;

/**
 * stack
 * 
 * 
 *     
 */


public class stack {

  

    
        static int size;
        static int top = -1;
        static int stack[];
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("How many elements do you want to store?");
            size = scanner.nextInt();
            stack = new int[size];
    
            int choice;
            do {
                System.out.println("\nChoose one from the below options...");
                System.out.println("\n1.Push\n2.Pop\n3.Show\n4.Check Empty\n5.Check Full\n6.Exit");
                System.out.println("\nEnter your choice\t:");
                choice = scanner.nextInt();
    
                switch (choice) {
                    case 1:
                        push();
                        break;
                    case 2:
                        pop();
                        break;
                    case 3:
                        traverse();
                        break;
                    case 4:
                        checkEmpty();
                        break;
                    case 5:
                        checkFull();
                        break;
                    case 6:
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice !!! Try again !!!!");
                        System.exit(0);
                }
            } while (choice > 0 && choice != 6);
        }
    
        static boolean checkFull() {
            if (top == size - 1) {
                System.out.println("Stack is full !!");
                return true;
            } else {
                System.out.println("Stack is still free !!");
                return false;
            }
        }
    
        static boolean checkEmpty() {
            if (top == -1 || top < size - 1) {
                System.out.println("Stack is empty !! You can store an integer in it !!!");
                return true;
            } else {
                return false;
            }
        }
    
        static void pop() {
            if (!checkEmpty()) {
                System.out.println("Popped element: " + stack[top]);
                top--;
            } else {
                System.out.println("Stack is empty");
            }
        }
    
        static void push() {
            if (!checkFull()) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter the value to be pushed into the stack:");
                int value = scanner.nextInt();
                top++;
                stack[top] = value;
            }
        }
    
        static void traverse() {
            for (int i = top; i >= 0; i--) {
                System.out.println((i + 1) + " element of the stack is " + stack[i]);
            }
        }
    }
    
