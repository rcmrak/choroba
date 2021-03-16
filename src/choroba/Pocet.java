package choroba;

public class Pocet {

	public Pocet(int pocetNakazenych, int pocetVylezenych, int pocetUmrti, int pocetTestu, int pocetAgTestu) {
		super();
		this.pocetNakazenych = pocetNakazenych;
		this.pocetVylezenych = pocetVylezenych;
		this.pocetUmrti = pocetUmrti;
		this.pocetTestu = pocetTestu;
		this.pocetAgTestu = pocetAgTestu;
	}

	int pocetNakazenych;
	int pocetVylezenych;
	int pocetUmrti;
	int pocetTestu;
	int pocetAgTestu;

	public int getPocetNakazenych() {
		return pocetNakazenych;
	}

	public void setPocetNakazenych(int pocetNakazenych) {
		this.pocetNakazenych = pocetNakazenych;
	}

	public int getPocetVylezenych() {
		return pocetVylezenych;
	}

	public void setPocetVylezenych(int pocetVylezenych) {
		this.pocetVylezenych = pocetVylezenych;
	}

	public int getPocetUmrti() {
		return pocetUmrti;
	}

	public void setPocetUmrti(int pocetUmrti) {
		this.pocetUmrti = pocetUmrti;
	}

	public int getPocetTestu() {
		return pocetTestu;
	}

	public void setPocetTestu(int pocetTestu) {
		this.pocetTestu = pocetTestu;
	}

	public int getPocetAgTestu() {
		return pocetAgTestu;
	}

	public void setPocetAgTestu(int pocetAgTestu) {
		this.pocetAgTestu = pocetAgTestu;
	}

}
