public class Runner{
    public static void main(String[] args){
        PrintQuotient pq = (float a, float b) -> System.out.printf("%.3f", a / b);
        pq.printQuotient(1, 3);
         PerfectSquare perfectSquare = (int x) -> Math.sqrt(x) == Math.round(Math.sqrt(x));  
        System.out.print(perfectSquare.perfectSquare(5));  
    }
}

//Usman: I've learned about how lambda functions are more effecient than standard functions, as writing the terms 
//for the  ouput can be made to my liking in an easier and more direct approach. I've also learned how to clone repositories,
 //create and merge branches, and push and pull commits.