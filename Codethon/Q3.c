#include<stdio.h>
int main(){
    
    int i,num,count=0;
    printf("enter the num");
    scanf("%d",&num);
    for( i=2;i<num;i++){
       if(num%i==0){
         count++;
    }
    }
    if(count==1){
        printf("not prime no");
    }else
     printf("prime no");
    
}