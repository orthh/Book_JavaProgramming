package chap05_Converter;

public class Km2Mile extends Converter{

	public Km2Mile(double ratio) {
		super.ratio = ratio;
	}
	
	@Override
	protected double convert(double src) {
		return src / super.ratio;
	}

	@Override
	protected String getSrcString() {
		// TODO Auto-generated method stub
		return "Km";
	}

	@Override
	protected String getDestString() {
		// TODO Auto-generated method stub
		return "Mile";
	}
	
}
