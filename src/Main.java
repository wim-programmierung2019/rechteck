import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;

public class Main {
    
    /**
     * Rechteck
     */
    public static void main(String[] args){
        
        
        
        Rechteck eck = new Rechteck(5, 10);
        Rechteck eckGross = new Rechteck(100, 10);
      
        System.out.println(eck.flaeche());
        System.out.println(eckGross.istGroesserAls(eck));


        
        
        
        //JUnitCore junit = new JUnitCore();
        //junit.addListener(new TextListener(System.out));
        //junit.run(SortierungTest.class);
    }
    
}
