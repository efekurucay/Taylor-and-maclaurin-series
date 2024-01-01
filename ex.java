
/*
*-----------------------------------------------------
* Name: Yahya Efe Kurucay
* Date: 01.01.2024
* Description: e to the power of x
* Website: https://efekurucay.com
*Bir hata var sıkıldım yapmadım sonradan iyi gunler..
* 
*-----------------------------------------------------
 */
public class ex {


// e^x = sum of all --> n to ∞, x^n devided by n! x∈(-∞,+∞)
public static void main(String[] args) {
    double epowerx = 0;
    int x=5;

    for (int n = 0; n < 100/* ∞ instead of 100 */; n++) {
        
        epowerx+= Math.pow(x, n) / factorial(n);

    }//for n
    System.out.println("e^x is approximately "+epowerx);

}//main


 // Factorial calculating method
 public static long factorial(int number) {
    if (number < 0) {
        throw new IllegalArgumentException("The factorial of negative numbers is undefined.");
    }
    if (number == 0 || number == 1) {
        return 1;
    } else {
        return number * factorial(number - 1);
    }
}//factorial
}//class

