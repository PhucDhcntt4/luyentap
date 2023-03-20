import java.util.Scanner;
import java.util.ArrayList;

class Hinh{
	private String Tenhinh;
	private float Dientich;
	private float Chuvi;

	public Hinh(String Tenhinh, float Dientich, float Chuvi) {

		this.Tenhinh = Tenhinh;
		this.Dientich = Dientich;
		this.Chuvi = Chuvi;
	}

	public String getTenhinh(){
		return Tenhinh;
	}

	public void setTenhinh(String Tenhinh){
		this.Tenhinh = Tenhinh;
	}

	public float getDientich(){
		return Dientich;
	}

	public void setDientich(float Dientich){
		this.Dientich = Dientich;
	}

	public float getChuvi(){
		return Chuvi;
	}

	public void setChuvi(float Chuvi){
		this.Chuvi = Chuvi;

	} 
	@Override 
	public String toString(){
		return"Hinh Hoc [Ten hinh :" + Tenhinh +", Dien tich :" + Dientich + " Chu Vi :" + Chuvi ;
	}
}

class DanhSachHinh{
	private ArrayList<Hinh> danhsach;

public DanhSachHinh(){

}

public DanhSachHinh(ArrayList<Hinh> danhsach){
	this.danhsach = danhsach;
}

public void themHinh(Hinh h){

	this.danhsach.add(h);
	}

	public void inDanhSachhinh(){

		for(Hinh hinh: danhsach ){
			System.out.println( hinh );
		}
	}
}



public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DanhSachHinh dsh = new DanhSachHinh();
		int luachon = 0;
		do{
			System.out.println("==============MENU==============");
			System.out.println(
				"1.Them Hinh vao Danh Sach\n "
				+"2.in danh sach\n "
				+"0.khong co thao tac vui long nhap lai ");
			System.out.println("Vui long chon phuong thao tac :");
			luachon = sc.nextInt();
				sc.nextLine();
				if(luachon == 1){

					System.out.println("Nhap Ten Hinh :"); String Tenhinh = sc.nextLine();
					System.out.println("Nhap Dien tich:"); float Dientich = sc.nextFloat();
					System.out.println("Nhap chu vi:"); float Chuvi = sc.nextFloat();
					Hinh h = new Hinh(Tenhinh, Dientich, Chuvi );
					dsh.themHinh(h);
				}else if(luachon == 2 ){

					dsh.inDanhSachhinh();

				}
	
		}while(luachon!=0);
	}
}