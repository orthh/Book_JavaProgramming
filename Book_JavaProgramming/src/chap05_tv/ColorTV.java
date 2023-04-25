package chap05_tv;

public class ColorTV extends TV{

	int color;
	
	public ColorTV(int size, int color) {
		super(size);
		this.color = color;
	}
	public void printProperty() {
		System.out.println(super.getSize()+ "인치 " + color + "컬러");
	}
	
}
