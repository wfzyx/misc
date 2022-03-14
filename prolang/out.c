#include <stdio.h>
#include <string.h>

static const char * fizzbuzz(int n)
{
    static char phi[9] = "";
    if(n % 15 == 0)
        strcpy(phi, "FizzBuzz");
    else if(n % 5 == 0)
        strcpy(phi, "Buzz");
    else if(n % 3 == 0)
        strcpy(phi, "Fizz");
    else
        sprintf(phi, "%d", n);
    return phi;
}

int main(int argc, char *argv[])
{
    for(int i = 1; i < 100; i++)
    {
        printf("%s ", fizzbuzz(i));
    }
    printf("\n");
}
