
package tugaslaprog4;


public class testtitik {


    public static void main(String[] args) {
        titik titik1 = new titik(4, 6);
        
        titik titik2 = new titik(5, 6);
        
        titik hasilgeser = new titik();
        
        hasilgeser = titik1.geser(titik2);
        System.out.println("hasil geser (" + hasilgeser.getX()+", "+hasilgeser.getY()+")");
        
        titik1.kuadran();
        
        System.out.println("jarak titik1 ke titik2 yaitu "+titik1.jarak(titik2));
        
        if(titik1.segaris(titik2))
            System.out.println("segaris");
        else System.out.println("tidak segaris");
    }
    
}
