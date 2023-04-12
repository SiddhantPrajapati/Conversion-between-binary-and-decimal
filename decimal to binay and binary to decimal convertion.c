#include<stdio.h>
#include<math.h>
int main(){
    int n , bi, i = 0, ch, sum = 0,rem ;
    printf("Enter your:\n1)Binary to Int conversion \n2)Int to Binary conversion \n");
    scanf("%d",&ch);
    switch(ch){
        case 1:printf("Enter Binary NO:");
               scanf("%d",&bi);
               do{
                   rem = bi % 10;
                   sum = sum + rem * pow(2,i);
                   bi = bi / 10;
                   i++;
               }while(bi > 0);
               printf("decimal=%d",sum);
               break;
         case 2:printf("Enter decimal NO:");
                scanf("%d",&n);
                do{
                    rem = n % 2;
                    sum = sum + rem * pow(10,i);
                    n = n / 2;
                    i++;
                }while(n > 0);
                printf("Decimal=%d -> Binary=%d",n,sum);
                break;
        case 3:default :printf("Enter valid choice.");
               break;
    }
}
