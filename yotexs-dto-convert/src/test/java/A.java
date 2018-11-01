public class A {
	// @Mapping("bname")
	private String aname;

	private String code;

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "A [aname=" + aname + "]";
	}

	public A() {
		super();
		// TODO Auto-generated constructor stub
	}

}
