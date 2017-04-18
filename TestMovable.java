import com.nata.*;
import com.nata.animals.*;
import com.nata.vehicles.*;

/**
 * Created by nata on 19.04.2017.
 */
public class TestMovable {


    public static void main(String[] args) {
        Movable [] ent = new Movable [10] ;
        ent[0] = new Bird(30);
        ent[1] = new Mammal(20);
        ent[2] = new Car();

        int i = 10;
        for (Movable m:ent){
            if (m!=null){
                m.move(i++);
            }
        }
    }

}
