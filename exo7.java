public class Kata
 {
  public static int squareSum(int[] n)
  { 
  int sum = 0;
  // syntax simpl pour parcourir le tableau 
        for (int num : n) {
            sum += num * num;
            //pour que le nombre prend la valeur au carré
        }
        return sum;
  }
 }

 //Complete the square sum function so that it squares each number passed into it and then sums the results together.
 //For example, for [1, 2, 2] it should return 9 because 1 au carré + 2 au carré + 2 au carré = 9 1 2

 