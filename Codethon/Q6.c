#include<stdio.h>
int main(){
    int num;
    printf("enter the num");
    scanf("%d",&num);

    for(int i=1;i<=num;i++){
       if(i%2==0){
            printf("even no=%d \n",i);
        }

    }
     
       
}