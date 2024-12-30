public class decimaltoBinary {
  
   public static void decToBin(int decNum){
    int myNum =decNum;
    int pow=0;
    int binNum=0;
    while(myNum>0){
        int rem = myNum%2;
        binNum=binNum+(rem*(int)Math.pow(10,pow));
        
        pow++;
        myNum=myNum/2;


    }
    System.out.println(binNum);
   }


    public static void main(String args[]){
        decToBin(7);
    }
}
