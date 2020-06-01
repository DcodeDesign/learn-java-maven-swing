#include "stdio.h"

//*******************************************************************

#define TAILLE_TAB(tab) sizeof(tab) / sizeof(tab[0])

typedef enum { false = 0, true = 1 } bool;

typedef struct {
    float longueur;  // en cm
    float largeur;   // en cm
} Rectangle;

//*******************************************************************

// renvoie la surface du rectangle
float surfaceRect(Rectangle r) {
    /*
    float surface;
    surface = r.longueur * r.largeur;
    return surface;
     */
    return r.longueur * r.largeur;
}

// affiche un rectangle
// Rectangle: 10.00 cm * 3.90 cm = 39.00 cm2
void affRect(Rectangle r) {
    /* printf("Rectangle: %.2f * %.2f = %.2f cm2 \n", r.longueur, r.largeur, r.longueur * r.largeur ); */
    printf("Rectangle: %.2f cm * %.2f cm = %.2f cm2 \n", r.longueur, r.largeur, surfaceRect(r));
}

// inverve la longueur et la largeur
float rotationRect(Rectangle *r) {
    /*
    float temp = (*r).largeur;
    (*r).largeur = (*r).longueur;
    (*r).longueur = temp;
     */

    float temp = r->largeur;
    r->largeur = r->longueur;
    r->longueur = temp;
}

// renvoie true si c'est un carré
bool estCarre(Rectangle r) {
    /*
    if(r.largeur == r.longueur){
        return true;
    }else{
        return false;
    }
     */

    /*
    if(r.largeur == r.longueur) return true;
    else return false;
    */

    /* return (r.largeur == r.longueur)? true: false; */

    return r.largeur == r.longueur;
}

// renvoie vrai si les 2 rectangles sont identiques
// (même longueur et même largeur)
bool sontRectIdent(Rectangle r1, Rectangle r2) {
    /*
    if(r1.longueur != r2.longueur) return false;
    if(r1.largeur != r2.largeur) return false;
    return true;
     */

    return (r1.longueur == r2.longueur) && (r1.largeur == r2.largeur);

    /* Attention if(a==5 || b==2 && c==3) -> priorité au && => if(a == 5 || (b == 2 && c == 3))*/
}

// échange r1 et r2
float echangeRect(Rectangle *r1, Rectangle *r2) {
    //Rectangle *temp = &(*r1);
    Rectangle *temp = r1;
    r2 = r1;
    r1 =  temp;
}

// initialise la longueur et la largeur d'un rectangle
void initRect(Rectangle *r, float longueur, float largeur) {
    r->longueur = longueur;
    r->largeur = largeur;
}

// saisie de la longueur et de la largeur d'un rectangle
//  en réutilisant la fonction saisieFloat

float saisieFloat(float min, float max); // <- déclaration : Attention de déclarer la fonction  saisieFloat avant car elle est définie après !

void saisieRect(Rectangle *r, float longMax, float largMax) {
    /*
    float longueur;
    float largeur;

    printf("Entrez la longueur < %f: \n", longMax);
    longueur = saisieFloat(0., longMax);
    printf("Entrez la largeur < %f: \n", longMax);
    largeur = saisieFloat(0., largMax);

    r->longueur = longueur;
    r->largeur = largeur;
    */

    printf("Entrez la longueur < %f: \n", longMax);
    r->longueur = saisieFloat(0., longMax);
    printf("Entrez la largeur < %f: \n", longMax);
    r->largeur = saisieFloat(0., largMax);

}

// affiche un tableau de rectangles
void affTabRect(Rectangle tabRect[], int taille) {
    for(int i = 0; i < taille; i++){
        affRect(tabRect[i]);
    }
}

// renvoie le plus grand rectangle du tableau
//  plus grand = plus grande surface
Rectangle maxRect(Rectangle tabRect[], int taille) {
    Rectangle rmax = tabRect[0];
    for(int i = 1; i < taille; i++){
        if(surfaceRect(tabRect[i]) > surfaceRect(rmax)){
            rmax= tabRect[i];
        }
    }
    return rmax;
}

// renvoie la position d'un rectangle au sein du tableau
// renvoie -1 si pas trouvé
int posRect(Rectangle r, Rectangle tabRect[], int taille) {
    int pos = -1;
    for(int i = 1; i < taille; i++){
        if(sontRectIdent(r, tabRect[i])) return i;
    }
    return -1;
}

