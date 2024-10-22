public class FiboTen {
    public static void main(String[] args) {
        
        int num1 = 0;
        int num2 = 1;        
        System.out.println("The first 10 numbers in the Fibonacci sequence are:");        
            for (int i = 1; i <= 10; i++) {
                    System.out.print(num1 + " ");
                    int nextNum = num1 + num2;
                    num1 = num2;
                    num2 = nextNum;
                }
            }
        }
        
