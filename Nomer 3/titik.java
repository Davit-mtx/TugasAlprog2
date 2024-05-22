
package tugaslaprog4;


public class titik {
    private int x;
    private int y;
    
    titik(){
        x=0;
        y=0;
    }
    
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x=x;
    }
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y=y;
    }
    
    public titik(int x, int y){
        this.x=x;
        this.y=y;
    }
    
    public titik geser(titik p){
        titik a = new titik();
        
        a.x= this.getX()+p.getX();
        a.y= this.getY()+p.getY();
        return a;
    }
    
    public void kuadran(){
        if(x==0&&y==0)System.out.println("Titik berada di pusat");
        else if(x==0)System.out.println("Titik berada di sumbu Y");
        else if(y==0)System.out.println("Titik berada di sumbu X");
        else if(x>0&&y>0)System.out.println("Titik berada di kuadran 1");
        else if(x<0&&y>0)System.out.println("Titik berada di kuadran 2");
        else if(x<0&&y<0)System.out.println("Titik berada di kuadran 3");
        else if(x>0&&y<0)System.out.println("Titik berada di kuadran 4");
    }
    
    public double jarak(titik p1){
        int vx = this.getX()-p1.getX();
        int vy = this.getY()-p1.getY();
        int hasil = vx*vx+vy*vy;
        
        return hasil;
    }
    
    public boolean segaris(titik p1){
        boolean hasil;
        
        hasil = this.getX()==p1.getX()||this.getY()==p1.getY();
        return hasil;
    }
}
