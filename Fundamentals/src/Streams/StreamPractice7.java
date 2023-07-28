package Streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPractice7 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// pratice on streams

		// 1. Integer stream
		intStream();

		// 2. Integer stream with skip..
		intStreamWithSkip();

		// 3. Integer Stream SUm
		intStreamSum();

		// 4. Stream.of, sorted and findFirst
		streamOfSortedFindFirst();

		// 5. Stream from an Array ,sort , filter and print..
		streamFromArraySortFilterPrint();

		// 6. Average of squares of an int array
		averageOfSquaresOfIntArray();

		// 7. Stream from list, filter and print..
		streamFromListFilterPrint();

		// 8. Stream from text file, sorted, filter, forEach
		streamFromTextFileSortedFilterForEach();

		// 9. Stream rows from text file and save to list
		streamRowsFromTextFileANdSaveToList();

		// 10. Stream rows from CSV file and Count also used try with resource
		streamRowsFromCsvFileAndCount();

		// 11. Stream rows from CSV file and Parse data from rows also used try with
		// resource
		streamRowsFromCsvFileAndParseData();

		// 12. Stream rows from CSV file and Store fields in HashMap also used try with
		// resource
		streamRowsFromCsvFileAndStoreFieldsInHashMap();

		// 13. Reduction Sum
		reductionSum();

	}

	private static void reductionSum() {
		// TODO Auto-generated method stub
		double total = Stream.of(7.3, 1.2, 5.6).reduce(0.00, (Double a, Double b) -> a + b);
		System.out.println("13. Reduction Sum: " + total);
		System.out.println();
	}

	private static void streamRowsFromCsvFileAndStoreFieldsInHashMap() {
		// TODO Auto-generated method stub
		try (Stream<String> rows = Files.lines(Paths.get("data.txt"));) {
			Map<String, Integer> map = new HashMap<>();
			System.out.println("12. Stream rows from CSV file and Store fields in HashMap: ");
			map = rows.map(x -> x.split(",")).filter(x -> x.length == 3).filter(x -> (Integer.parseInt(x[1]) > 15))
					.collect(Collectors.toMap(x -> x[0], x -> Integer.parseInt(x[1])));

			// iterate and print
			System.out.println(map);
			System.out.println();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void streamRowsFromCsvFileAndParseData() {
		// TODO Auto-generated method stub
		try (Stream<String> rows = Files.lines(Paths.get("data.txt"));) {
			System.out.println("11. Stream rows from CSV file and Parse data from rows: ");
			rows.map(x -> x.split(",")).filter(x -> x.length == 3)
					.forEach(x -> System.out.println(x[0] + " " + x[1] + " " + x[2]));

			System.out.println();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void streamRowsFromCsvFileAndCount() {
		// TODO Auto-generated method stub
		try (Stream<String> rows = Files.lines(Paths.get("data.txt"));) {
			System.out.print("10. Stream rows from CSV file and Count: ");
			int rowCount = (int) rows.map(x -> x.split(",")).filter(x -> x.length == 3).count();
			System.out.print(rowCount);
			System.out.println();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static void streamRowsFromTextFileANdSaveToList() throws IOException {
		// TODO Auto-generated method stub
		Stream<String> names = Files.lines(Paths.get("names.txt"));
		System.out.print("9. Stream rows from text file and save to list: ");
		List<String> list = names.filter(name -> name.contains("i")).collect(Collectors.toList());
		System.out.print(list);
		System.out.println();
		names.close();
	}

	private static void streamFromTextFileSortedFilterForEach() throws IOException {
		// TODO Auto-generated method stub
		Stream<String> names = Files.lines(Paths.get("names.txt"));
		System.out.print("8. Stream from text file, sorted, filter, forEach: ");
		names.sorted().filter(name -> name.length() > 6).map(name -> name + ", ").forEach(System.out::print);
		System.out.println();
		names.close();
	}

	private static void streamFromListFilterPrint() {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("Alapati", "Bargav", "Chandu", "Eswar", "Somesh", "Dinesh", "Ramesh",
				"Suresh", "Pandey", "Sandeep", "Pavan", "Krishna");
		System.out.print("7. Stream from list, filter and print: ");
		names.stream().map(String::toLowerCase).filter(name -> name.startsWith("s")).map(name -> name + ", ")
				.forEach(System.out::print);
		System.out.println();
	}

	private static void averageOfSquaresOfIntArray() {
		// TODO Auto-generated method stub
		System.out.print("6. Average of squares of an int array: ");
		Arrays.stream(new int[] { 2, 4, 6, 8, 10, 12 }).map(n -> n * n).average().ifPresent(System.out::print);
		System.out.println();
	}

	public static void intStream() {
		System.out.print("1. Integer stream: ");
		IntStream.range(1, 11).forEach(n -> System.out.print(n + " "));
		System.out.println();
	}

	public static void intStreamWithSkip() {
		System.out.print("2. Integer stream with skip: ");
		IntStream.range(1, 11).skip(5).forEach(n -> System.out.print(n + " "));
		System.out.println();
	}

	public static void intStreamSum() {
		System.out.print("3. Integer stream sum: " + IntStream.range(1, 5).sum());
		System.out.println();
	}

	public static void streamOfSortedFindFirst() {
		System.out.print("4.1 Stream.of, sorted: ");
		Stream.of("AD", "AB", "AC", "AZ", "Y", "aa", "AA").sorted().forEach(s -> System.out.print(s + " "));
		System.out.println();
		System.out.print("4.2 Stream.of, sorted and findFirst: ");
		Stream.of("AD", "AB", "AC", "AZ", "Y", "aa", "AA").sorted().findFirst().ifPresent(System.out::print);
		System.out.println();
	}

	public static void streamFromArraySortFilterPrint() {
		String names[] = { "Alapati", "Bargav", "Chandu", "Eswar", "Somesh", "Dinesh", "Ramesh", "Suresh", "Pandey",
				"Sandeep", "Pavan", "Krishna" };

		System.out.print(Arrays.stream(names).sorted()
				.collect(Collectors.joining(", ", "5.1 Stream from an Array ,sorted: ", ".")));
		System.out.println();
		System.out.print(Arrays.stream(names).sorted().filter(name -> name.startsWith("S"))
				.collect(Collectors.joining(", ", "5.2 Stream from an Array ,sorted , filter and print: ", ".")));

		System.out.println();
	}
}
