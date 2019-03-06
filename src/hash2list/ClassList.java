
package hash2list;

import java.util.ArrayList;

/**
 * @author Hector Pose Carames
 */
public class ClassList implements InterfaceList {

    public ArrayList<String> lista = new ArrayList<String>();

    @Override
    public void putElement(String e) {
        lista.add(e);
    }

    @Override
    public String getElement(int pos) {
        return lista.get(pos);
    }
}
