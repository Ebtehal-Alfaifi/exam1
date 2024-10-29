import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        Write a Java program that accept three numbers from the user and print the largest number .

        Scanner eb=new Scanner(System.in);
//        System.out.println("enter the first number ");
//        int num1=eb.nextInt();
//        System.out.println("enter the first number2 ");
//        int num2=eb.nextInt();
//        System.out.println("enter the first number3 ");
//        int num3=eb.nextInt();
//        if (num1>=num2&&num1>=num3){
//            System.out.println(" the largest number is " +" " + num1);
//    } else if (num2>num1) {
//            System.out.println(" the largest number is " +" " + num2);
//
//        } else  System.out.println(" the largest number is " +" " + num3);
//    }
//}


//        Write a Java program that accept a String and a number from the user,then print the character in the given index .
        System.out.println("  enter your nam ");
     String name= eb.nextLine();
        System.out.println("enter index");
       int num= eb.nextInt();
        for (int i = 0; i <=num; i++) {
            char a = name.charAt(i);
            System.out.println(a);
        }}}

//       3 Write a program to enter the numbers till the user wants and at the end it should display the sum entered .
//      int sum=0;
//        int num=0;
//       do {
//           System.out.println(" enter number ");
//            num = eb.nextInt();
//            sum+=num;
//       }
//           while (num!=0) ;
//           System.out.println("the sum of element ="+ sum);
//       }}



//       4 Write a Java program to find positive and negative numbers of a given array:

//    int[]arr={10, -21 , 30, 31, -25};
//    for(int n:arr){
//    if (n>0){
//        System.out.println(n +" "+ "is a postive");
//
//    } else if (n<0) {
//        System.out.println(n+ " "+ " is  a negetive");
//    }}}}



//
//        Write a Java program to find a shortest word of a given array:
//        - Original Array:
//    [“Tuwaiq”, “Bootcamp” , “Student”,”JAVA”]
//
//        String smallestword="";
//    String[]word={"Tuwaiq","Bootcamp","Student","JAVA" };
//    for (String w:word){
//          if((w.equals()<word.equals(word.length)){
//              smallestword+=w;
//          }}
//        System.out.println("the smallest is word is " +smallestword);
//    }}
