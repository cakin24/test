package Staticproxy;

public class Father implements Person {
    private Son son;
    public Father(Son son){
        this.son = son;
    }

    public void findLove() {
        System.out.println("父亲物色对象");
        this.son.findLove();
        System.out.println("双方同意交往");
    }
}
