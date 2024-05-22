
package tugaslaprog4;


public class lingkaran {
    protected String warna;
    protected double r;
    
    
    public lingkaran(String warna, double r){
        this.r = r;
        this.warna = warna;
    }
    
    public String getWarna(){
        return warna;
    }
    
    public void setWarna(String warna){
        this.warna = warna;
    }
    public double getR(){
        return r;
    }
    
    public void setR(double r){
        this.r = r;
    }
    
    public double luasLingkaran(double r){
        return Math.PI *r*r;
    }
    
    public void info(){
        System.out.println("warna lingkaran adalah "+warna);
    }
    
}
