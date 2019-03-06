
package hash2list;

/**
 * @author Hector Pose Carames
 */
public class AdapterHash2List {

    public static void main(String[] args) {

       
        ClassHash miHash = new ClassHash();
        miHash.putValue(10, "uno");
        miHash.putValue(11, "dos");
        miHash.putValue(12, "tres");

        Hash2List miHash2List = new Hash2List(miHash);
        MostrarClassList.Mostrar(miHash2List);
    }

}
