import InheritenceAndConstructors.User;

import java.util.SplittableRandom;

public class Insturctor extends User {
    public Insturctor(String name, String email, String password){
        super(name,email,password);
        System.out.println("consuctor of instuctor");
    }
}
