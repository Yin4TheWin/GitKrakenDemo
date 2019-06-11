public class Runner{
    public static void main(String[] args){
        PrintQuotient pq = (float a, float b) -> System.out.printf("%.3f", a / b);
        pq.printQuotient(1, 3);
         PerfectSquare perfectSquare = (int x) -> Math.sqrt(x) == Math.round(Math.sqrt(x));  
        System.out.print(perfectSquare.perfectSquare(5));  
    }
}