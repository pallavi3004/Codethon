#include<stdio.h>
int main(){

    int num,r,mul=1;
    printf("enter the num");
    scanf("%d",&num);

    for(int i=1;i<=num;i++){
        r=num%10;               
        mul=mul*r;              
        num=num/10;
    }
    printf("Product of digits= %d",mul);

}