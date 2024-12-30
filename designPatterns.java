public class designPatterns {
    public static void main(String args[]){


//star patters
// *
// **
// ***
// ****


        for(int line=1;line<=4;line++){
            for(int star=1; star<=line; star++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();




        //square patterns

// ****
// ****
// ****
// ****


for(int row=1;row<=4;row++){
    for(int col=1;col<=4;col++){
        System.out.print("*");
    }
    System.out.println();
}
System.out.println();

//inverted star pattern

// ****
// ***
// **
// *


for(int i=1;i<=8;i++){
    for(int j=8;j>=i;j--){
        System.out.print("*");
    }
    System.out.println();
}



//print half pyramid patter
int n=5;
for(int lines=1;lines<=n;lines++){
    for(int number=1;number<=lines;number++){
        System.out.print(number);
    }
    System.out.println();
}
System.out.println();
//character print
// A
// BC
// DEF
// GHIJ


int digit=4;
char ch='A';
for(int j=1;j<=digit;j++){
    for(int k=1;k<=j;k++){
        System.out.print(ch);
        ch++;
    }
    System.out.println();

}
    }
    }






  
