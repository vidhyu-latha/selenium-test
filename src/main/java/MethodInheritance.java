
class A{
    public A(){
        System.out.println("A constructor") ;
    }
    void msg(){System.out.println("Hello");}
}
class B extends A{
    public B(){
        System.out.println("B constructor");
    }
    void msg(){System.out.println("Welcome");}
}
class C extends B {
    public C(){
        System.out.println("C constructor");
    }
public static void main(String args[]){

    C obj=new C();
    obj.msg();//Now which msg() method would be invoked?

}
}