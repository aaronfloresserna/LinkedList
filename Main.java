/*
Aaron flores
2021
*/

package StructureData;

public class Main {
    public static void main(String args[]){
        
        Book book1 = new Book("Harry potter", "J.K Rolling", "true");
        Book book2 = new Book("Lord of the rings", "J.K Rolling", "false");
        Book book3 = new Book("Twilight", "AA Martin", "true");
        Book book4 = new Book("Cracking the code interview", "AA Martin", "true");

        Lista lista = new Lista();
        lista.insertNodeBegin(book1);
        lista.insertNodeBegin(book2);
        lista.insertNodeBegin(book3);
        lista.insertNodePosition(1,book4);

        //System.out.println(lista.getBookByPosition(2));
        lista.iterate();

    }
}
