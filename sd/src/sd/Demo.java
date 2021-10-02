
package sd;

public class Demo implements Inf2// implements Inf1
{
    public void method1(){
	System.out.println("method1");
    }
    void method2(){
	System.out.println("method2");
    }
    public static void main(String args[]){
	Inf2 obj = new Demo();
	obj.method2();
    }
}
