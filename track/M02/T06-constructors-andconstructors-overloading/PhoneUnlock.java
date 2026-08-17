class Mobile{
    void unlock(PatternUnlock p){
        System.out.println("Unlocked using pattern");
    }

    void unlock(int pin){
        System.out.println("Unlocked using pin");
    }

    void unlock(String password){
        System.out.println("Unlocked using password");
    }

    void unlock(FaceUnlock u){
        System.out.println("Unlocked using face");
    }

    void unlock(FingerPrint fp){
        System.out.println("Unlocked using fingerprint");
    }
}
class PatternUnlock{

}
class FaceUnlock{

}

class FingerPrint{

}

public class PhoneUnlock {
    public static void main(String[] args) {

        Mobile m = new Mobile();
        FaceUnlock f = new FaceUnlock();
        PatternUnlock p = new PatternUnlock();
        FingerPrint fp = new FingerPrint();
        
        m.unlock(fp);
    }
}
