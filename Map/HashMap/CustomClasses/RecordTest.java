// Program to Test a record class in HashMap.

/*
 * Here Record class is final and immutable also it internally
 * Overrides both hashcode() and equals() methods so we don't need
 * to define them explicitly.
*/

package CustomClasses;

import java.util.HashMap;

public class RecordTest {
    public static void main(String[] args) {
        
        Manager m1 = new Manager(101, "Alen");
        Manager m2 = new Manager(101, "Alen");

        HashMap<Manager, String> map = new HashMap<>();
        map.put(m1, "Pune");
        map.put(m2, "Hyderabad");

        System.out.println("Size of Map : " + map.size());
        System.out.println("Is Both Managers are Equal? : " + m1.equals(m2));
        System.out.println(map);

    }
}

record Manager(Integer id, String name){}

/* Output:
 * Size of Map : 1
 * Is Both Managers are Equal? : true
 * {Manager[id=101, name=Alen]=Hyderabad}
 */