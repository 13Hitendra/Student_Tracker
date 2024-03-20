package Inner_Class;
// static in inner class
public class Static_inner {
    private static int b = 10;
    
    
    public class InnerClass {
        private static  int d = 20; 
        
        public void display() {
            System.out.println("Outer static : " + b);
            System.out.println("Inner static : " + d);
        }
    }
    
    public static void main(String[] args) {
    	Static_inner outerObject = new Static_inner();
    	Static_inner.InnerClass io = outerObject.new InnerClass();
        io.display();
        System.out.println(io.d);
    }
}
