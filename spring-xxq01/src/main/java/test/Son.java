package test;

public class Son extends Father {
	private int ids;

	public int getIds() {
		return ids;
	}

	public void setIds(int ids) {
		this.ids = ids;
	}

	public Son() {
	}

	public Son( int ids) {
		super(ids);
		this.ids = ids;
	}

	@Override
	protected void test1() {
		System.out.println("---son test1---");
	}
}