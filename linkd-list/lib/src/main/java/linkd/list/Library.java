/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linkd.list;

public class Library {


     public static void main(String[] args){

         LinksList linksList = new LinksList();
         System.out.println(linksList.toString());
         linksList.insert("a");
         linksList.insert("b");
         linksList.insert("c");
         System.out.println(linksList.toString());
     }
}
