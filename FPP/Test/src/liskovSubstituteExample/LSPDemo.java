package liskovSubstituteExample;

public class LSPDemo {
	
	public void calculateArea(Rectangle r) {
        r.setBreadth(2);
        r.setLength(3);
        
        if(r.getArea() == 6) {
        	System.out.println("6");
        }else {
        	printError("area", r);
        }
        
        if(r.getLength() == 3) {
        	System.out.println("3");
        }else {
        	printError("length", r);
        }
        
        if(r.getBreadth() == 2) {
        	System.out.println("2");
        }else {
        	printError("breadth", r);
        }
        
    }

    private void printError(String errorIdentifer, Rectangle r) {
    	System.out.println("Unexpected value of " + errorIdentifer + "  for instance of " + r.getClass().getName());
    }

    public static void main(String[] args) {
        LSPDemo lsp = new LSPDemo();
        System.out.println("Rectangle");
        lsp.calculateArea(new Rectangle());

        System.out.println("Square");
        lsp.calculateArea(new Square());
    }

}
