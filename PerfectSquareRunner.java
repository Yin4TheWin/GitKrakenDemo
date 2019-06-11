public static PerfectSquareRunner{ 
    public static void main(String[]args){ 
        PerfectSquare perfectSquare = (int x) -> Math.sqrt(x) == Math.round(Math.sqrt(x)); 
        System.out.print(perfectSquare.perfectSquare(5)); 
    } 
}