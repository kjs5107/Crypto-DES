/**
Author: Kyle Scagnelli
*/
class IPinverse{
   /**
      IP lookup table
   */
   private static final int[][] finalPermutation = {
           {40,8,48,16,56,24,64,32},
           {39,7,47,15,55,23,63,31},
           {38,6,46,14,54,22,62,30},
           {37,5,45,13,53,21,61,29},
           {36,4,44,12,52,20,60,28},
           {35,3,43,11,51,19,59,27},
           {34,2,42,10,50,18,58,26},
           {33,1,41,9,49,17,57,25}
   };
   
   /**
     @param bits 64-bits 
     @return 64-bits IPinverse(bits)
   */
   static String permute(String bits){
      StringBuilder permutedString = new StringBuilder();
      // loop through rows and cols of fixed 2d array
      for(int i = 0; i < 8; i ++) {
         for(int j = 0; j < 8; j++) {
            permutedString.append(bits.charAt(finalPermutation[i][j]-1));
         }
      }
      return permutedString.toString();
   }

   public static void main(String[] args) {
      String answer = "";
      String input = "11110000";
      for(int i = 0; i < 8; i++) {
         answer += input;
      }

      String out = permute(IP.permute(answer));
      System.out.println(answer.equals(out));
   }

}