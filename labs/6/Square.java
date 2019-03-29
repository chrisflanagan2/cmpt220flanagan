package lab6;
//lots of questions
public class Square {
	private double width;

	public Square(){
		width=1;
	}

		public Square(double width){			
			this.width=width;
		}

			public double getWidth() {				
				return width;
			}
			
				public double getPerimeter(){
					return 4.0*(width);
				}

					public double getArea() {	
						return width*width ;
					}

}