//*******************************************************************

// demande la saisie d'une valeur jusqu'à ce qu'elle soit comprise
// entre min et max
float saisieFloat(float min, float max) { // <- définition
    float valeur;
    scanf("%f", &valeur);

    while(valeur < min || valeur > max){
        printf("[%.2f, %.2f] ?", min, max);
        scanf("%f", &valeur);
    }
    return valeur;
}

//*******************************************************************
int main() {
    printf("---ex 01-------------affichage\n");
    Rectangle r1;
    r1.longueur = 10.0;
    r1.largeur = 3.9;
    float surf = surfaceRect(r1);
    printf("surface : %.2f cm2\n", surf);  // surface : 39.00 cm2

    printf("---ex 02-------------affRect()\n");
    affRect(r1);  // Rectangle: 10.00 cm * 3.90 cm = 39.00 cm2

    printf("---ex 03-------------rotationRect()\n");
    rotationRect(&r1);
    affRect(r1);  // Rectangle: 3.90 cm * 10.00 cm = 39.00 cm2

    printf("---ex 04-------------echangeRect()\n");
    Rectangle r2 = {25.0, 7.0};
    Rectangle r3 = {14.0, 2.0};
    echangeRect(&r2, &r3);
    affRect(r2);  // Rectangle: 14.00 cm * 2.00 cm = 28.00 cm2
    affRect(r3);  // Rectangle: 25.00 cm * 7.00 cm = 175.00 cm2

    printf("---ex 05-------------estCarre()\n");
    Rectangle rc = {7.0, 7.0};
    affRect(rc);
    if (estCarre(rc))
        printf("rc est carre\n");
    else
        printf("rc n'est pas carre\n");
    Rectangle rnc = {7.0, 7.5};
    affRect(rnc);
    if (estCarre(rnc))
        printf("rnc est carre\n");
    else
        printf("rnc n'est pas carre\n");

    printf("---ex 06-------------sontRectIdent()\n");
    if (sontRectIdent(rc, rnc))
        printf("rc et rnc sont egaux\n");
    else
        printf("rc et rnc ne sont pas egaux\n");
    if (sontRectIdent(rc, rc))
        printf("rc et rc sont egaux\n");
    else
        printf("rc et rc ne sont pas egaux\n");

    printf("---ex 06-------------saisieFloat()\n");
    float longueur;
    printf("Entrez une longueur entre 0 et 30 :");
    longueur = saisieFloat(0.0, 30.0);  // saisie d'un float entre 0.0 et 30.0
    float largeur;
    printf("Entrez une largeur entre 0 et 10 :");
    largeur = saisieFloat(0.0, 10.0);  // saisie d'un float entre 0.0 et 10.0
    Rectangle r4;
    r4.longueur = longueur;
    r4.largeur = largeur;
    affRect(r4);

    printf("---ex 07-------------initRect()\n");
    initRect(&r4, 33, 12);
    affRect(r4);  // Rectangle: 33.00 cm * 12.00 cm = 396.00 cm2
    initRect(&r4, 33, -2);
    affRect(r4);  // Rectangle: 33.00 cm * 0.00 cm = 0.00 cm2

    printf("---ex 08-------------saisieRect()\n");
    Rectangle r5;
    saisieRect(&r5, 100.0, 50.0);
    affRect(r5);

    printf("---ex 09-------------affTabRect()\n");
    Rectangle tabRect[] = {{5, 2}, {3, 1}, {4, 1.5}};
    int taille = TAILLE_TAB(tabRect);
    affTabRect(tabRect, taille);

    printf("---ex 10-------------maxRect()\n");
    Rectangle r6;
    r6 = maxRect(tabRect, taille);
    affRect(r6);  // Rectangle: 5.00 cm * 2.00 cm = 10.00 cm2

    printf("---ex 11-------------posRect()\n");
    Rectangle r7 = {25.0, 7.0};
    Rectangle r8 = {3, 1};
    int posR7 = posRect(r7, tabRect, taille);
    printf("Position de r7: %d\n", posR7);  // Position de r7: -1
    int posR8 = posRect(r8, tabRect, taille);
    printf("Position de r8: %d\n", posR8);  // Position de r8: 1

    printf("---ex 12-------------modif ds tableau\n");
    // remplacez le plus grand (plus grande surface) rectangle par un rectangle de
    // taille 0 * 0
    //
    //
    //
    affTabRect(tabRect, taille);

    return 0;
}