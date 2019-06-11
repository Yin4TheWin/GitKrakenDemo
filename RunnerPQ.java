public class RunnerPQ{
	public static void main(String[] args){
		PrintQuotient pq = (float a, float b) -> System.out.printf("%.3f", a / b);
        pq.printQuotient(1, 3);
	}
}