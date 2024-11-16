package adapter;

public class Main {

	public static void main(String[] args) {
		PrinterClient client = new PrinterClient();
		
		client.print("Teste", "modern");
	}

}
