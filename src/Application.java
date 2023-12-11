import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Application {

	public static void main(String[] args) {
System.out.println(" Hello World");

List<Integer> newInts = new ArrayList<>();
newInts.add(894);
newInts.add(-1);
newInts.add(1077);
newInts.add(43);
newInts.add(54329);

Collections.sort(newInts);
System.out.println(newInts);
}}



