
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;

/**
 *
 * @author Dominique
 */
public class Ex09_01 {

  // ----------------------------------------------------------------
  public static void main(String[] args) {

    // un tableau d'entiers,
    //   taille <= tabInt.length,
    //   accès au 2ème élément <= tabInt[1]
    //   pas d'ajout ni de suppression possible
    int[] tabInt = new int[3]; // réservation d'un tableau de 3 entiers
    tabInt[0] = 123; // initialisation du 1er entier
    tabInt[1] = 234; // initialisation du 2eme entier
    tabInt[2] = 345; // initialisation du 3eme entier
    //tabInt[3] = 444; // erreur, car impossible d'agrandir le tableau
    for (int i = 0; i < tabInt.length; i++) {
      System.out.println(i + " " + tabInt[i]);
    }

    // une liste d'entiers (ArrayList, LinkedList)
    //    taille <= listInt.size(),
    //    accès au 2ème élément <= listInt.get(1)
    //    ajout d'un élement avec add() et suppression avec remove()
    //  remarque: pas de liste de type primitif List<int>, mais uniquement des classes List<Integer>
    List<Integer> listInt = new ArrayList<Integer>(); // réservation d'une liste d'entiers vide
    listInt.add(123); // ajout d'un entier à la liste (nouvelle taille = 1)
    listInt.add(234); // ajout d'un entier à la liste (nouvelle taille = 2)
    //listInt.add("eeeee"); // erreur, car c'est une liste d'entiers
    listInt.add(444);
    for (int i = 0; i < listInt.size(); i++) {
      System.out.println(i + " " + listInt.get(i));
    }

    // une liste de n'importe quoi (des objets)
    ArrayList lst = new ArrayList();
    lst.add(123);
    lst.add("Hello");
    lst.add(new JButton("aa"));

    for (int i = 0; i < lst.size(); i++) {
      System.out.println(lst.get(i));
    }

  }

  // ----------------------------------------------------------------
  // ----------------------------------------------------------------
}
