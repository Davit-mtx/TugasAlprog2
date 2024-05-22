
package tugaslaprog4;


public class silinder extends lingkaran{
    private double t;
    
    public silinder(String warna, double r, double t){
        super(warna, r);
        this.t = t;
    }
    
    public double getT(){
        return t;
    }
    
    public void setT(double t){
        this.t = t;
    }
    
    public double volumeSilinder(double r, double t){
        return Math.PI * r * r * t;
    }
    
    public void info(){
        System.out.println("Hasil luas lingkaran = "+this.luasLingkaran(r));
//        System.out.println("warna silinder adalah "+warna);
        super.info();
        System.out.println("Volume silinder = " + volumeSilinder(r, t)+ "\n");
    }
}

