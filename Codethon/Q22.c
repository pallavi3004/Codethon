#include<stdio.h>
int main(){

    fibo();

}

void fibo();
void fibo(){
     int i ,n, a=0,b=1,sum=0 ;
    printf("enter the value");
    scanf("%d",&n);
    printf("%d %d",a ,b);

    for(i=1;i<=n;i++)
    {
        sum=a+b;
        printf(" %d",sum);
        a=b;
        b=sum;

    }
    
    }
    

    



