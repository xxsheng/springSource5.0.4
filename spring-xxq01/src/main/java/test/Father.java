package test;

public abstract class Father {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

//	public Father() {
//		System.out.println("no param constructor");
//	}

	public Father(int id) {
		this.id = id;
		System.out.println("param constructor");
	}
}

