package chap05_Converter;

public class Won2Dollar extends Converter{
	
	public Won2Dollar(int ratio) {
		super.ratio = ratio;
	}

	@Override
	protected double convert(double src) {
		return src / super.ratio;
	}

	@Override
	protected String getSrcString() {
		return "원";
	}

	@Override
	protected String getDestString() {
		// TODO Auto-generated method stub
		return "달라";
	}
	
}
