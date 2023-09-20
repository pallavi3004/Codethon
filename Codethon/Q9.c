#include<stdio.h>

main()
{
   int num1, num2;
   int prod = 0;
 
   printf("Enter two numbers \n");
   scanf("%d %d", &num1, &num2);
 
     while(num2){
      
       prod =prod+ num1;
 
       num2--;
     }
 
   printf("Multiplication of two numbers is %d",prod);
}