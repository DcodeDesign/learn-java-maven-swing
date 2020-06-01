## Consignes pour les exercices EX05_fen** :

Gestion des évènements souris avec MouseListener.
Par facilité, utilisez un FlowLayout, mais ce n'est pas une obligation.

- Ex05_fen01:
  Le bouton change de couleur chaque fois que l'on clique dessus.
  Vert -> Rouge -> Vert -> Rouge -> ...

- Ex05_fen02:
  La couleur du fond passe en Vert tant que l'on maintient le bouton enfoncé.
  La couleur revient à la couleur de base lorsqu'on relâche le bouton.

- Ex05_fen03:
  La couleur du bouton change lors du survol.
  Il revient à sa couleur initiale lorsqu'on arr^te de le survoler.

- Ex05_fen04:
  Idem Ex05_fen03, mais avec 2 boutons.

- Ex05_fen05:
  Le texte du bouton indique si l'on clique avec quel bouton de la souris on clique.
  Il revient à son texte d'origine lorsqu'on relâche le bouton.

- Ex05_fen05:
  Le texte du bouton indique si l'on clique avec quel bouton de la souris on clique.
  Il revient à son texte d'origine lorsqu'on relâche le bouton.

- Ex05_fen06:
  10 boutons libellés de "0" jusque "9" (utilisez une boucle si possible).
  Chaque clic sur un bouton ajoute le chiffre dans une zone de texte.
  1 bouton "Effacer" pour effacer la zone de texte.

- Ex05_fen07:
  idem Ex05_fen06 +
  1 bouton "<-" pour effacer la le dernier chiffre entré.
  Attention aux erreurs possibles !

- Ex05_fen08:
  une zone de texte affichant 0
  un bouton "-" pour diminuer la valeur du nombre affiché
  un bouton "+" pour augmenter la valeur du nombre affiché
  un bouton "Reset" pour remettre le nombre à 0

- Ex05_fen09:
  idem Ex05_fen08 +
  limites pour le nombre entre 0 et 10

- Ex05_fen10:
  idem Ex05_fen09 +
  progressbar qui représente la valeur du nombre

- Ex05_fen11:
  idem Ex05_fen10 +
  couleur de la progressbar rouge si nombre < 5, vert si nombre >= 5

## Consignes pour les exercices EX06_fen** :

Gestion des évènements clavier avec KeyListener.
Par facilité, utilisez un FlowLayout, mais ce n'est pas une obligation.

- Ex06_fen01:
Indique si une touche UniCode (un caractère) est enfoncée (keyTyped)
Indique si une touche (caractère ou shift, ctrl...) est enfoncée (keyPressed)
Indique si une touche est relâchée (keyReleased)

- Ex06_fen02:
Affiche le code (getKeyCode) ou le caractère (getKeyChar) de la touche enfoncée (keyPressed)

- Ex06_fen03:
Affiche le contenu de la zone de texte
  lorqu'on enfonce la touche
  lorsqu'on relâche la touche
  lorsqu'un caractère est tapé

- Ex06_fen04:
La zone de texte n'accepte que les majuscules (isUpperCase)
et refuse les autres en stoppant l'évènement (consume)
(keyTyped)

- Ex06_fen05:
La 1ère zone de texte n'accepte que les majuscules (isUpperCase)
La 2ème zone de texte n'accepte que les chiffres

- Ex06_fen06:
La zone de texte n'accepte que les consonnes
(personnellement, j'utilise indexOf)

- Ex06_fen07:
Les flèches de direction affichent :
  je tourne à droite
  je tourne à gauche
  j'accélère
  je freine
et ajoute la lettre D G A ou F dans la zone de texte.
Les codes spéciaux se touvent dans KeyEvent (VK_RIGHT...)

- Remarques:
keyTyped représente le caractère (getKeyChar): Shift + a => "A"
                    keyCode vaut 0
keyPressed prend en compte toutes les touches (Shift, Ctrl...)
         et dispose d'un code pour chaque (getKeyCode)
         mais pas nécessairement de caractère (getKeyChar)

## Consignes pour les exercices EX07_fen** :

Utilisation simple du GridBagLayout Manager

- Ex07_fen01:
  Afficher 9 boutons numérotés de 1 à 9 dans une grille 3 * 3

- Ex07_fen01b:
  Idem, mais en utilisant une boucle et une constante TAILLE qui donne la taille de la grille (3 => 3*3...)

- Ex07_fen02:
  Idem, mais en affichant uniquement les nombres impairs

- Ex07_fen03:
  Affichez 100 boutons dans une grille 10 * 10.
  Lorsqu'on clique sur le bouton, il est désactivé.

- Ex07_fen04:
  Affichez 100 boutons dans une grille 10 * 10.
  Lorsqu'on survole un bouton, sa couleur et la couleur de tous ses multiples change.

- Ex07_fen05:
  Affichez 100 boutons dans une grille 10 * 10.
  Lorsqu'on survole un bouton, sa couleur et la couleur de tous ses multiples change.
  Lorsqu'on clique sur le bouton, il est désactivé, ainsi que tous ses multiples.

## Consignes pour les exercices EX08_pendu :

- Ex08_01_lettres:
  Afficher 26 boutons avec les lettres de l'alphabet.
  Le texte affiché doit être en "Courier" 28 gras

- Ex08_01_lettres:
  Créez 2 panels avec une bordure et placez ces panels dans le panel conteneur.
  Dans panel 1 : zone de texte non éditable, en Courier 28 gras
  Dans panel 2 : les 26 boutons de l'exercice 1
  Chaque clic sur un bouton ajoute la lettre dans la zone de texte

- Ex08_03_mot:
  zone de texte éditable, en Courier 28 gras qui ne doit accepter que des lettres majuscules (A..Z)

- Ex08_04_mot:
  idem ex03 + un bouton "Start"
  Clic sur start =>
    désactivation du bouton "Start"
    la zone de texte n'est plus éditable
    remplacement dans la zone de texte de chaque caractère par un point (ou tiret...)

- Ex08_05_pendu:
  2 panels avec une bordure dans le panel conteneur.
  Dans panel 1 : zone de texte éditable + bouton start
  Dans panel 2 : les 26 boutons de l'exercice 1 désactivés
  Clic sur start =>
    idem ex04 + activation des 26 boutons du panel 2

- Ex08_06_pendu:
  idem ex05 + clic sur un bouton lettre =>
    affichage de la lettre dans la zone de texte à la bonne place
      (ou aux bonnes places si lettre existe plusieurs fois dans le mot)
      en remplacement de l'underscore
    désactivation du bouton cliqué

  Attention: un évènement keyPressed sur un bouton désactivé est toujours possible
  vérifier avec isEnabled() ou utilisez ActionListener

- Ex08_07_pendu:
  idem ex06 + lorsque toutes les lettres du mot sont trouvées =>
    désactivations de tous les boutons "lettre"
