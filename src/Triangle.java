package triangle;

public class Triangle {
	private int a,b,c;
	
	public Triangle() {
		super();
	}

	public Triangle(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public String judgeTriangle(int a,int b,int c){
		if(a+b>c&&a+c>b&&b+c>a){
			if(a==b&&a==c)return "equilLateral";
			else if(a==b||a==c||b==c) return "isSosceles";
			else return "scalene";
		}
		else return "notTriangle";
	}
}
