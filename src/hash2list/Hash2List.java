
package hash2list;

import java.util.ArrayList;

/**
 * @author Hector Pose Carames
 */
public class Hash2List extends ClassList {

    public Hash2List(ClassHash mapHash) {
//        Iterator it = mapHash.mapHash.keySet().iterator();
//        while (it.hasNext()) {
//            lista.add(mapHash.mapHash.get(it.next()));
//        }

        lista = new ArrayList<String>(mapHash.map.values());

    }

}
