 import java.util.Scanner;

// class Hinh{
// 	private double dientich ;
	


// 	public double getdientich(){

// 		return dientich;
// 	}

// 	public void setdientich(){
// 		this.dientich = dientich;
// 	}

// }

// class HinhChuNhat extends Hinh(){

// 	 float cd ;
// 	 float cr ;

// public double getcd(){

// 		return cd;
// 	}

// 	public void setcd(){
// 		this.cd = cd;
// 	}

// 	public double getcr(){

// 		return cr;
// 	}

// 	public void setcr(){
// 		this.cr = cr;
// 	}

// 	public String toString(){

// 		return "\nHinh chu nhat :" + "cd:" + this.cd + "\n cr:" + this.cr;
// 	}

// 	@Override 
// 	  doublle dientich(){
// 		return cd*cr;

// 	}
// }

// class 	Hinhtron extends Hinh{

// 	private float r ;


	
// 	public double getr(){

// 		return r;
// 	}

// 	public void setr(){
// 		this.r = r ;
// 	}

// 	public String toString(){

// 		return "\nHinh Tron:" + " r " + this.r ;
// 	}

// 	@Override
// 	 double dientich(){
// 		return r*r*3.14;
// 	}
// }

// public class cau2{

// 	public static void main(String[] args) {
// 		Hinhtron ht = new Hinhtron();
// 		Scanner sc = new Scanner(System.in);
// 		System.out.println("Nhap ban kinh: ");
// 		ht.setcr(sc.nextDouble());
// 			}
// }
class Hinh {
    protected double Dientich;
    public Hinh(double Dientich)
    {
        super();
        this.Dientich = Dientich;
    }
    public double getDientich(){
        return this.Dientich;
    }
}

class Hinhchunhat extends Hinh {
    private float cd;
    private float cr;
    public Hinhchunhat(float cd, float cr){
    super(cr);
    this.cd = cd;
    this.cr = cr;
    }
    public double getDientich(){
        return this.cd*this.cr;
    }
    public String toString() {
        return "Hinh{" +
                "Dientich=" + Dientich +
                '}';
    }
}

class Hinhtron extends Hinh {
    private float r;
    public Hinhtron(float r){
        super(r);
        this.r = r;
    }
    public double getDientich(){
        return this.r*2*Math.PI;
    }
    public String toString() {
        return "Hinh{" +
                "Dientich=" + Dientich +
                '}';
    }
}

public class cau2 {
    public static void main(String[] args) {
        Hinhtron ht = new Hinhtron( 5);
        System.out.println("Dien tich hinh tron = :"+ ht.getDientich());
        Hinhchunhat hcn = new Hinhchunhat(12, 2);
        System.out.println("Dien tich hinh chu nhat = :"+ hcn.getDientich());
    }
}