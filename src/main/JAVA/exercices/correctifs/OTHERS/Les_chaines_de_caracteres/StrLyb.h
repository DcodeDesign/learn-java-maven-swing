//
// Created by Thomas Gravy on 2020-01-18.
//

#ifndef LES_CHAINES_DE_CARACTERES_STRLYB_H
#define LES_CHAINES_DE_CARACTERES_STRLYB_H
// longStr(char str[]) // return int => longeur des caractère
int longStr(char str[]){
    int longeur = 0;
    while(str[longeur] != '\0'){
        longeur++;
    }
    return longeur;
}

int compareStr(char *str1, char *str2){
    int i = 0;
    int flag = 0;
    while(str1[i] != '\0' && str2[i] != '\0'){
        flag = 1;
        i++;
    }
    return flag;
}

// int palindrome(nom) // -> 0 faux -> vrai -> 1
int palindrome(char nom[]){
    int taille = strlen(nom);

    for(int i = 0; i < taille/2; i++){
        if(nom[i] != nom[taille-1-i]) return 0;
    }
    return 1;
}
#endif //LES_CHAINES_DE_CARACTERES_STRLYB_H
