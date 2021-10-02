package pakegnam;


public class Triangle {
int height;
 double base;
 int w;
 public void Triangle (int he, int wi){
 height= he;
 base= wi;
 }
 public int computeArea(){
     
    return height*w;
 }
 public void printInfo(){
 System.out.println("height is: " +height+",base is: "+base);
 }
}