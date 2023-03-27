abstract class Xe{

abstract public void  brake();
}

class xemaythethao extends Xe{

	@Override
	public void brake(){

		System.out.println("PHANH xe may the thao chat luong !");
	}
}

class xemayleonui extends Xe{
	@Override
	public void brake(){

		System.out.println("phanh xe may leo nui chat luong cao");
	}
}

public class TT{

public static void main(String[] args) {
	
	xemaythethao xmt = new xemaythethao();
	xmt.brake();

	xemayleonui xmn = new xemayleonui();
	xmn.brake();
	
}
}