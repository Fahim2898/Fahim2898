/*package;  class Triangle { int height;  double base;
 Triangle (int height, int w){height=height;  base=w;}
 void computeArea(){
 return height*w*changeValue(2);}
 void printInfo(){ System.out.println("height is:"+h+",base is:"+w);}}*/
package question.pkg4;
public class Triangle {
 int height;
 int base;
 public void triangle (int h, int w){
 height= h;
 base=w;
 }
 public double computeArea(){
 return (height*base)/2;
 }
 public void printInfo(double f){
 System.out.println("height is:"+height +",base is:"+base +"Area is:"+f);
 }
}
