package adapter;

public class PrinterClient {
	private Printer printer;
	private String prefix;
	
	public void print(String text, String type)
	{
		switch (type)
		{
		case "legacy":
			printer = new LegacyPrinterAdapter();
			prefix = "Impressora Legado: ";
			break;
		case "modern":
			printer = new ModernPrinter();
			prefix = "Impressora Moderna: ";
			break;
		default:
			System.out.println("Tipo inválido de impressora");
			return;
		}
		
		printer.print(prefix + text);
	}
}
