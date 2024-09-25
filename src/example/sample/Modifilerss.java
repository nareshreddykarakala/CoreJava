package example.sample;

public class Modifilerss {

    public void m1(){
        System.out.println("public modifier");
    }

    private void m2(){
        System.out.println("private modifer");
    }

    void m3(){
       System.out.println("defult");
    }

    protected  void m4(){
        System.out.println("protected");
    }

    public static void main(String[] args) {
        Modifilerss modifilerss = new Modifilerss();
        modifilerss.m1();
        modifilerss.m2();
        modifilerss.m3();
        modifilerss.m4();
    }
}
