#include <stdio.h>
#include <string.h>
#include "strLyb.h"

int main() {
    char nom[20]; // 19 caractères + \0

    char ex[20] = "zdd ezfd zdzf";
            // \" => "
            // \0 => code(0)
            // \\ => \
            // \n => retour chariot
            // \t => tabulation

    char ex2[10] = "zdd ezfd";

    printf("\n--- Longeur : \n");
    printf("%d \n", longStr(ex));

    printf("\n--- Compare : \n");
    compareStr(ex,ex2);
    printf("%d \n", compareStr(ex,ex2));

    printf("\n--- Palindrome : \n");
    char texte2[11] = "KAYAK";
    int result2 = palindrome(texte2);
    printf("%d \n", result2);

    return 0;
}