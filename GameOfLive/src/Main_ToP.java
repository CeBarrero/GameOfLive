import processing.core.PApplet;

public class Main_ToP extends PApplet{

public static void main(String[] args) {
		
		PApplet.main("Main_ToP");
	
	}
	
	int square_size = 20, width = 100 , height = 140;
	Estructura_ToP top = new Estructura_ToP(width , height);
	
	public void settings() {
		
		  size(width * square_size , height * square_size);
		  
		}

		public void draw() {
			
		  background(50);
		  
		  for(int i = 0 ; i< height ; i++)
		  {
			  for(int j = 0; j < width; j++)
			  {
				  if(top.Cellular_automata[i][j] == 1)
				  
					  fill(0,0,255);
				  else
					  fill(0);
				  
				  rect(j*square_size , i * square_size , square_size , square_size);
				  
				  
			  }
				  
			  try
			  {
				  
				  Thread.sleep(10);
				  top.nextIteration();
				  
			  }catch(Exception e){e.printStackTrace();}
			 
		  }
		  
		}
	
}
