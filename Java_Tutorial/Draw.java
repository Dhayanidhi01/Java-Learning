package Java_Tutorial;

public class Draw {

	String Draw;
	
	Draw(){
		
		System.out.println("Draw object created");
	}
	
	Draw(String toDraw){
		Draw=toDraw;
		System.out.println("Drawing " + toDraw);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Draw draw=new Draw();
Draw draw1=new Draw("circle");
	}

}
