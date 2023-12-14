package assignments;

class bankss

{
	int bno;
	String bname, bloc;
	public int getBno() {
		return bno;
	}

	public String getBname() {
		return bname;
	}

	public String getBloc() {
		return bloc;
	}

	bankss (int bno, String bname, String bloc)
	{
		this.bno= bno;
		this.bname= bname;
		this.bloc=bloc;
	}
}

public class A7_Bank {
	
		bankss s = new bankss(124, "SBI", "Amravati");

}
