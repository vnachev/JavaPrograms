class NumbersInfo {
   public static void main(String[] args){
       int sum = 0, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
       double avg;
       for (int i = 0; i < args.length; i++){
           int num = Integer.parseInt(args[i]);
           sum += num;
           if (min > num){
              min = num;
           }
           if (max < num){
              max = num;
           }
       }
       avg = (double)sum / args.length;
       System.out.println("Sum = " + sum);
       System.out.println("Max = " + max);
       System.out.println("Min = " + min);
       System.out.printf("Average = %.2f\n", avg);
   }
}
