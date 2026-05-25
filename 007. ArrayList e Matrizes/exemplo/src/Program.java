import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Gabriel");
		list.add("Nicolas");
		list.add("Lucca");
		list.add("Andre");
		list.add("Anna");
		
		list.add(2, "Nicolle");
		
		System.out.println(list.size());
		
		for(String nome : list) {
			System.out.println(nome);
		}
		System.out.println("---------------------------------");
		
		list.removeIf(x -> x.charAt(0) == 'L');
		for(String nome : list) {
			System.out.println(nome);
		}
		System.out.println("---------------------------------");
		
		System.out.println("Index of Nicolle: " + list.indexOf("Nicolle"));
		System.out.println("---------------------------------");
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'N').collect(Collectors.toList());
		for(String x : result) {
			System.out.println(x);
		}
		System.out.println("---------------------------------");
		
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
	}
}