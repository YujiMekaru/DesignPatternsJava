package adapter;

public class LegacyPrinterAdapter implements Printer {

	private LegacyPrinter legacyPrinter;
	
	public LegacyPrinterAdapter() {
		this.legacyPrinter = new LegacyPrinter();
	}
	
	public void print(String text) {
		this.legacyPrinter.printDocument(text.getBytes());
	}
}
