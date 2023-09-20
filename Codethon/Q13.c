#include <stdio.h>
int main(){
    int op,l,b,Area=1,r; 
    float pi=3.14;
    printf("enter op");
    scanf("%d",&op);

    switch(op){

        case 11:
        printf("enter radius of circle:");
        scanf("%d",&r);
        Area=pi*r*r;
        printf("Area of circle= %d",Area);
        break;

        case 22:
        printf("enter l and b");
        scanf("%d%d",&l,&b);
        Area=l*b;
        printf("Area of rectangle= %d",Area);
         break;


        case 33:
        printf("enter value of l");
        scanf("%d",&l);
        Area=l*l;
        printf("Area of square=%d",Area);
         break;

        case 44:
        printf("enter l and b");
        scanf("%d%d",&l,&b);
        Area=(l*b)/2;
        printf("Area of rectangle=%d",Area);
         break;

        default:
        printf("invalid op");

    }

    

}