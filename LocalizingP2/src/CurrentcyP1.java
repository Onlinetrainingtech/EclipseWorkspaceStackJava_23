import java.text.NumberFormat;
import java.util.Locale;

public class CurrentcyP1 {

	public static void main(String[] args) {
		NumberFormat nft=NumberFormat.getCurrencyInstance(new Locale("de","DE"));
		String formatted=nft.format(100000);
		System.out.println(formatted);

	}

}
